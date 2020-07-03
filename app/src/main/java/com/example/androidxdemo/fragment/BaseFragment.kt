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
        Log.d("BaseFragment", "$name: LifeCycle: onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("BaseFragment", "$name: LifeCycle: onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("BaseFragment", "$name: LifeCycle: onCreateView")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("BaseFragment", "$name: LifeCycle: onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d("BaseFragment", "$name: LifeCycle: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("BaseFragment", "$name: LifeCycle: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("BaseFragment", "$name: LifeCycle: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("BaseFragment", "$name: LifeCycle: onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("BaseFragment", "$name: LifeCycle: onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("BaseFragment", "$name: LifeCycle: onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("BaseFragment", "$name: LifeCycle: onDetach")
    }
}