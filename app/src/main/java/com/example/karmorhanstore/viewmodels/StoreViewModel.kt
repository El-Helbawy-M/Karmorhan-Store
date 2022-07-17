package com.example.karmorhanstore.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.karmorhanstore.models.Shoes

class StoreViewModel:ViewModel (){
    private val  _products : MutableLiveData<MutableList<Shoes>> = MutableLiveData<MutableList<Shoes>>(
        mutableListOf(Shoes("Shoes 1", "Zara","40", "Nice Shoes"),
            Shoes("Shoes 2", "Adidas","42", "Fine Shoes"),
            Shoes("Shoes 3", "Nike","39", "New Shoes"),
            Shoes("Shoes 4", "Croco","20", "Fantastic Shoes"),
        )
    )

    private var _product : MutableLiveData<Shoes> = MutableLiveData<Shoes>(Shoes("","","",""))

    val product :LiveData<Shoes>
        get() = _product
    val products : LiveData<MutableList<Shoes>>
        get() = _products

    init {
    }


    override fun onCleared() {
        super.onCleared()
    }

    fun addNewShoes():Boolean{
//        var shoe = Shoes( name, company, size, description)
        if(product.value!!.checkInput()) {
            _products.value?.add(product.value!!)
            _product = MutableLiveData<Shoes>(Shoes("","","",""))
            return true
        }
        return false
    }

}