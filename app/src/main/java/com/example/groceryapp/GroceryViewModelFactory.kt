//package com.example.groceryapp
//
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.ViewModelProvider
//
//class GroceryViewModelFactory(private val repositry: GroceryRepositry) : ViewModelProvider.NewInstanceFactory() {
//
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        return GroceryViewModel(repositry)as T
//    }
//}