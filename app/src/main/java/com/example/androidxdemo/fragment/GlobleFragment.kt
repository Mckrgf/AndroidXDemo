package com.example.androidxdemo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.androidxdemo.R
import com.example.androidxdemo.databinding.FragmentExampleCBinding
import com.example.androidxdemo.viewModel.FunctionViewModel

class GlobleFragment : BaseFragment(){
    var binding: FragmentExampleCBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentExampleCBinding.inflate(inflater,container,false)
        binding?.btJumpA?.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_exampleCFragment_to_globleStartAFragment)
        }
        binding?.btJumpB?.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_exampleCFragment_to_globleStartBFragment)

        }
        return binding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}