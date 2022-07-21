package com.example.spinner_main;

import java.util.ArrayList;

public class statemodel {
    int stateId, countryId;
    String stateName;
    ArrayList<citymodel> city;

    public statemodel(int stateId, int countryId, String stateName, ArrayList<citymodel> city) {
        this.stateId = stateId;
        this.countryId = countryId;
        this.stateName = stateName;
        this.city = city;
    }


    public String getStateName() {
        return stateName;
    }

    public ArrayList<citymodel>  getCity() {
        return city;
    }

}
