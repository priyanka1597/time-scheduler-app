package com.example.timeapp.time_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.timeapp.time_app.R;
import com.example.timeapp.time_app.second;

import static com.example.timeapp.time_app.R.layout.activity_second;

public class first extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


    }
    public void onClick(View view) {
        startActivity(new Intent(this,second.class));

    }

    public void onClick1(View view) {
        startActivity(new Intent(this,ui.class));


    }



}
