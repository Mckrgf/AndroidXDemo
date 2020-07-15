package com.example.androidxdemo

import android.app.Application
import com.example.androidxdemo.viewModel.FunctionViewModel

class App : Application() {


    override fun onCreate() {
        super.onCreate()
        app = this
        initFunctions()
        funtions

    }
    private fun initFunctions() {
        funtions.add(FunctionViewModel("内存泄漏",0))
        funtions.add(FunctionViewModel("navigation管理fragment堆栈，附带全局操作",1))
    }



    companion object {
        private var app: App? = null

        var funtions = mutableListOf<FunctionViewModel>()


        fun getMe(): App? {
            return app
        }


    }

}