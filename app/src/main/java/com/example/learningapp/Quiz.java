package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Quiz extends AppCompatActivity {
    ArrayList<String> questions;
    ArrayAdapter<String> arrayAdapter;
    ListView listView;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        questions = new ArrayList<String>();
        questions.add("Solve Question # 1 ");
        questions.add("Solve Question # 2 ");
        questions.add("Solve Question # 3 ");
        questions.add("Solve Question # 4 ");
        questions.add("Solve Question # 5 ");
        questions.add("Solve Question # 6 ");
        questions.add("Solve Question # 7 ");
        questions.add("Solve Question # 8 ");

        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, questions);
        listView = findViewById(R.id.QuestionsListView);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String questionNo = Integer.toString(i + 1);
                intent = new Intent(Quiz.this, Question.class);
                intent.putExtra("questionNo", questionNo);
                startActivity(intent);
            }
        });
    }
}