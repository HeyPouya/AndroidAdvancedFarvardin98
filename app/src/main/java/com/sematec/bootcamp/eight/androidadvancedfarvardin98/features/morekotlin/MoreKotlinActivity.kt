package com.sematec.bootcamp.eight.androidadvancedfarvardin98.features.morekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sematec.bootcamp.eight.androidadvancedfarvardin98.R

class MoreKotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more_kotlin)


//        val list = ArrayList<Int>()
//        val list = arrayListOf<Int>()
//        val list = arrayOf(1, 2, 5)

        val list = arrayListOf("Qoli", "Ali", "Pouya")


        list.forEach {
            println(it)
        }


        for (i in 1..10) {
            println(i)
        }

        for (i in 10 downTo 0 step 2) {

        }


        val a = 10
        val b = 10
        val c = 10


        when (a) {

            1 -> {
            }
            2 -> {
            }
            3, 4, 5 -> {

            }
            else -> {

            }
        }


        when {
            a == 1 -> {
            }
            b > c -> {
            }
        }


        val d = if (b > c) {
            print("salam")
            //
            //
            10
        } else 5

    }


    fun check(x: Any) = when (x) {
        is String -> {
        }
        is Int -> {
        }
        else -> {
        }
    }

}
