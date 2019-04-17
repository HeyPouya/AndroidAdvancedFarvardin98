package com.sematec.bootcamp.eight.androidadvancedfarvardin98

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_test_kotlin.*

class TestKotlinActivity : AppCompatActivity() {

    private var a = "Pouya"
    private val b = ArrayList<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_kotlin)

        b.add("asd")

        //txt.setText("Pouya")
        txt.text = "Pouya"
        val name = txt.text.toString()
    }
}
