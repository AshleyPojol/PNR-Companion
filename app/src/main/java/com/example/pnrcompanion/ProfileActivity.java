package com.example.pnrcompanion;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {
    private Button btn_sch;
    private Button btn_sta;
    private Button btn_ewallet;
    private Button btn_promos;
    private Button btn_services;
    private Button btn_rewards;
    private Button btn_records;
    private Button btn_profile;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);

        btn_sch = (Button)findViewById(R.id.btn_sch);
        btn_sch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitySchedule();
            }
        });

        btn_sta = (Button)findViewById(R.id.btn_sta);
        btn_sta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityStation();
            }
        });

        btn_ewallet = (Button)findViewById(R.id.btn_ewallet);
        btn_ewallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityEwallet();
            }
        });

        btn_promos = (Button)findViewById(R.id.btn_promos);
        btn_promos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityPromos();
            }
        });

        btn_services = (Button)findViewById(R.id.btn_services);
        btn_services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityServices();
            }
        });

        btn_rewards = (Button)findViewById(R.id.btn_rewards);
        btn_rewards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityRewards();
            }
        });

        btn_records = (Button)findViewById(R.id.btn_records);
        btn_records.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityRecords();
            }
        });

        btn_profile = (Button)findViewById(R.id.btn_profile);
        btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityProfile();
            }
        });
    }

    private void openActivitySchedule() {
        Intent intent = new Intent(this, Schedule_Activity.class);
        startActivity(intent);
    }

    private void openActivityStation() {
        Intent intent = new Intent(this, Schedule_Activity.class);
        startActivity(intent);
    }

    private void openActivityEwallet() {
        Intent intent = new Intent(this, EWalletActivity.class);
        startActivity(intent);
    }

    private void openActivityPromos() {
        Intent intent = new Intent(this, RewardsActivity.class);
        startActivity(intent);
    }

    private void openActivityServices() {
        Intent intent = new Intent(this, ServiceActivity.class);
        startActivity(intent);
    }

    private void openActivityRewards() {
        Intent intent = new Intent(this, RewardsActivity.class);
        startActivity(intent);
    }

    private void openActivityRecords() {
        Intent intent = new Intent(this, Records_Activity.class);
        startActivity(intent);
    }

    private void openActivityProfile() {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

}