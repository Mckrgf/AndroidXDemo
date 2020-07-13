package com.example.androidxdemo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.androidxdemo.R
import kotlinx.android.synthetic.main.fragment_example_b.*

class ExampleBFragment : BaseFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_example_b, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        bt_change.setOnClickListener {
            Navigation.findNavController(it).navigate(
                R.id.action_exampleBFragment_to_exampleCFragment
            )
        }
    }
}