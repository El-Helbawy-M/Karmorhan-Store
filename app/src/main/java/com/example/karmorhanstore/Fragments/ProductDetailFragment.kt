package com.example.karmorhanstore.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.example.karmorhanstore.R
import com.example.karmorhanstore.viewmodels.StoreViewModel
import com.example.karmorhanstore.databinding.FProductDetailBinding

class ProductDetailFragment : Fragment() {
    lateinit var binding:FProductDetailBinding
    val viewModel:StoreViewModel by activityViewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.f_product_detail,container,false)
        binding.cancelBtn.setOnClickListener(View.OnClickListener { binding.root.findNavController().popBackStack() })
        binding.addBtn.setOnClickListener(View.OnClickListener {
            if(viewModel.addNewShoes())
            binding.root.findNavController().popBackStack()
        })
        binding.viewModel=viewModel
        return binding.root
    }



}