package com.example.imtia.adaptarpractice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    String [] countryNames;
    int [] flags = {R.drawable.bangladesh,R.drawable.canada,R.drawable.german};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = (ListView) findViewById(R.id.listViewId);
        countryNames = getResources().getStringArray(R.array.country_name);

        CustomAdapter adapter = new CustomAdapter(this,countryNames,flags);
        listview.setAdapter(adapter);


    }
}
