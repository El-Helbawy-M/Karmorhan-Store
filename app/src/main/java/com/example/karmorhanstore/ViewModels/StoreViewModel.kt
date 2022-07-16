package com.example.karmorhanstore.ViewModels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.karmorhanstore.models.Shoes

class StoreViewModel:ViewModel (){
    private val  _products : MutableLiveData<MutableList<Shoes>> = MutableLiveData<MutableList<Shoes>>(
        mutableListOf(Shoes("Shoes 1", "Zara",40, "Nice Shoes"),
            Shoes("Shoes 2", "Adidas",42, "Fine Shoes"),
            Shoes("Shoes 3", "Nike",39, "New Shoes"),
            Shoes("Shoes 4", "Croco",20, "Fantastic Shoes"),
        )
    )

    val products : LiveData<MutableList<Shoes>>
        get() = _products

    init {
        Log.i("message","store view model created")
    }


    override fun onCleared() {
        super.onCleared()
        Log.i("message","store view model destroyed")
    }

    fun addNewShoes( name:String, company:String, size:Int, description:String):Boolean{
        var shoe = Shoes( name, company, size, description)
        if(shoe.checkInput()) {
            _products.value?.add(shoe)
            return true
        }
        return false
    }

}