package com.example.lab3_5


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.lab3_5.databinding.FragmentThirdBinding

/**
 * A simple [Fragment] subclass.
 */
class ThirdFragment : Fragment() {

    lateinit var binding: FragmentThirdBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_third, container, false
        )
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.buttonFromThirdToFirst.setOnClickListener { v: View ->
            v.findNavController().navigate(R.id.action_thirdFragment_to_firstFragment)
        }
        binding.buttonFromThirdToSecond.setOnClickListener { v: View ->
            v.findNavController().navigate(R.id.action_thirdFragment_to_secondFragment)
        }
    }

}
