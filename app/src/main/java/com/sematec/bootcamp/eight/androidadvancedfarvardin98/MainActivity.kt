package com.sematec.bootcamp.eight.androidadvancedfarvardin98

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import butterknife.BindView
import butterknife.ButterKnife

class MainActivity : AppCompatActivity() {

    var name : String? = ""


    @BindView(R.id.img)
    lateinit var img: ImageView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)



        name?.length
        name!!.length



    }

    fun testFunction(year: Int): Int {
        return 2019 - year
    }
    //(String name, String family, int age)
    fun testFunction2(name: String, family: String, age: Int) {

       // TODO : asdasdas

    }

}
