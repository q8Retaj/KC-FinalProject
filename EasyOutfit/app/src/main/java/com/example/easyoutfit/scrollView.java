package com.example.easyoutfit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class scrollView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        CardView cardView1 = findViewById(R.id.accessory1);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(scrollView.this,MainActivity3.class);
                startActivity(intent1);

            }
        });
        CardView cardView2 = findViewById(R.id.accssory2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(scrollView.this,MainActivity4.class);
                startActivity(intent2);

            }
        });
        CardView cardView3 = findViewById(R.id.accessory3);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(scrollView.this,MainActivity5.class);
                startActivity(intent3);

            }
        });
        CardView cardView4 = findViewById(R.id.bag);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(scrollView.this,MainActivity6.class);
                startActivity(intent4);

            }
        });
        CardView cardView5 = findViewById(R.id.bag2);
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(scrollView.this,MainActivity7.class);
                startActivity(intent5);

            }
        });
        CardView cardView6 = findViewById(R.id.bag3);
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(scrollView.this,MainActivity8.class);
                startActivity(intent6);

            }
        });
        CardView cardView7 = findViewById(R.id.bag4);
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(scrollView.this,MainActivity9.class);
                startActivity(intent6);

            }
        });
        CardView cardView8 = findViewById(R.id.bag5);
        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent8 = new Intent(scrollView.this,MainActivity9.class);
                startActivity(intent8);

            }
        });
        CardView cardView9 = findViewById(R.id.bag6);
        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent9 = new Intent(scrollView.this,MainActivity9.class);
                startActivity(intent9);

            }
        });
    }

}