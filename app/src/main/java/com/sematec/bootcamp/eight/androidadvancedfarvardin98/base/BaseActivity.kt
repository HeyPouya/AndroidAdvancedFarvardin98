package com.sematec.bootcamp.eight.androidadvancedfarvardin98.base

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {


    fun saveToShared(key: String, value: String) {
        // TODO : Write the code to save data in shared preferences
    }

    fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()


    }
}
