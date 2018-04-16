package com.example.intel.shriprasad_pharmacy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Antibiotics extends AppCompatActivity {
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antibiotics);
        listView = (ListView)findViewById(R.id.listView1);


        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(Antibiotics.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.antibiotics));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Intent intent = new Intent(Antibiotics.this,Amoxicillin.class);
                intent.putExtra("Antibiotics",listView.getItemAtPosition(i).toString());
                startActivity(intent);
            }
        });
        listView.setAdapter(mAdapter);
    }
}
