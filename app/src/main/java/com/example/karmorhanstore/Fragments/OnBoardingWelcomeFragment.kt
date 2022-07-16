package com.example.karmorhanstore.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.karmorhanstore.R
import com.example.karmorhanstore.databinding.FOnBoardingWelcomeBinding
import com.example.karmorhanstore.databinding.FSignUpBinding

class OnBoardingWelcomeFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding : FOnBoardingWelcomeBinding = DataBindingUtil.inflate(inflater,R.layout.f_on_boarding_welcome,container,false)
        binding.nextBtn.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_onBoardingWelcomeFragment_to_onBoardingInstructionFragment))
        return binding.root
    }

}