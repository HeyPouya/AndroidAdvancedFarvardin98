package com.sematec.bootcamp.eight.androidadvancedfarvardin98.features.mvvm

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.sematec.bootcamp.eight.androidadvancedfarvardin98.R
import com.sematec.bootcamp.eight.androidadvancedfarvardin98.base.BaseActivity
import io.reactivex.Observable
import kotlinx.android.synthetic.main.activity_test_mvvm.*

class TestMVVMActivity : BaseActivity() {


    lateinit var viewModel: TestViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_mvvm)

        viewModel = ViewModelProviders.of(this).get(TestViewModel::class.java)


        btn.setOnClickListener {
            requestData()
        }


        //Observer
        viewModel.observable.observe(this, Observer {
            Toast.makeText(this@TestMVVMActivity, "$it", Toast.LENGTH_LONG).show()
        })


    }


    fun requestData() {
        viewModel.getUser()
    }
}
