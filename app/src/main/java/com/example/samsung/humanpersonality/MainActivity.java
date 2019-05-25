package com.example.samsung.humanpersonality;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextIntrovert(View view) {
        Intent intent = new Intent(MainActivity.this, ContohKepribadian.class);
        startActivity(intent);
    }

    public void nextEkstrovert(View view) {
        Intent intent = new Intent(MainActivity.this, ContohKepribadian1.class);
        startActivity(intent);
    }

    public void nextAmbivert(View view) {
        Intent intent = new Intent(MainActivity.this, ContohKepribadian2.class);
        startActivity(intent);
    }

}

