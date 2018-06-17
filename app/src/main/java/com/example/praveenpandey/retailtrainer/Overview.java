package com.example.praveenpandey.retailtrainer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Overview extends AppCompatActivity {

    public TextView overview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);

        findViewById(R.id.txtOverview);
    }

}
