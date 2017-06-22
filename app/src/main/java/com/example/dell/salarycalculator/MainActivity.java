package com.example.dell.salarycalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.dell.salarycalculator.fragment.FragmentView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentView fragmentView=new FragmentView();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment,fragmentView,"ADD").commit();
    }
}
