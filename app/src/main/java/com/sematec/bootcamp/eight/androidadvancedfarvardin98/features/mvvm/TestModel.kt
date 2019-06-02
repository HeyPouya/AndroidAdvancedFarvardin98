package com.sematec.bootcamp.eight.androidadvancedfarvardin98.features.mvvm

import io.reactivex.Observable

class TestModel {


    fun getData(): Observable<Int> {
        return Observable.just(1, 2)
    }
}