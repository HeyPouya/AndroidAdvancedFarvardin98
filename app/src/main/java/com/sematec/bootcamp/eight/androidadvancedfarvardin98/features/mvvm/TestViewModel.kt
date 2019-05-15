package com.sematec.bootcamp.eight.androidadvancedfarvardin98.features.mvvm

import androidx.lifecycle.MutableLiveData


//ViewModel
class TestViewModel {


    //Observable
    val observable = MutableLiveData<String>()


    fun getUser() {
        observable.value = "Pouya"
    }
}