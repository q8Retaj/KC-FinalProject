package com.example.easyoutfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {




    private Button Login;
    EditText email;
    EditText password;
    Button Btn1;
    TextView welcome;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.editTextTextEmailAddress);
        password = findViewById(R.id.editTextTextPersonName);
        Btn1= findViewById(R.id.button6);
        welcome = findViewById(R.id.textView);
        Login =findViewById(R.id.button);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);

            }
        });
    }
   public void go(View view) {
       String e = email.getText().toString();
       if (e.length() <= 0) {
           Toast.makeText(this, "please Enter your email first", Toast.LENGTH_SHORT).show();
       } else {
           Intent in = new Intent(MainActivity.this, LoginActivity.class);
           startActivity(in);

       }
   }
}