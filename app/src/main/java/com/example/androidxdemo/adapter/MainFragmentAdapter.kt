package com.example.androidxdemo.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.androidxdemo.fragment.ExampleBFragment
import com.example.androidxdemo.fragment.GlobleFragment
import com.example.androidxdemo.fragment.FunctionFragment

const val FUNCTION_PAGE_INDEX = 0
const val EXAMPLE_B_INDEX = 1
const val EXAMPLE_C_INDEX = 2

class MainFragmentAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    private val fragmensCreator : Map<Int,()->Fragment> = mapOf(
        FUNCTION_PAGE_INDEX to {FunctionFragment()},
        EXAMPLE_B_INDEX to {ExampleBFragment()},
        EXAMPLE_C_INDEX to { GlobleFragment() }
    )
    override fun getItemCount(): Int {
        return fragmensCreator.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmensCreator[position]?.invoke() ?: throw IndexOutOfBoundsException()
    }
}