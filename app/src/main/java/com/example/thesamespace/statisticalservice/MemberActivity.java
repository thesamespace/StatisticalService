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

/**
 * Created by thesamespace on 2016/4/22.
 */
public class MemberActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener, View.OnClickListener {
    private FragmentMemberInfoTable fragmentMemberInfoTable;
    private FragmentCalendar fragmentCalendar;

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

        RadioGroup radg_tabGroup = (RadioGroup) findViewById(R.id.radg_tabGroup);
        radg_tabGroup.setOnCheckedChangeListener(this);
        RadioButton rad_item01 = (RadioButton) findViewById(R.id.rad_item01);
        rad_item01.setChecked(true);

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

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        FragmentTransaction fTransaction = getFragmentManager().beginTransaction();
        hideAllFragments(fTransaction);
        switch (checkedId) {
            case R.id.rad_item01:
                if (fragmentMemberInfoTable == null) {
                    fragmentMemberInfoTable = new FragmentMemberInfoTable("页面1");
                    fTransaction.add(R.id.fly_content, fragmentMemberInfoTable);
                } else {
                    fTransaction.show(fragmentMemberInfoTable);
                }
                break;
            case R.id.rad_item02:
                if (fragmentCalendar == null) {
                    fragmentCalendar = new FragmentCalendar("页面2");
                    fTransaction.add(R.id.fly_content, fragmentCalendar);
                } else {
                    fTransaction.show(fragmentCalendar);
                }
                break;
        }
        fTransaction.commit();
    }

    private void hideAllFragments(FragmentTransaction fragmentTransaction) {
        if (fragmentMemberInfoTable != null) fragmentTransaction.hide(fragmentMemberInfoTable);
        if (fragmentCalendar != null) fragmentTransaction.hide(fragmentCalendar);
    }


}
