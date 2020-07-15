package com.example.androidxdemo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.androidxdemo.R
import com.example.androidxdemo.adapter.EXAMPLE_B_INDEX
import com.example.androidxdemo.adapter.EXAMPLE_C_INDEX
import com.example.androidxdemo.adapter.FUNCTION_PAGE_INDEX
import com.example.androidxdemo.adapter.MainFragmentAdapter
import com.example.androidxdemo.databinding.FragmentBlankBinding
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_blank.*

class MainFragment : BaseFragment() {
    var binding: FragmentBlankBinding? = null
    var mediator:TabLayoutMediator? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlankBinding.inflate(inflater, container, false)
        //设置适配器，适配器负责fragment跳转，不需要在此页面维护viewpager中的fragment
        binding?.viewPager?.adapter = MainFragmentAdapter(this)

        //设置tab，包括文字和图标
        mediator = TabLayoutMediator(binding!!.tabs, binding!!.viewPager) { tab, position ->
            tab.setIcon(getTabIcon(position))
            tab.text = getTabTitle(position)
        }
        mediator?.attach()
        return binding!!.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding?.viewPager?.adapter = null //防止viewpageradapter在持有this引用的前提下onDestroyView（）导致内存泄漏

        //以下三行并不能阻止tabs的内存泄漏
//        binding?.tabs?.removeAllTabs()
//        binding?.tabs?.removeAllViews()
//        mediator?.detach()

        binding = null
    }

    private fun getTabIcon(position: Int): Int {
        return when (position) {
            FUNCTION_PAGE_INDEX -> R.drawable.functioin_list_tab_selector
            EXAMPLE_B_INDEX -> R.drawable.functioin_list_tab_selector
            EXAMPLE_C_INDEX -> R.drawable.functioin_list_tab_selector
            else -> throw IndexOutOfBoundsException()
        }
    }

    private fun getTabTitle(position: Int): String? {
        return when (position) {
            FUNCTION_PAGE_INDEX -> getString(R.string.function)
            EXAMPLE_B_INDEX -> getString(R.string.example_a)
            EXAMPLE_C_INDEX -> getString(R.string.example_b)
            else -> null
        }
    }

}