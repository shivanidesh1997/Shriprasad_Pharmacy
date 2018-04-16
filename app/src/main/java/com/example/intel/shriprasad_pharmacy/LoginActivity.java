package com.example.intel.shriprasad_pharmacy;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class LoginActivity extends AppCompatActivity {
    EditText e1, e2;
    Button b1;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        db = new DatabaseHelper(this);
        e1 = (EditText) findViewById(R.id.email1);
        e2 = (EditText) findViewById(R.id.pwd1);
        b1 = (Button) findViewById(R.id.login2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = e1.getText().toString();
                String password = e2.getText().toString();
                Boolean chkemailpass = db.emailpassword(email, password);
                if (chkemailpass == true)
                    Toast.makeText(getApplicationContext(), "Successfully Login", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "Wrong Email or Password", Toast.LENGTH_SHORT).show();



            }
        });

    }
    public void registerButtonClicked(View view) {
        Intent regIntent = new Intent(LoginActivity.this,SignActivity.class);
        startActivity(regIntent);
    }

    public void loginButtonClicked(View view) {
        Intent loginIntent = new Intent(LoginActivity.this,ItemActivity.class);
        startActivity(loginIntent);
    }

//    public  void loginButtonClicked(View view){
  //      Intent lIntent = new Intent(LoginActivity.this,MenuActivity.class);
    //    startActivity(lIntent);

    //}

}
