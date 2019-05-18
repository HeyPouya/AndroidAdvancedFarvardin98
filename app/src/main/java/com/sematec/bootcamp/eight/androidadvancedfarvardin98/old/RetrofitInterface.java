package com.sematec.bootcamp.eight.androidadvancedfarvardin98.old;

import com.sematec.bootcamp.eight.androidadvancedfarvardin98.pojos.response.PrayTimesClass;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitInterface {

    @GET("timingsByCity")
    Observable<PrayTimesClass> getTimings(@Query("city") String city, @Query("country") String country, @Query("method") int method);
}
