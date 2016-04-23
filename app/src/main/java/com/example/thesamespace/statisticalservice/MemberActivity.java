package com.example.thesamespace.statisticalservice;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.thesamespace.statisticalservice.fragment.FragmentCalendar;
import com.example.thesamespace.statisticalservice.fragment.FragmentMemberInfoTable;
import com.example.thesamespace.statisticalservice.fragment.FragmentMemberPhone;

/**
 * Created by thesamespace on 2016/4/22.
 */
public class MemberActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member);
        initView();
    }

    private void initView() {
        ImageView img_back = (ImageView) findViewById(R.id.img_back);
        ImageView img_edit = (ImageView) findViewById(R.id.img_edit);
        img_back.setOnClickListener(this);
        img_edit.setOnClickListener(this);

        FragmentMemberPhone fragmentMemberPhone = new FragmentMemberPhone();
        getFragmentManager().beginTransaction().add(R.id.fly_member, fragmentMemberPhone).commit();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.img_back:
                finish();
                break;
            case R.id.img_edit:

                break;
        }
    }
}
