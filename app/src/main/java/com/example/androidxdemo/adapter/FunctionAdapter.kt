package com.example.androidxdemo.adapter

import androidx.databinding.DataBindingUtil
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseDataBindingHolder
import com.example.androidxdemo.R
import com.example.androidxdemo.databinding.ItemFunctionViewBinding
import com.example.androidxdemo.viewModel.FunctionViewModel


class FunctionAdapter :
    BaseQuickAdapter<FunctionViewModel, BaseDataBindingHolder<ItemFunctionViewBinding>>(R.layout.item_function_view) {
    override fun convert(holder: BaseDataBindingHolder<ItemFunctionViewBinding>, item: FunctionViewModel) {
        holder.dataBinding?.functionViewModel = item
        holder.dataBinding?.executePendingBindings()
    }


}