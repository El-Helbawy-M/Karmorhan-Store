package com.example.karmorhanstore.Activites

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.karmorhanstore.R
import com.example.karmorhanstore.ViewModels.StoreViewModel

class MainActivity : AppCompatActivity() {
    val viewModel:StoreViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.a_main)
        val navController = this.findNavController(R.id.main_nav_host)
        NavigationUI.setupActionBarWithNavController(this, navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.main_nav_host)
        if(navController.currentDestination!!.displayName !="com.example.karmorhanstore:id/storeFragment") return navController.navigateUp()
        return false
    }
}
