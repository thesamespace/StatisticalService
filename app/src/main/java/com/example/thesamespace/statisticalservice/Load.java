package com.example.thesamespace.statisticalservice;

import com.example.thesamespace.statisticalservice.adapter.Member;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thesamespace on 2016/4/24.
 */
public class Load {
    private String loadName;
    private String loadImgUrl;
    private List<Member> memberList = new ArrayList<>();

    public Load(){}

    public Load(String loadName, String loadImgUrl, List<Member> memberList) {
        this.loadName = loadName;
        this.loadImgUrl = loadImgUrl;
        this.memberList = memberList;
    }

    public String getLoadName() {
        return loadName;
    }

    public void setLoadName(String loadName) {
        this.loadName = loadName;
    }

    public String getLoadImgUrl() {
        return loadImgUrl;
    }

    public void setLoadImgUrl(String loadImgUrl) {
        this.loadImgUrl = loadImgUrl;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }
}
