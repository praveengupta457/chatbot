package com.example.easychatbot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.airbnb.lottie.LottieAnimationView;

public class SplashScreen extends AppCompatActivity {
    int SPLASH_TIME=5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        LottieAnimationView animationView = findViewById(R.id.animationView);
        animationView.setAnimation(R.raw.splashanimation); // Set the animation source
        animationView.playAnimation(); // Start the animation
        animationView.loop(true); // Set loop to true

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashScreen.this,MainActivity.class);
                startActivity(intent);
            }
        },SPLASH_TIME);

    }
}