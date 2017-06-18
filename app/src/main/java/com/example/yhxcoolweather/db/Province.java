package com.example.yhxcoolweather.db;


import org.litepal.crud.DataSupport;
/**
 * Created by Administrator on 2017-06-18.
 */

public class Province extends DataSupport{
    private int id;    //实体中编号
    private String provinceName;   //省的名字
    private int provinceCode;    //省的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
