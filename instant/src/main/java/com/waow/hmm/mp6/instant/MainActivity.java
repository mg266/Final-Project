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
        Button beginQuiz = (Button) findViewById(R.id.beginQuiz);
        beginQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "click");
                openActivityQuestion();
            }
        });

    }
    public void openActivityQuestion() {
        Intent openQuestion = new Intent(this, QuestionsActivity.class);
        startActivity(openQuestion);
    }
}
