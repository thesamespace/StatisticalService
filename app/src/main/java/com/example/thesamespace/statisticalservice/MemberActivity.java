package com.example.thesamespace.statisticalservice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

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

        ImageView img_back = (ImageView) findViewById(R.id.img_back);
        ImageView img_edit = (ImageView) findViewById(R.id.img_edit);
        if (img_back != null) {
            img_back.setOnClickListener(this);
        }
        if (img_edit != null) {
            img_edit.setOnClickListener(this);
        }
        TextView tv_memberName = (TextView) findViewById(R.id.tv_memberName);
        if (tv_memberName != null) {
            tv_memberName.setText(member.getMemberName());
        }
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
