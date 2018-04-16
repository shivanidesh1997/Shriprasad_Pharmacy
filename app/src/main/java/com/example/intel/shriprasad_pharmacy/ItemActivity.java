package com.example.intel.shriprasad_pharmacy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);
    }
    public void aButtonClicked(View view) {
        Intent a = new Intent(ItemActivity.this, Analgesics.class);
        startActivity(a);
    }

    public void bButtonClicked(View view) {
        Intent bIntent = new Intent(ItemActivity.this, Antibiotics.class);
        startActivity(bIntent);
    }

    public void pButtonClicked(View view) {
        Intent pIntent = new Intent(ItemActivity.this, Antipyretics.class);
        startActivity(pIntent);
    }

    public void sButtonClicked(View view) {
        Intent sIntent = new Intent(ItemActivity.this, Antiseptics.class);
        startActivity(sIntent);
    }
}
