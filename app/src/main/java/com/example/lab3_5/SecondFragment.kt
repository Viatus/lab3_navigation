package com.example.lab3_5


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.lab3_5.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_second, container, false
        )
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.buttonFromSecondToFirst.setOnClickListener { v: View ->
            v.findNavController().navigate(R.id.action_secondFragment_to_firstFragment)
        }
        binding.buttonFromSecondToThird.setOnClickListener { v: View ->
            v.findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)
        }
    }

}
