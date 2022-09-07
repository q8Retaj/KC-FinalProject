package com.example.easyoutfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ListView1 extends AppCompatActivity {
    ArrayList<Outfits> outfits=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        Outfits outfits1=new Outfits("White shirt",R.drawable.white,"White shirt with grey pant & gold necklace ");
        Outfits outfits2=new Outfits("White&brown",R.drawable.brown,"White shirt with black pant & brown bag from michel kors");
        Outfits outfits3=new Outfits("colorful",R.drawable.color,"colorful shirt with black pant");
        Outfits outfits4=new Outfits("pinky",R.drawable.pink,"pink shirt with  white pant & cutest bag from CHRISTIAN DIOR");
        Outfits outfit5=new Outfits("Orange",R.drawable.orange,"orange shirt with white pant & mini bag from Aldo");
        Outfits outfits6=new Outfits("Blacky",R.drawable.black,"black blazer with white pant & some gold accessories");

        outfits.add(outfits1);
        outfits.add(outfits2);
        outfits.add(outfits3);
        outfits.add(outfits4);
        outfits.add(outfit5);
        outfits.add(outfits6);
        Button more = findViewById(R.id.button2);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListView1.this,scrollView.class);
                startActivity(intent);
            }
        });
        OutfitAdapter adapter = new OutfitAdapter(this,0,outfits);
        ListView listView = findViewById(R.id.dress);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Outfits currentOutfits = outfits.get(i);
                Intent intent1 = new Intent(ListView1.this,DetailActvity.class);
                intent1.putExtra("Outfits",currentOutfits);
                startActivity(intent1);
            }
        });
    }
}