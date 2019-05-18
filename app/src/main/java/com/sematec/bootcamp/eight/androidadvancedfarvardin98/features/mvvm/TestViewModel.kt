package com.sematec.bootcamp.eight.androidadvancedfarvardin98.features.mvvm

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


//ViewModel
class TestViewModel : ViewModel() {

    val repository = TestModel()

    //Observable
    val observable = MutableLiveData<Int>()


    fun getUser() {

        repository.getData()
                .subscribe({
                    observable.value = it
                }, {
                    Log.d("OBSERVER", it.message)
                })
    }
}