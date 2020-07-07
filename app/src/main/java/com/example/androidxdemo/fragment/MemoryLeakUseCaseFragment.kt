package com.example.androidxdemo.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidxdemo.R

class MemoryLeakUseCaseFragment : BaseFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_memory_leak_use_case, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val aaa = arguments?.get("name")
        val bbb = arguments?.get("age")
        Log.d(TAG,"aaa : $aaa + bbb : $bbb")
    }
}