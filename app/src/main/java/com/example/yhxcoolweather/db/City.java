package com.example.yhxcoolweather.db;

import DataSupport;

/**
 * Created by Administrator on 2017-06-18.
 */

public class City {
    private int id;
    private  String cityName;   //市的名字
    private  int cityCode;     //市的代号
    private int provinceId;     //所属省的id值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
