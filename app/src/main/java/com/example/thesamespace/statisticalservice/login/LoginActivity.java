package com.example.thesamespace.statisticalservice.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.thesamespace.statisticalservice.MemberActivity;
import com.example.thesamespace.statisticalservice.R;
import com.example.thesamespace.statisticalservice.main.MainActivity;

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
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
                finish();
                break;
        }
    }
}

