package com.example.androidxdemo.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidxdemo.R
import com.example.androidxdemo.SingletonTestManager
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_memory_leak_use_case.*

class MemoryLeakUseCaseFragment : BaseFragment(), SingletonTestManager.OnDataArrivedListener {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_memory_leak_use_case, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        getArgs()

        tv_use_case_a.setOnClickListener {
            staticView = View(activity)
            Snackbar.make(requireView(), "静态常量引用上下文，已经造成泄露", Snackbar.LENGTH_LONG).show()
        }

        tv_use_case_b.setOnClickListener {
            SingletonTestManager.getInstance().registerListener(this)
            Snackbar.make(requireView(), "单例模式引用上下文，已经造成泄露", Snackbar.LENGTH_LONG).show()
        }
    }

    /**
     * fragment之间传递参数
     */
    private fun getArgs() {
        val aaa = arguments?.get("name")

        val bbb = arguments?.get("age")
        Log.d(TAG, "aaa : $aaa + bbb : $bbb")
    }

    companion object{
        lateinit var staticView:View
    }

    override fun onDataArrived(data: Any) {
    }
}