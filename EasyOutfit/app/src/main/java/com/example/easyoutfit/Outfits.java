package com.example.easyoutfit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.io.Serializable;


public class Outfits implements Serializable {
private String outfitName;
private int outfitImg;
private String outfitinfo;

    public Outfits(String outfitName, int outfitImg, String outfitinfo) {
        this.outfitName = outfitName;
        this.outfitImg = outfitImg;
        this.outfitinfo = outfitinfo;
    }

    public String getOutfitName() {
        return outfitName;
    }

    public void setOutfitName(String outfitName) {
        this.outfitName = outfitName;
    }

    public int getOutfitImg() {
        return outfitImg;
    }

    public void setOutfitImg(int outfitImg) {
        this.outfitImg = outfitImg;
    }

    public String getOutfitinfo() {
        return outfitinfo;
    }

    public void setOutfitinfo(String outfitinfo) {
        this.outfitinfo = outfitinfo;
    }
}


