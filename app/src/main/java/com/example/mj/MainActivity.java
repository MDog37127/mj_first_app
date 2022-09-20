package com.example.mj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.mj.MESSAGE";
    public static final String EXTRA_MESSAGE2 = "com.example.mj.MESSAGE2";
    public static final String EXTRA_MESSAGE3 = "com.example.mj.MESSAGE3";
    public static final String EXTRA_MESSAGE4 = "com.example.mj.MESSAGE4";
    public static final String EXTRA_MESSAGE5 = "com.example.mj.MESSAGE5";
    public static final String EXTRA_MESSAGE6 = "com.example.mj.MESSAGE6";
    public static final String EXTRA_MESSAGE7 = "com.example.mj.MESSAGE7";
    public static final String EXTRA_MESSAGE8 = "com.example.mj.MESSAGE8";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = findViewById(R.id.noun);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        /**
        EditText editText2 = findViewById(R.id.random);
        String message2 = editText2.getText().toString();
        intent.putExtra(EXTRA_MESSAGE2, message2);
        EditText editText3 =  findViewById(R.id.adverb);
        String message3 = editText3.getText().toString();
        intent.putExtra(EXTRA_MESSAGE3, message3);
        EditText editText4 =  findViewById(R.id.adjective);
        String message4 = editText4.getText().toString();
        intent.putExtra(EXTRA_MESSAGE4, message4);
        EditText editText5 =  findViewById(R.id.random3);
        String message5 = editText5.getText().toString();
        intent.putExtra(EXTRA_MESSAGE5, message5);
        EditText editText6 = findViewById(R.id.verb);
        String message6 = editText6.getText().toString();
        intent.putExtra(EXTRA_MESSAGE6, message6);
        EditText editText7 = findViewById(R.id.random2);
        String message7 = editText7.getText().toString();
        intent.putExtra(EXTRA_MESSAGE7, message7);
        EditText editText8 = findViewById(R.id.random4);
        String message8 = editText8.getText().toString();
        intent.putExtra(EXTRA_MESSAGE8, message8);
         **/
        startActivity(intent);
    }
    public void sendForAdventure(View view) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
}