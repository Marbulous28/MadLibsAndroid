package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button mSubmitWords;
    private EditText mNoun;
    private EditText mVerb;
    private EditText mAdjective;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNoun = (EditText) findViewById(R.id.nounInput);
        mVerb = (EditText) findViewById(R.id.verbInput);
        mAdjective = (EditText) findViewById(R.id.adjInput);
        mSubmitWords = (Button) findViewById(R.id.submitWords);


        mSubmitWords.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String noun = mNoun.getText().toString();
                String verb = mVerb.getText().toString();
                String adj = mAdjective.getText().toString();
                Intent intent = new Intent(MainActivity.this, ResultsActivity.class);
                intent.putExtra("noun", noun);
                intent.putExtra("verb", verb);
                intent.putExtra("adj", adj);
                startActivity(intent);
            }
        });
    }
}
