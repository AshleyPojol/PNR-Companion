package com.example.pnrcompanion;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EWalletActivity extends AppCompatActivity {
    ImageButton imgButton;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstances){
        super.onCreate(savedInstances);
        setContentView(R.layout.activity_ewallet);

        btn = (Button) findViewById(R.id.button_COA);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Toast.makeText(EWalletActivity.this, "Go to the nearest Station", Toast.LENGTH_LONG).show();
            }
        });

        imgButton = (ImageButton) findViewById(R.id.imageButton_GCash);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Toast.makeText(EWalletActivity.this, "Redirecting you to GCash", Toast.LENGTH_SHORT).show();
            }
        });

        imgButton = (ImageButton) findViewById(R.id.imageButton_GrabPay);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Toast.makeText(EWalletActivity.this, "Redirecting you to GrabPay", Toast.LENGTH_SHORT).show();
            }
        });

        imgButton = (ImageButton) findViewById(R.id.imageButton_Paypal);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Toast.makeText(EWalletActivity.this, "Redirecting you to PayPal", Toast.LENGTH_SHORT).show();
            }
        });

        imgButton = (ImageButton) findViewById(R.id.imageButton_Visa);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Toast.makeText(EWalletActivity.this, "Redirecting you to Visa", Toast.LENGTH_SHORT).show();
            }
        });

        imgButton = (ImageButton) findViewById(R.id.imageButton_BPI);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Toast.makeText(EWalletActivity.this, "Redirecting you to BPI", Toast.LENGTH_SHORT).show();
            }
        });

        imgButton = (ImageButton) findViewById(R.id.imageButton_Bancnet);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Toast.makeText(EWalletActivity.this, "Redirecting you to BancNet", Toast.LENGTH_SHORT).show();
            }
        });

        imgButton = (ImageButton) findViewById(R.id.imageButton_Unionbank);
        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Toast.makeText(EWalletActivity.this, "Redirecting you to UnionBank", Toast.LENGTH_SHORT).show();
            }
        });

    }


}
