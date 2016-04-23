package com.example.thesamespace.statisticalservice.initilize;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.thesamespace.statisticalservice.login.LoginActivity;
import com.example.thesamespace.statisticalservice.R;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by thesamespace on 2016/4/22.
 */
public class InitilizeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initilize);
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(InitilizeActivity.this, LoginActivity.class));
                finish();
            }
        };

        Timer timer = new Timer();
        timer.schedule(timerTask, 1000);
    }
}
