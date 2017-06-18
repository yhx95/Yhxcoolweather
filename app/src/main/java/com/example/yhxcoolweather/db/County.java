package com.example.yhxcoolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017-06-18.
 */

public class County extends DataSupport{
    private int id;
    private  String countyName;   //县的名字
    private String weatherId;    //对应天气的id
    private int cityId;          //当前县所属市的id值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
