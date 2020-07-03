package com.example.androidxdemo.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

open class BaseFragment() : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("BaseFragment","LifeCycle: " + "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("BaseFragment","LifeCycle: " + "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("BaseFragment","LifeCycle: " + "onCreateView")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("BaseFragment","LifeCycle: " + "onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d("BaseFragment","LifeCycle: " + "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("BaseFragment","LifeCycle: " + "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("BaseFragment","LifeCycle: " + "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("BaseFragment","LifeCycle: " + "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("BaseFragment","LifeCycle: " + "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("BaseFragment","LifeCycle: " + "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("BaseFragment","LifeCycle: " + "onDetach")
    }
}