package com.waow.hmm.mp6.instant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    /** The logging tag for this class. */
    private final static String TAG = "MainActivity";
//    todo Matthew implement
//    /** The instance of the Quiz that the app is reading and writing to. */
//    private Quiz quizInstance;
    /**
     * Triggers when the app is initialized.
     * @param savedInstanceState a saved instance of the app that it is being initialized with.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
//      todo Matthew implement
//      quizInstance = new Quiz(appdata);
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
    /**
     * todo Riya description
     */
    public void openActivityQuestion() {
        Intent openQuestion = new Intent(this, Questions4Activity.class);
        startActivity(openQuestion);
    }
    /**
     * Triggers when the app is closed.
     * todo unused currently
     */
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
    }
    /**
     * Triggers when the app is moved out of focus.
     * todo unused currently
     */
    @Override
    protected void onPause()
    {
        super.onPause();
    }
    /**
     * Triggers when the app comes into focus
     * todo unused currently
     */
    @Override
    protected void onResume()
    {
        super.onResume();
    }
}
