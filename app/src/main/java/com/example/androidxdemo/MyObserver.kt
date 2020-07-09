package com.example.androidxdemo

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

open class MyObserver : LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    open fun eventOnCreate() {
        Log.d(Companion.TAG, "$EVENT: ON_CREATE")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    open fun eventOnStart() {
        Log.d(Companion.TAG, "$EVENT: ON_START")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    open fun eventOnResume() {
        Log.d(Companion.TAG, "$EVENT: ON_RESUME")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    open fun eventOnPause() {
        Log.d(Companion.TAG, "$EVENT: ON_PAUSE")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    open fun eventOnStop() {
        Log.d(Companion.TAG, "$EVENT: ON_STOP")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    open fun eventOnDestory() {
        Log.d(Companion.TAG, "$EVENT: ON_DESTROY")
    }

    companion object {
        private const val TAG = "MyObserver"
        private const val EVENT = "Event"
    }
}