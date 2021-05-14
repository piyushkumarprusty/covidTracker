package com.example.covidtracker;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.leo.simplearcloader.SimpleArcLoader;

public class AffectedCountries extends AppCompatActivity {

    EditText edtSearch ;
    ListView listview;
    SimpleArcLoader simpleArcLoader;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affected_countries);

        edtSearch =findViewById(R.id.edtSearch);
        listview = findViewById(R.id.listView);
        simpleArcLoader = findViewById(R.id.loader);

founf the
    }
}