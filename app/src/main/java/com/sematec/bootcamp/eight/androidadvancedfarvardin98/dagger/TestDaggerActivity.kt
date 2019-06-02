package com.sematec.bootcamp.eight.androidadvancedfarvardin98.dagger

import android.os.Bundle
import com.sematec.bootcamp.eight.androidadvancedfarvardin98.R
import com.sematec.bootcamp.eight.androidadvancedfarvardin98.base.BaseActivity

class TestDaggerActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_dagger)

//        val type = Type()
//        val engine = Engine(type)
//        val wheel = Wheel()
//        val car = CarClass(engine, wheel)
//        car.drive()


        val component = DaggerCarComponent.create()
        val car = component.getCar()
        car.drive()


    }
}
