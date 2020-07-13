package com.example.androidxdemo.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidxdemo.App
import com.example.androidxdemo.MyObserver
import com.example.androidxdemo.R
import com.example.androidxdemo.adapter.FunctionAdapter
import com.example.androidxdemo.bean.Function
import com.example.androidxdemo.viewModel.FunctionListViewModel
import com.example.androidxdemo.viewModel.FunctionViewModel
import kotlinx.android.synthetic.main.fragment_function.*

class FunctionFragment : BaseFragment(){

    private val functionAdapter = FunctionAdapter()

    override fun onAttach(context: Context) {
        super.onAttach(context)
        val aa = Function("aaa",1)
        lifecycle.addObserver(aa)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_function, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initView()
        initFunctionsData()
    }

    private fun initView() {
        bt_add_function.setOnClickListener {
            App.funtions.add(FunctionViewModel("内存泄漏",0))
            functionAdapter.setList(App.funtions)
        }
    }

    private fun initFunctionsData() {
        rv_function.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        rv_function.adapter = functionAdapter
        functionAdapter.setList(FunctionListViewModel().functionList.value)
        functionAdapter.setOnItemClickListener { adapter, view, position ->
            when (App.funtions[position].id.value) {
                0 -> {
                    //跳转fragment
                    Navigation.findNavController(view).navigate(
                        R.id.action_mainFragment_to_memoryLeakUseCaseFragment,
                        Bundle().apply {
                            putString("name", "jenny")
                            putInt("age", 18)
                        })
                }
            }
        }
    }
}