package com.example.androidxdemo.bean

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.OnLifecycleEvent
import com.example.androidxdemo.MyObserver

data class Function(var name: String, var id: Int
) : MyObserver() {
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    override fun eventOnResume() {
        Log.d(TAG,"Function类感知到Fragment生命周期： onResume")
    }

    companion object {
        private const val TAG = "Function"
    }
}