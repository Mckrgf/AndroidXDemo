package com.example.androidxdemo.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.androidxdemo.App

class FunctionListViewModel {
    private var _functionList = MutableLiveData(App.funtions)
    var functionList : LiveData<MutableList<FunctionViewModel>> = _functionList
}