package com.example.karmorhanstore.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.karmorhanstore.R
import com.example.karmorhanstore.databinding.FSignInBinding

class SignInFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var binding : FSignInBinding = DataBindingUtil.inflate(inflater,R.layout.f_sign_in,container,false)
        binding.signInBtn.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_signInFragment_to_onBoardingWelcomeFragment))
        binding.checkBtn.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_signInFragment_to_signUpFragment))
        return binding.root
    }

}