package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018\1\25 0025.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public int weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
