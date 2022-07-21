package com.example.spinner_main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner countryspinner,statespinner,cityspinner;
    ArrayList<countrymodel> countries = new ArrayList<>();
    countryadapter countryadapter;
    stateadapter stateAdapter;
    cityadapter cityAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryspinner=findViewById(R.id.countryspinner);
        statespinner=findViewById(R.id.statespinner);
        cityspinner=findViewById(R.id.cityspinner);

        ArrayList<statemodel> state1 =new ArrayList<>();
        ArrayList<citymodel> city1 =new ArrayList<>();
        ArrayList<citymodel> city2 =new ArrayList<>();

        city1.add(new citymodel(1,1,1,"goregav"));
        city1.add(new citymodel(1,1,1,"pavai"));
        state1.add(new statemodel(1,1,"maharastra", city1));


        city2.add(new citymodel(2,2,2,"vadodara"));
        city2.add(new citymodel(2,2,2,"surat"));
        state1.add(new statemodel(2,2,"gujarat",city2));

        countries.add(new countrymodel('1',"india",state1));


        ArrayList<statemodel> state2 =new ArrayList<>();
        ArrayList<citymodel> city3 =new ArrayList<>();
        ArrayList<citymodel> city4 =new ArrayList<>();


        city3.add(new citymodel(1,1,1,"Alpine"));
        city3.add(new citymodel(1,1,1,"Trenton"));
        state2.add(new statemodel(1,1,"new jersey",city3));


        city4.add(new citymodel(2,2,2,"LA"));
        city4.add(new citymodel(2,2,2,"San Francisco"));
        state2.add(new statemodel(2,2,"California",city4));

        countries.add(new countrymodel('2',"usa",state2));


        countryadapter =  new countryadapter(this, countries);
        countryspinner.setAdapter(countryadapter);


        countryspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                countrymodel clickedItem = (countrymodel) adapterView.getItemAtPosition(i);
                String name = clickedItem.getCountryName();

                stateAdapter = new stateadapter(MainActivity.this, clickedItem.getState());
                statespinner.setAdapter(stateAdapter);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




        statespinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                statemodel clickedItem = (statemodel) adapterView.getItemAtPosition(i);
                String name = clickedItem.getStateName();

                cityAdapter = new cityadapter(MainActivity.this, clickedItem.getCity());
                cityspinner.setAdapter(cityAdapter);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



    }
}