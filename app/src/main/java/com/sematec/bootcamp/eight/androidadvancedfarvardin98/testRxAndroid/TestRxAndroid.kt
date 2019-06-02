package com.sematec.bootcamp.eight.androidadvancedfarvardin98.testRxAndroid

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.jakewharton.rxbinding2.widget.RxTextView
import com.sematec.bootcamp.eight.androidadvancedfarvardin98.R
import io.reactivex.android.schedulers.AndroidSchedulers
import kotlinx.android.synthetic.main.activity_test_rx_android.*
import java.util.concurrent.TimeUnit

class TestRxAndroid : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_rx_android)








        RxTextView.textChanges(edtSearch)
                .filter { it.length > 3 }
                .debounce(2, TimeUnit.SECONDS)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    Toast.makeText(this@TestRxAndroid, it.toString(), Toast.LENGTH_LONG).show()
                }, {
                    Log.d("TAAAG", it.message)
                })
    }
}
