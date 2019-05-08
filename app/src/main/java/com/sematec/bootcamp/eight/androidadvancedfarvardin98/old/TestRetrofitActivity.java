package com.sematec.bootcamp.eight.androidadvancedfarvardin98.old;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.sematec.bootcamp.eight.androidadvancedfarvardin98.R;
import com.sematec.bootcamp.eight.androidadvancedfarvardin98.pojos.response.PrayTimesClass;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TestRetrofitActivity extends AppCompatActivity {


    RetrofitInterface rInterface = RetrofitServiceGenerator.createService(RetrofitInterface.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_retrofit2);


        rInterface.getTimings("Tehran","Iran",8).enqueue(new Callback<PrayTimesClass>() {
            @Override
            public void onResponse(Call<PrayTimesClass> call, Response<PrayTimesClass> response) {

            }

            @Override
            public void onFailure(Call<PrayTimesClass> call, Throwable t) {

            }
        });


        //in a thread
//        rInterface.getTimings().execute().body().getData().getTimings().getMaghrib();

    }
}
