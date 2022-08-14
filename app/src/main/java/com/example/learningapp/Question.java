package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Question extends AppCompatActivity implements View.OnClickListener
{

    ImageView questionImage;
    TextView option1, option2, option3, option4, result;
    TextView CorrectOption;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        option1 = findViewById(R.id.Option1);
        option2 = findViewById(R.id.Option2);
        option3 = findViewById(R.id.Option3);
        option4 = findViewById(R.id.Option4);
        result = findViewById(R.id.Result);
        questionImage = findViewById(R.id.questionImage);
        String questionNo = getIntent().getStringExtra("questionNo");
        switch (questionNo)
        {
            case "1":
                questionImage.setImageResource(R.drawable.q1);

                option1.setText("1. tiger");
                option2.setText("2. orange");
                option3.setText("3. fish");
                option4.setText("4. kite");

                CorrectOption = option4;
                break;

            case "2":
                questionImage.setImageResource(R.drawable.q2);
                option1.setText("1. rainbow");
                option2.setText("2. orange");
                option3.setText("3. kite");
                option4.setText("4. lion");

                CorrectOption = option1;
                break;

            case "3":
                questionImage.setImageResource(R.drawable.q3);
                option1.setText("1. lion");
                option2.setText("2. umbrella");
                option3.setText("3. tiger");
                option4.setText("4. cat");

                CorrectOption = option2;

                break;
            case "4":
                questionImage.setImageResource(R.drawable.q4);
                option1.setText("1. heart");
                option2.setText("2. ice cream");
                option3.setText("3. fish");
                option4.setText("4. apple");

                CorrectOption = option3;

                break;
            case "5":
                questionImage.setImageResource(R.drawable.q5);
                option1.setText("1. Lion");
                option2.setText("2. ice cream");
                option3.setText("3. heart");
                option4.setText("4. cat");

                CorrectOption = option1;

                break;
            case "6":
                questionImage.setImageResource(R.drawable.q6);
                option1.setText("1. ice cream");
                option2.setText("2. kite");
                option3.setText("3. heart");
                option4.setText("4. tiger");

                CorrectOption = option4;

                break;
            case "7":
                questionImage.setImageResource(R.drawable.q7);
                option1.setText("1. umbrella");
                option2.setText("2. cat");
                option3.setText("3. orange");
                option4.setText("4. van");

                CorrectOption = option3;

                break;
            case "8":
                questionImage.setImageResource(R.drawable.q8);
                option1.setText("1. cat");
                option2.setText("2. parrot");
                option3.setText("3. monkey");
                option4.setText("4. X-ray");

                CorrectOption = option1;

                break;

        }

        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == CorrectOption.getId())
        {
            result.setText("Well done! correct answer.");
        }
        else
        {
            result.setText("Oops! wrong answer. ");
        }
    }
}