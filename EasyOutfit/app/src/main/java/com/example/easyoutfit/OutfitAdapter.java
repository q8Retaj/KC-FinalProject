package com.example.easyoutfit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class OutfitAdapter extends ArrayAdapter<Outfits> {
List<Outfits> outfislist;

    public OutfitAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        outfislist = objects;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.item_row,parent,false);
        Outfits currentOutfits = outfislist.get(position);
        TextView outfitName = view.findViewById(R.id.textView2);

        ImageView imageView = view.findViewById(R.id.hImage);
       outfitName.setText(currentOutfits.getOutfitName());
         imageView.setImageResource(currentOutfits.getOutfitImg());
       return view;
    }
}
