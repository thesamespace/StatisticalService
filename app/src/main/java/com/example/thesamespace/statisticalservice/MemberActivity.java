package com.example.thesamespace.statisticalservice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.thesamespace.statisticalservice.adapter.Member;
import com.example.thesamespace.statisticalservice.fragment.FragmentMemberPhone;

/**
 * Created by thesamespace on 2016/4/22.
 */
public class MemberActivity extends AppCompatActivity implements View.OnClickListener {
    private Member member;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getIntent().getExtras();
        member = (Member) bundle.get("member");
        setContentView(R.layout.activity_member);
        initView();
    }

    private void initView() {
        FragmentMemberPhone fragmentMemberPhone = new FragmentMemberPhone(member);
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
