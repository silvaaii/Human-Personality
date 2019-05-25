package com.example.samsung.humanpersonality;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
/**
 * Created by samsung on 13/11/2017.
 */
public class ContohKepribadian extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contoh_kepribadian);
    }
    public void tokohIntrovert(View view) {
        Intent intent = new Intent(ContohKepribadian.this, Introvert.class);
        startActivity(intent);
    }


}

