package com.sematec.bootcamp.eight.androidadvancedfarvardin98.features.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sematec.bootcamp.eight.androidadvancedfarvardin98.R

class TestMVVMActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_mvvm)


        val viewModel = TestViewModel()
    }
}
