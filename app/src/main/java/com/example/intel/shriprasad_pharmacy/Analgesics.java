package com.example.intel.shriprasad_pharmacy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toolbar;

public class Analgesics extends AppCompatActivity {
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analgesics);
        listView = (ListView)findViewById(R.id.listView);


        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(Analgesics.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.analgesics));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Intent intent = new Intent(Analgesics.this,Codeine.class);
                intent.putExtra("Analgesics",listView.getItemAtPosition(i).toString());
                startActivity(intent);
            }
        });
        listView.setAdapter(mAdapter);
    }
    }
