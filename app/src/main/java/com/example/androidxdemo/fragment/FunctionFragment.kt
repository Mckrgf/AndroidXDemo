package com.example.androidxdemo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidxdemo.App
import com.example.androidxdemo.R
import com.example.androidxdemo.adapter.FunctionAdapter
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
        rv_function.layoutManager = LinearLayoutManager(activity,LinearLayoutManager.VERTICAL,false)
        val functionAdapter = FunctionAdapter()
        rv_function.adapter = functionAdapter
        functionAdapter.setList(App.funtions)
        functionAdapter.setOnItemClickListener { adapter, view, position ->
            when (App.funtions[position].id.value) {
                0 -> {
                    //跳转fragment
                    Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_memoryLeakUseCaseFragment, Bundle().apply {
                        putString("name", "jenny")
                        putInt("age", 18)
                    })
                }
            }
        }
    }
}