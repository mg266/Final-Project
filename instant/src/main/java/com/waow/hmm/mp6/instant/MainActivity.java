package com.waow.hmm.mp6.instant;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity
{
    /** The logging tag for this class. */
    private final static String TAG = "MainActivity";
    /** Controls sound effect and music playback. */
    private MediaPlayer mediaPlayer;
//    //todo Matthew implement
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
//      //todo Matthew fix / implement
//        setContentView(R.layout.activity_main);
//        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.music.backgroundMusic);
//        mediaPlayer.setLooping(true);
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
                openActivityOptions();
            }
        });
        Button previousResults = findViewById(R.id.previousResults);
        previousResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "clicked previousResults");
                openActivityResults();
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
    /** Switches to the Question view. */
    public void openActivityQuestion() {
        Intent openQuestion = new Intent(this, Questions4Activity.class);
        startActivity(openQuestion);
    }
    /** Switches to the Options view. */
    public void openActivityOptions() {
        Intent openOptions = new Intent(this, OptionsActivity.class);
        startActivity(openOptions);
    }
    /** Switches to the Results view. */
    public void openActivityResults() {
        Intent openResults = new Intent(this, ResultsActivity.class);
        startActivity(openResults);
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
     */
    @Override
    protected void onPause()
    {
        super.onPause();
//        //todo Matthew fix
//        mediaPlayer.stop();
//        mediaPlayer.release();
    }
    /**
     * Triggers when the app comes into focus
     */
    @Override
    protected void onResume()
    {
        super.onResume();
//        //todo Matthew fix
//        mediaPlayer.start();
    }
}
