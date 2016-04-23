package com.example.thesamespace.statisticalservice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.thesamespace.statisticalservice.R;
import com.example.thesamespace.statisticalservice.setting.SettingData;

public class SettingActivity extends AppCompatActivity implements View.OnClickListener {
    private SettingData settingData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        settingData = (SettingData) getApplication();
        init();
    }

    private void init() {
        readData();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void readData() {

    }
}
