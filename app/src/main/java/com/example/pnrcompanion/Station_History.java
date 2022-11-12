package com.example.pnrcompanion;

import static com.example.pnrcompanion.R.id.btn_profile10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Station_History extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_station_history);

        Button btn1 = findViewById(R.id.btn_records10);
        Button btn2 = findViewById(R.id.btn_profile10);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Station_History.this, Records_Activity.class));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Station_History.this, Profile_Section_Activity.class));
            }
        });


    }
}