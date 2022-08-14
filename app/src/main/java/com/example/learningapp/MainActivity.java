package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    Button learn, quiz, repository;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //initializing buttons
        learn = findViewById(R.id.learn);
        quiz = findViewById(R.id.quiz);
        repository = findViewById(R.id.repository);

        //set on click listener
        learn.setOnClickListener(this);
        quiz.setOnClickListener(this);
        repository.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.learn:
                //if user wants to learn
                Intent intent = new Intent(MainActivity.this, Learn.class);
                startActivity(intent);
                break;
            case R.id.quiz:
                //if user wants to take quiz
                Intent intent2 = new Intent(MainActivity.this, Quiz.class);
                startActivity(intent2);
                break;
            case R.id.repository:
                //if user wants to visit repository
                Uri uri = Uri.parse("https://github.com/NimraHaq?tab=repositories");
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
                break;
        }
    }
}