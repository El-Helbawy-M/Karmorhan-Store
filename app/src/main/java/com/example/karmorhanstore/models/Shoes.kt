package com.example.karmorhanstore.models

data class Shoes( var name:String, var company:String, var size:Int = 0, var description:String){
    fun checkInput():Boolean{
        return !(this.name.isEmpty()||this.description.isEmpty()||this.company.isEmpty()||this.size==0)
    }
}

//{
//    lateinit var  label:String
//    lateinit var  name:String
//    var  size:Int = 0
//    lateinit var  company:String
//    lateinit var  description:String
//    init {
//        this.label = label
//        this.company = company
//        this.name = name
//        this.size = size
//        this.description = description
//    }
//
//}