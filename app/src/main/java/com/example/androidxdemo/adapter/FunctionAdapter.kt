package com.example.androidxdemo.adapter

import androidx.lifecycle.MutableLiveData
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
        holder.dataBinding?.tvFunction1?.setOnClickListener {
            item.name = MutableLiveData("哈哈" + holder.position)
            notifyItemChanged(holder.adapterPosition)
        }
    }


}