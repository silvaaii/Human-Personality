package com.example.samsung.humanpersonality;

/**
 * Created by samsung on 15/11/2017.
 */
        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;

public class ContohKepribadian1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contoh_kepribadian1);
    }
    public void tokohEkstrovert(View view) {
        Intent intent = new Intent(ContohKepribadian1.this, Ekstrovert.class);
        startActivity(intent);
    }

}

