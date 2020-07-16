package com.example.androidxdemo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.androidxdemo.R
import com.example.androidxdemo.databinding.FragmentExampleBBinding
import com.example.androidxdemo.databinding.FragmentExampleCBinding
import com.example.androidxdemo.databinding.FragmentGlobleEndBinding

class GlobleEndFragment : BaseFragment(){
    var binding: FragmentGlobleEndBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGlobleEndBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}