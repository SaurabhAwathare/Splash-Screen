package com.saurabhawathare.splashscreen01;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ScreenFlash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_screen_flash);

        // Optional: Enable edge-to-edge display support
        // EdgeToEdge.enable(this);

        Intent iHome = new Intent(ScreenFlash.this, MainActivity.class);

        new Handler().postDelayed(() -> {

            startActivity(iHome);
            finish();


        },4000);



    }
}