package com.example.timeapp.time_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class ui extends AppCompatActivity {
    Spinner spinneruse;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);


        spinneruse=(Spinner) findViewById(R.id.spinner);
        spinneruse.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                switch (position)
                {
                    case 0:
                        Toast.makeText(getApplication(),"profile user",Toast.LENGTH_LONG).show();
                        break;

                    case 1:
                        Toast.makeText(getApplication(),"task",Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        Toast.makeText(getApplication(),"remainder",Toast.LENGTH_LONG).show();
                        break;
                    case 3:
                        Toast.makeText(getApplication(),"Logout",Toast.LENGTH_LONG).show();
                        break;

                    default:

                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //not reqired
            }
        });

    }
}