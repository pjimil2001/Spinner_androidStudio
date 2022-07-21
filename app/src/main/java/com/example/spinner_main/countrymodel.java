package com.example.spinner_main;

import java.util.ArrayList;
import java.util.List;

public class countrymodel {

        int countryId;
        String countryName;
        ArrayList<statemodel> state;

        public countrymodel(int countryId, String countryName, ArrayList<statemodel> state) {
            this.countryId = countryId;
            this.countryName = countryName;
            this.state = state;

    }
    public String getCountryName() {
        return countryName;
    }

    public ArrayList<statemodel> getState() {
        return state;
    }
}
