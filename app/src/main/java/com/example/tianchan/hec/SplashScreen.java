package com.example.tianchan.hec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread init = new Thread(){
            @Override
            public void run(){
                try{
                    sleep(4000);
                    Intent Start;
                    Start = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(Start);
                    finish();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        init.start();
    }
}
