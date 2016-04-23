package com.example.thesamespace.statisticalservice.main;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.thesamespace.statisticalservice.MemberActivity;
import com.example.thesamespace.statisticalservice.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thesamespace on 2016/4/23.
 */
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lv_memberList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        lv_memberList = (ListView) findViewById(R.id.lv_memberList);
        MemberListAdapter memberListAdapter = new MemberListAdapter(MainActivity.this, getMemberList());
        lv_memberList.setAdapter(memberListAdapter);
        lv_memberList.setOnItemClickListener(this);
    }

    private List<Member> getMemberList() {
        List<Member> memberList = new ArrayList<>();
        memberList.add(new Member("唐美嫦0", "0500", "A"));
        memberList.add(new Member("唐美嫦1", "0501", "A"));
        memberList.add(new Member("唐美嫦2", "0502", "A"));
        memberList.add(new Member("唐美嫦3", "0503", "A"));
        memberList.add(new Member("唐美嫦4", "0504", "A"));
        memberList.add(new Member("唐美嫦5", "0505", "A"));
        memberList.add(new Member("唐美嫦6", "0506", "A"));
        memberList.add(new Member("唐美嫦7", "0507", "A"));
        return memberList;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        startActivity(new Intent(MainActivity.this, MemberActivity.class));
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        AlertDialog isExit = new AlertDialog.Builder(this).create();
        isExit.setTitle("退出提示");
        isExit.setMessage("确定要退出？");
        isExit.setButton("是", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        isExit.setButton2("否", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        isExit.show();
        return super.onKeyDown(keyCode, event);
    }
}
