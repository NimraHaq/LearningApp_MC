package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class AlphabetImages extends AppCompatActivity
{
    ImageView img;
    int imgId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_images);
        img = findViewById(R.id.Alphabet);

        imgId = getIntent().getIntExtra("image", R.drawable.a);
        img.setImageResource(imgId);


    }
}