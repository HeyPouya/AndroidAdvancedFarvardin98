package com.sematec.bootcamp.eight.androidadvancedfarvardin98.features.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import com.sematec.bootcamp.eight.androidadvancedfarvardin98.R
import kotlinx.android.synthetic.main.activity_test_mvvm.*

class TestMVVMActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_mvvm)
        val viewModel = TestViewModel()

        btn.setOnClickListener {
            viewModel.getUser()
        }


        //Observer
        viewModel.observable.observe(this, Observer {
            Toast.makeText(this@TestMVVMActivity, it, Toast.LENGTH_LONG).show()
        })
    }
}
