package com.sematec.bootcamp.eight.androidadvancedfarvardin98.old

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.sematec.bootcamp.eight.androidadvancedfarvardin98.R
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class TestRetrofitActivity : AppCompatActivity() {


    private var rInterface = RetrofitServiceGenerator.createService(RetrofitInterface::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_retrofit2)


        rInterface.getTimings("Tehran", "Iran", 8)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    Log.d("TAAAAG", it.data.timings.isha)
                }, {
                    Log.d("TAAAAG", it.message)

                })


        //in a thread
        //        rInterface.getTimings().execute().body().getData().getTimings().getMaghrib();

    }
}
