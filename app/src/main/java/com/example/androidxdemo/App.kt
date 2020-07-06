package com.example.androidxdemo

import android.app.Application
import com.example.androidxdemo.bean.Function

class App : Application() {


    override fun onCreate() {
        super.onCreate()
        app = this
        initFunctions()
        funtions

    }
    private fun initFunctions() {
        funtions.add(Function("内存泄漏",0))
    }



    companion object {
        private var app: App? = null

        var funtions = mutableListOf<Function>()


        fun getMe(): App? {
            return app
        }


    }

}