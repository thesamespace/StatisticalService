package com.example.thesamespace.statisticalservice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.thesamespace.statisticalservice.adapter.MemberListAdapter;

/**
 * Created by thesamespace on 2016/4/24.
 */
public class AddMemberActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addmember);
        initView();
    }

    private void initView() {
        ImageView img_back = (ImageView) findViewById(R.id.img_back);
        Button btn_addMember = (Button) findViewById(R.id.btn_addMember);
        if (img_back != null) {
            img_back.setOnClickListener(this);
        }
        if (btn_addMember != null) {
            btn_addMember.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.img_back:
                finish();
                break;
            case R.id.btn_addMember:
                finish();
                break;
        }
    }
}
