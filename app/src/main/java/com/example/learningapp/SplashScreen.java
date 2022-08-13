package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
        Thread thread = new Thread()  //used for multitasking
        {
            public void run()
            {
                try {
                    sleep(3000); //3 seconds sleep.errr in this code block cause exception in catch
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                finally { //this code will be executed
                    //intents are used to move from one activity to another
                    //Intent intent = new Intent(current activity, Activity we want to go to);

                    Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        thread.start();
    }
}