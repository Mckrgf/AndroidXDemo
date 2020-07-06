package com.example.androidxdemo.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

open class BaseFragment() : Fragment() {
    private val name = this.javaClass.simpleName
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(name, "$name: LifeCycle: onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(name, "$name: LifeCycle: onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(name, "$name: LifeCycle: onCreateView")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(name, "$name: LifeCycle: onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d(name, "$name: LifeCycle: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(name, "$name: LifeCycle: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(name, "$name: LifeCycle: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(name, "$name: LifeCycle: onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(name, "$name: LifeCycle: onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(name, "$name: LifeCycle: onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(name, "$name: LifeCycle: onDetach")
    }
}