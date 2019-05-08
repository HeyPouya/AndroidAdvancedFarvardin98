
package com.sematec.bootcamp.eight.androidadvancedfarvardin98.pojos.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Weekday_ {

    @SerializedName("en")
    @Expose
    private String en;

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

}
