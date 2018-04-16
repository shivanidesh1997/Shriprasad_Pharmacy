package com.example.intel.shriprasad_pharmacy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Antiseptics extends AppCompatActivity {
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antiseptics);
        listView = (ListView)findViewById(R.id.listView3);


        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(Antiseptics.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.antiseptics));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Intent intent = new Intent(Antiseptics.this,Septilon.class);
                intent.putExtra("Antiseptics",listView.getItemAtPosition(i).toString());
                startActivity(intent);
            }
        });
        listView.setAdapter(mAdapter);
    }
}