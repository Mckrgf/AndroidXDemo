package com.example.androidxdemo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.androidxdemo.R
import com.example.androidxdemo.databinding.FragmentExampleBBinding
import com.example.androidxdemo.databinding.FragmentExampleCBinding
import com.example.androidxdemo.databinding.FragmentGlobleAbBinding

class GlobleStartAFragment : BaseFragment(){
    var binding: FragmentGlobleAbBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGlobleAbBinding.inflate(inflater,container,false)
        binding?.btJumpEnd?.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_global_globleEndFragment)
        }
        return binding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}