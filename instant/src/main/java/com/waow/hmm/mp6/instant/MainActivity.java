package com.waow.hmm.mp6.instant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    //@Override
    final String TAG = "MainActivity";
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button beginQuiz = findViewById(R.id.beginQuiz);
        beginQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "begin quiz");
                openActivityQuestion();
            }
        });
        Button optionsButton = findViewById(R.id.optionsButton);
        optionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "clicked optionsButton");
            }
        });
        Button previousResults = findViewById(R.id.previousResults);
        previousResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "clicked previousResults");
            }
        });

        //todo implement this and make it call the Wrapper class that Matthew is making
//        super.onCreate(savedInstanceState);
//
//        // Set up a queue for our Volley requests
//        requestQueue = Volley.newRequestQueue(this);
//
//        // Load the main layout for our activity
//        setContentView(R.layout.activity_main);
//
//        // Attach the handler to our UI button
//        final Button startAPICall = findViewById(R.id.startAPICall);
//        startAPICall.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(final View v) {
//                Log.d(TAG, "Start API button clicked");
//                startAPICall();
//            }
//        });
//
//        // Make sure that our progress bar isn't spinning and style it a bit
//        ProgressBar progressBar = findViewById(R.id.progressBar);
//        progressBar.setVisibility(View.INVISIBLE);
    }
    public void openActivityQuestion() {
        Intent openQuestion = new Intent(this, Questions4Activity.class);
        startActivity(openQuestion);
    }
}
