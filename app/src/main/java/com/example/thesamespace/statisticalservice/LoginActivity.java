package com.example.thesamespace.statisticalservice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edt_userName;
    private EditText edt_passWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView() {
        edt_passWord = (EditText) findViewById(R.id.edt_passWord);
        edt_userName = (EditText) findViewById(R.id.edt_userName);
        Button btn_login = (Button) findViewById(R.id.btn_login);
        if (btn_login != null) {
            btn_login.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                login();
                break;
        }
    }

    private void login() {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(LoginActivity.this, MainActivity2.class));
                finish();
            }
        };
        Timer timer = new Timer();
        timer.schedule(timerTask, 2000);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.prgb_loginWait);
        if (progressBar != null) {
            progressBar.setVisibility(View.VISIBLE);
        }
    }
}

