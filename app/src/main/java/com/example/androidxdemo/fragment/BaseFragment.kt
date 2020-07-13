package com.example.androidxdemo.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.fragment.app.Fragment

open class BaseFragment() : Fragment() {
    private val name = this.javaClass.simpleName
    val TAG:String = name
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
//        unbindDrawables(requireView())
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

    open fun unbindDrawables(view: View) {
        if (view.background != null) {
            view.background.callback = null
        }
        if (view is ViewGroup && view !is AdapterView<*>) {
            for (i in 0 until view.childCount) {
                unbindDrawables(view.getChildAt(i))
            }
            view.removeAllViews()
        }
    }
}