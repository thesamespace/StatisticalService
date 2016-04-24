package com.example.thesamespace.statisticalservice.fragment;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.thesamespace.statisticalservice.R;
import com.example.thesamespace.statisticalservice.adapter.Member;

/**
 * Created by thesamespace on 2016/4/23.
 */
public class FragmentMemberPhone extends Fragment implements RadioGroup.OnCheckedChangeListener, View.OnClickListener {
    private Context context;
    private Member member;
    private FragmentMemberInfoTable fragmentMemberInfoTable;
    private FragmentCalendar fragmentCalendar;
    private TextView tv_memberName;

    @SuppressLint("ValidFragment")
    FragmentMemberPhone() {

    }

    @SuppressLint("ValidFragment")
    public FragmentMemberPhone(Member member) {
        this.context = context;
        this.member = member;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_member_phone, container, false);

        RadioGroup radg_tabGroup = (RadioGroup) view.findViewById(R.id.radg_tabGroup);
        radg_tabGroup.setOnCheckedChangeListener(this);
        RadioButton rad_item01 = (RadioButton) view.findViewById(R.id.rad_item01);
        rad_item01.setChecked(true);

        ImageView img_back = (ImageView) view.findViewById(R.id.img_back);
        ImageView img_edit = (ImageView) view.findViewById(R.id.img_edit);
        if (img_back != null) {
            img_back.setOnClickListener(this);
        }
        if (img_edit != null) {
            img_edit.setOnClickListener(this);
        }
        tv_memberName = (TextView) view.findViewById(R.id.tv_memberName);
        tv_memberName.setText(member.getMemberName());
        return view;
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        FragmentTransaction fTransaction = getFragmentManager().beginTransaction();
        hideAllFragments(fTransaction);
        switch (checkedId) {
            case R.id.rad_item01:
                if (fragmentMemberInfoTable == null) {
                    fragmentMemberInfoTable = new FragmentMemberInfoTable();
                    fTransaction.add(R.id.fly_content, fragmentMemberInfoTable);
                } else {
                    fTransaction.show(fragmentMemberInfoTable);
                }
                break;
            case R.id.rad_item02:
                if (fragmentCalendar == null) {
                    fragmentCalendar = new FragmentCalendar();
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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

        }
    }
}
