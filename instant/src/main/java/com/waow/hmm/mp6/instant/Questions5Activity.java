package com.waow.hmm.mp6.instant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Questions5Activity extends AppCompatActivity {

    final String TAG = "questions5Activity";
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions5);
        Button answerA = findViewById(R.id.answerA);
        answerA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "clicked A");
            }
        });
        Button answerB = findViewById(R.id.answerB);
        answerB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "clicked B");
            }
        });
        Button answerC = findViewById(R.id.answerC);
        answerC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "clicked C");
            }
        });
        Button answerD = findViewById(R.id.answerD);
        answerD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "clicked D");
            }
        });
        Button answerE = findViewById(R.id.answerD);
        answerD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "clicked E");
            }
        });
    }
}
