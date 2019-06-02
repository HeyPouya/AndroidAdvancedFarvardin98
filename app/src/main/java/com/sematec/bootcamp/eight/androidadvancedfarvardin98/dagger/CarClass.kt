package com.sematec.bootcamp.eight.androidadvancedfarvardin98.dagger

import android.util.Log
import javax.inject.Inject


class CarClass {


    @Inject
    constructor(engine: Engine, wheel: Wheel){
        //TODO
    }

    fun drive() {
        Log.d("CARCLASS", "Wo0o0o0o00om!")
    }
}