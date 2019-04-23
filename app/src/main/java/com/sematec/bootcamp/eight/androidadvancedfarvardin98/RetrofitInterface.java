package com.sematec.bootcamp.eight.androidadvancedfarvardin98;

import com.sematec.bootcamp.eight.androidadvancedfarvardin98.response.PrayTimesClass;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitInterface {

    @GET("timingsByCity")
    Call<PrayTimesClass> getTimings(@Query("city") String city, @Query("country") String country, @Query("method") int method);
}
