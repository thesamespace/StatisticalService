package com.example.thesamespace.statisticalservice.fragment;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.thesamespace.statisticalservice.R;
import com.example.thesamespace.statisticalservice.adapter.Member;

/**
 * Created by thesamespace on 2016/4/23.
 */
public class FragmentMemberInfoTable extends Fragment implements View.OnClickListener {
    private Member member;
    private TextView tv_memberName;

    public FragmentMemberInfoTable() {

    }

    @SuppressLint("ValidFragment")
    public FragmentMemberInfoTable(Member member) {
        this.member = member;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_memberinfotable, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

        }
    }
}
