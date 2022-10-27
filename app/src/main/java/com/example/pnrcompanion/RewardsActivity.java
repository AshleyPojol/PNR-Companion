package com.example.pnrcompanion;

import static com.example.pnrcompanion.R.id.button_redeem;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RewardsActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstances) {
        super.onCreate(savedInstances);
        setContentView(R.layout.activity_rewards);

        btn = (Button) findViewById(R.id.button_discount);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RewardsActivity.this, "Claiming 25% Off Discount", Toast.LENGTH_LONG).show();
            }
        });

        btn = (Button) findViewById(R.id.button_buy);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RewardsActivity.this, "Redirecting you to Uniqlo App", Toast.LENGTH_LONG).show();
            }
        });

        btn = (Button) findViewById(R.id.button_free);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RewardsActivity.this, "Claiming Free Ride", Toast.LENGTH_LONG).show();
            }
        });

        btn = (Button) findViewById(R.id.button_fries);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RewardsActivity.this, "Claiming Free Jumbo Fries", Toast.LENGTH_LONG).show();
            }
        });

        btn = (Button) findViewById(R.id.button_redeem2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RewardsActivity.this, "Redirecting you to Mcdo App", Toast.LENGTH_LONG).show();
            }
        });

        btn = (Button) findViewById(R.id.button_redeem3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RewardsActivity.this, "Redirecting you to Jollibee App", Toast.LENGTH_LONG).show();
            }
        });

        btn = (Button) findViewById(R.id.button_redeem4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RewardsActivity.this, "Redirecting you to Food Panda App", Toast.LENGTH_LONG).show();
            }
        });

    }
}
