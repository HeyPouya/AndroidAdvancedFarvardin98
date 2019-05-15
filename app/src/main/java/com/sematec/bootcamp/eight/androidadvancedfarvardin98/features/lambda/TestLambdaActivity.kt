package com.sematec.bootcamp.eight.androidadvancedfarvardin98.features.lambda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.sematec.bootcamp.eight.androidadvancedfarvardin98.R
import com.sematec.bootcamp.eight.androidadvancedfarvardin98.features.recycler.ClickHelper
import com.sematec.bootcamp.eight.androidadvancedfarvardin98.features.testmvp.Contract
import com.sematec.bootcamp.eight.androidadvancedfarvardin98.utils.StringUtils
import kotlinx.android.synthetic.main.activity_test_lambda.*

class TestLambdaActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_lambda)

        txt.setOnClickListener {
            it
        }

        val list = arrayListOf(1, 2, 3)

        val newList = arrayListOf("Ali", "Asghar")


        list.forEach {
            println(it)
        }


        val i = list[0]



        newList.forEach {
            println(it)
        }

        val a = list.filter {
            it >= 2
        }

        val x = 10
        val z = 20

        val sum = x.plus(z)

        val number = "10"


//        test(10,"Qoli")


    }


    fun test(a: Int, b: String, c: View.OnClickListener) {

    }


    fun getName() {
        val name = readLine().toString()
        val utils = StringUtils()
    }

}
