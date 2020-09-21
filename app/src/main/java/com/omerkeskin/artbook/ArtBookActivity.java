package com.omerkeskin.artbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class ArtBookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art_book);
    }

    public void onIvArtBookClicked(View view){
        System.out.println("Here");
    }

    public void onBtnSaveClicked(View view){
        System.out.println("Here btn");
    }


}