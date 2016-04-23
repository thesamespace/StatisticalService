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
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.thesamespace.statisticalservice.MemberActivity;
import com.example.thesamespace.statisticalservice.R;

/**
 * Created by thesamespace on 2016/4/23.
 */
public class FragmentMemberPhone extends Fragment implements RadioGroup.OnCheckedChangeListener {
    private Context context;
    private String content;
    private FragmentMemberInfoTable fragmentMemberInfoTable;
    private FragmentCalendar fragmentCalendar;

    public FragmentMemberPhone() {

    }

    @SuppressLint("ValidFragment")
    public FragmentMemberPhone(Context context, String content) {
        this.context = context;
        this.content = content;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_member_phone, container, false);

        RadioGroup radg_tabGroup = (RadioGroup) view.findViewById(R.id.radg_tabGroup);
        radg_tabGroup.setOnCheckedChangeListener(this);
        RadioButton rad_item01 = (RadioButton) view.findViewById(R.id.rad_item01);
        rad_item01.setChecked(true);
        return view;
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
