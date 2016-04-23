package com.example.thesamespace.statisticalservice;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.thesamespace.statisticalservice.adapter.Member;
import com.example.thesamespace.statisticalservice.adapter.MemberListAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thesamespace on 2016/4/23.
 */
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener,View.OnClickListener {
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

        ImageView img_addMember= (ImageView) findViewById(R.id.img_addMember);
        img_addMember.setOnClickListener(this);
    }

    private List<Member> getMemberList() {
        List<Member> memberList = new ArrayList<>();
        memberList.add(new Member("唐美嫦0", 500, "A"));
        memberList.add(new Member("唐美嫦1", 501, "A"));
        memberList.add(new Member("唐美嫦2", 502, "A"));
        memberList.add(new Member("唐美嫦3", 503, "A"));
        memberList.add(new Member("唐美嫦4", 504, "A"));
        memberList.add(new Member("唐美嫦5", 505, "A"));
        memberList.add(new Member("唐美嫦6", 506, "A"));
        memberList.add(new Member("唐美嫦7", 507, "A"));
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

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.img_addMember:
                break;
        }
    }
}
