package com.example.fragment_introdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DescriptionActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        DescriptionFragment descriptionFragment = (DescriptionFragment) getSupportFragmentManager().findFragmentById(R.id.description_frag);
        descriptionFragment.setPosition_id(1);
    }
}
