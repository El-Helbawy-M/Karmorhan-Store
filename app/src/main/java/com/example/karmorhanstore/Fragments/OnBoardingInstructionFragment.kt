package com.example.karmorhanstore.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.karmorhanstore.R
import com.example.karmorhanstore.databinding.FOnBoardingInstructionBinding
import com.example.karmorhanstore.databinding.FOnBoardingWelcomeBinding

class OnBoardingInstructionFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        var binding : FOnBoardingInstructionBinding = DataBindingUtil.inflate(inflater,R.layout.f_on_boarding_instruction,container,false)
        binding.backBtn.setOnClickListener(View.OnClickListener { binding.root.findNavController().popBackStack() })
        binding.finishBtn.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_onBoardingInstructionFragment_to_storeFragment))
        return binding.root
    }

}