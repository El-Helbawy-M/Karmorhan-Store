package com.example.karmorhanstore.Fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.karmorhanstore.models.Shoes
import com.example.karmorhanstore.R
import com.example.karmorhanstore.viewmodels.StoreViewModel
import com.example.karmorhanstore.databinding.FStoreBinding
import com.example.karmorhanstore.databinding.IShoeItemViewBinding

class StoreFragment : Fragment() {
    val viewModel:StoreViewModel by activityViewModels()
    lateinit var binding:FStoreBinding
    lateinit var itemViewBinding:IShoeItemViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater,R.layout.f_store,container,false)
        viewModel.products.observe(viewLifecycleOwner, Observer {products ->
            for (index in 0.rangeTo(products.size-1)) {
                setState(products[index])
            }
        })
        binding.fab.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_storeFragment_to_productDetailFragment))
        setHasOptionsMenu(true)
        return binding.root
    }

    fun setState(shoe: Shoes){
        itemViewBinding = DataBindingUtil.inflate(LayoutInflater.from(this.activity),R.layout.i_shoe_item_view,binding.storeElementsList,false)
        itemViewBinding.shoe = shoe
        binding.storeElementsList.addView(itemViewBinding.root)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.sign_out_button, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }

}

