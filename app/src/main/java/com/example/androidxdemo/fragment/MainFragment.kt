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
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_blank.*

class MainFragment : BaseFragment() {
    private var rootView: View? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = inflater.inflate(R.layout.fragment_blank, container, false)
        return rootView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        //设置适配器，适配器负责fragment跳转，不需要在此页面维护viewpager中的fragment
        view_pager.adapter = MainFragmentAdapter(this)

        //设置tab，包括文字和图标
        TabLayoutMediator(tabs, view_pager) { tab, position ->
            tab.setIcon(getTabIcon(position))
            tab.text = getTabTitle(position)
        }.attach()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        view_pager.adapter = null
        tabs.removeAllTabs()
        rootView = null
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