package com.example.androidxdemo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidxdemo.App
import com.example.androidxdemo.R
import com.example.androidxdemo.adapter.FunctionAdapter
import com.example.androidxdemo.databinding.FragmentFunctionBinding
import com.example.androidxdemo.viewModel.FunctionListViewModel
import com.example.androidxdemo.viewModel.FunctionViewModel
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class FunctionFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentFunctionBinding.inflate(inflater, container, false)
        initFunctionsData(binding.rvFunction)
        return binding.root
    }

    private fun initFunctionsData(rv_function: RecyclerView) {
        val functionAdapter = FunctionAdapter()
        rv_function.layoutManager =
            LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        rv_function.adapter = functionAdapter
        functionAdapter.setList(FunctionListViewModel().functionList.value)
        functionAdapter.setOnItemClickListener { _, view, position ->
            when (App.funtions[position].id.value) {
                0 -> {
                    //跳转fragment
                    Navigation.findNavController(view).navigate(
                        MainFragmentDirections.actionMainFragmentToMemoryLeakUseCaseFragment(
                            "测试",
                            1,
                            FunctionViewModel("测试功能", 2)
                        )
                    )
                }
                1 -> {
                    //跳转fragment
                    Snackbar.make(requireView(), "暂未开放", Snackbar.LENGTH_LONG).show()
                }
            }
        }
    }
}