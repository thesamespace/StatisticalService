package com.example.thesamespace.statisticalservice.fragment;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.thesamespace.statisticalservice.R;

/**
 * Created by thesamespace on 2016/4/23.
 */
public class FragmentMemberTablet extends Fragment {

    private String content;

    public FragmentMemberTablet() {

    }

    @SuppressLint("ValidFragment")
    public FragmentMemberTablet(String content) {
        this.content = content;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_member_tablet, container, false);
        return view;
    }
}
