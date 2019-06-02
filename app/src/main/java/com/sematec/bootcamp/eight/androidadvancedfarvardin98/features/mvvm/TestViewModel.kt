package com.sematec.bootcamp.eight.androidadvancedfarvardin98.features.mvvm

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable


//ViewModel
class TestViewModel : ViewModel() {

    val repository = TestModel()

    val composite = CompositeDisposable()


    //Observable
    val observable = MutableLiveData<Int>()


    fun getUser() {
        composite.add(
                repository.getData()
                        .subscribe({
                            observable.value = it
                        }, {
                            Log.d("OBSERVER", it.message)
                        })
        )
    }


    override fun onCleared() {
        super.onCleared()
        composite.dispose()
    }
}