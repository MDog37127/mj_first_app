package com.example.mj;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String message2 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE2);
        String message3 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE3);
        String message4 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE4);
        String message5 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE5);
        String message6 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE6);
        String message7 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE7);
        String message8 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE8);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.nounspace);
        textView.setText(message);
        TextView textView2 = findViewById(R.id.verbspace);
        textView2.setText(message);
        TextView textView3 = findViewById(R.id.adverbspace);
        textView3.setText(message);
        TextView textView4 = findViewById(R.id.adjectivespace);
        textView4.setText(message);
        TextView textView5 = findViewById(R.id.random3space);
        textView5.setText(message);
        TextView textView6 = findViewById(R.id.randomspace);
        textView6.setText(message);
        TextView textView7 = findViewById(R.id.random2space);
        textView7.setText(message);
        TextView textView8 = findViewById(R.id.random4space);
        textView8.setText(message);
    }
}