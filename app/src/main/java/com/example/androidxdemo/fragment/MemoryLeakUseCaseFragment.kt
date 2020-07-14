package com.example.androidxdemo.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.androidxdemo.R
import com.example.androidxdemo.SingletonTestManager
import com.example.androidxdemo.databinding.FragmentMemoryLeakUseCaseBinding
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_memory_leak_use_case.*

class MemoryLeakUseCaseFragment : BaseFragment(), SingletonTestManager.OnDataArrivedListener {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentMemoryLeakUseCaseBinding.inflate(inflater,container,false)
        binding.tvUseCaseA.setOnClickListener {
            staticView = View(activity)
            Snackbar.make(requireView(), "静态常量引用上下文，已经造成泄露", Snackbar.LENGTH_LONG).show()
        }

        binding.tvUseCaseB.setOnClickListener {
            SingletonTestManager.getInstance().registerListener(this)
            Snackbar.make(requireView(), "单例模式引用上下文，已经造成泄露", Snackbar.LENGTH_LONG).show()
        }
        binding.tvUseCaseC.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_memoryLeakUseCaseFragment_to_exampleBFragment2)
        }
        getArgs()
        return binding.root
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