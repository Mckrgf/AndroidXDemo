package com.example.androidxdemo.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.io.Serializable

/**
 * Create by 姚冰
 * on 2020/7/12
 */
class FunctionViewModel(name: String, id: Int) : ViewModel(), Serializable {
    private var _name = MutableLiveData(name)
    private var _id = MutableLiveData(id)

    var name: LiveData<String> = _name
    var id: LiveData<Int> = _id
}