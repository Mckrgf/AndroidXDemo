package com.example.androidxdemo.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.example.androidxdemo.R
import com.example.androidxdemo.bean.Function

class FunctionAdapter(list: MutableList<Function>?) :
    BaseQuickAdapter<Function, BaseViewHolder>(R.layout.item_function_view, list) {
    override fun convert(helper: BaseViewHolder, item: Function) {
//        helper.setText(R.id.tv_function, "function: " + item.name)
    }
}