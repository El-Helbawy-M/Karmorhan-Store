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
import com.example.karmorhanstore.databinding.FSignInBinding
import com.example.karmorhanstore.databinding.FSignUpBinding

class SignUpFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding : FSignUpBinding = DataBindingUtil.inflate(inflater,R.layout.f_sign_up,container,false)
        binding.signUpBtn.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_signUpFragment_to_onBoardingWelcomeFragment))
        binding.checkBtn.setOnClickListener(View.OnClickListener { binding.root.findNavController().popBackStack() })
        return binding.root
    }

}