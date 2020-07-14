package com.example.androidxdemo.fragment

import android.app.Activity
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

class FunctionFragment : BaseFragment(){

    private val functionAdapter = FunctionAdapter()
    lateinit var binding: FragmentFunctionBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFunctionBinding.inflate(inflater,container,false)
        initFunctionsData(binding.rvFunction)
        return binding.root
    }

    private fun initFunctionsData(rv_function : RecyclerView) {
        rv_function.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        rv_function.adapter = functionAdapter
        functionAdapter.setList(FunctionListViewModel().functionList.value)
        functionAdapter.setOnItemClickListener { adapter, view, position ->
            when (App.funtions[position].id.value) {
                0 -> {
                    //跳转fragment
                    Navigation.findNavController(view).navigate(
                        R.id.action_functionFragment_to_memoryLeakUseCaseFragment2,
                        Bundle().apply {
                            putString("name", "jenny")
                            putInt("age", 18)
                        })
//                    val productFragment =MemoryLeakUseCaseFragment()
//
//                    activity?.supportFragmentManager
//                        ?.beginTransaction()
//                        ?.addToBackStack("product")
//                        ?.replace(
//                            R.id.aaa,
//                            productFragment, null
//                        )?.commit()
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding.unbind()
    }
}