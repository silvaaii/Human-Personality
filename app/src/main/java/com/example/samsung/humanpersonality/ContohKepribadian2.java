package com.example.samsung.humanpersonality;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by samsung on 16/11/2017.
 */
public class ContohKepribadian2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contoh_kepribadian2);
    }

    public void tokohAmbivert(View view) {
        Intent intent = new Intent(ContohKepribadian2.this, Ambivert.class);
        startActivity(intent);
    }

}
