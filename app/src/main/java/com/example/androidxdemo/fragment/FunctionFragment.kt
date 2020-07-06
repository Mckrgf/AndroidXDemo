package com.example.androidxdemo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidxdemo.App
import com.example.androidxdemo.R
import com.example.androidxdemo.adapter.FunctionAdapter
import kotlinx.android.synthetic.main.fragment_blank.*
import kotlinx.android.synthetic.main.fragment_function.*

class FunctionFragment : BaseFragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_function, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val functionAdapter = FunctionAdapter(App.funtions)
        rv_function.adapter = functionAdapter
        functionAdapter.setNewInstance(App.funtions)
    }
}