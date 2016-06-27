package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {
    private TextView mMadLibsDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        mMadLibsDisplay = (TextView) findViewById(R.id.madLibsDisplay);
        Intent intent = getIntent();
        String verb = intent.getStringExtra("verb");
        String noun = intent.getStringExtra("noun");
        String adj = intent.getStringExtra("adj");
        mMadLibsDisplay.setText("One time a " + noun + " was " + verb + "ing,  but it was quite " + adj);

    }
}
