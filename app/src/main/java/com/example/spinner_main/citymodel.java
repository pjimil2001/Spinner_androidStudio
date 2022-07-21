package com.example.spinner_main;

public class citymodel {


    int cityId,stateId,CountryId;
    String cityName;

    public citymodel(int cityId, int stateId, int countryId, String cityName) {
        this.cityId = cityId;
        this.stateId = stateId;
        CountryId = countryId;
        this.cityName = cityName;


    }

    public String getCityName() {
        return cityName;
    }

}
