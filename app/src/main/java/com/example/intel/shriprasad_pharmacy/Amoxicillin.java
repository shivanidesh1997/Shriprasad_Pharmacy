package com.example.intel.shriprasad_pharmacy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Amoxicillin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amoxicillin);
    }
    public void placeButtonClicked(View view) {
        Intent placeIntent = new Intent(Amoxicillin.this, OrderActivity.class);
        startActivity(placeIntent);
    }
}

