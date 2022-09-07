package com.example.easyoutfit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActvity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_actvity);
        Bundle bundle = getIntent().getExtras();
        Outfits deliver = (Outfits) bundle.getSerializable("Outfits");
        TextView textVieww = findViewById(R.id.textView3);
        TextView texttView = findViewById(R.id.textView4);
        ImageView ImggView = findViewById(R.id.imageView);
        textVieww.setText(deliver.getOutfitName());
        texttView.setText(deliver.getOutfitinfo());
        ImggView.setImageResource(deliver.getOutfitImg());
    }
}