package com.sematec.bootcamp.eight.androidadvancedfarvardin98.features.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sematec.bootcamp.eight.androidadvancedfarvardin98.R
import kotlinx.android.synthetic.main.activity_test_recycler.*

class TestRecyclerActivity : AppCompatActivity(), ClickHelper {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_recycler2)

        val list = arrayListOf("Ali", "Mamad", "Taqi")
        recycler.adapter = RecyclerAdapter(list, this)
        recycler.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)


    }


    override fun clicked(name: String) {

        Toast.makeText(this, name, Toast.LENGTH_LONG).show()
    }

}
