package org.cy.coolweather.db;

import org.litepal.crud.LitePalSupport;

public class City extends LitePalSupport {

    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", cityName='" + cityName + '\'' +
                ", cityCode=" + cityCode +
                ", provinceId=" + provinceId +
                '}';
    }

    public City() {
    }

    public City(int id, String cityName, int cityCode, int provinceId) {
        this.id = id;
        this.cityName = cityName;
        this.cityCode = cityCode;
        this.provinceId = provinceId;
    }

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
