package com.example.thesamespace.statisticalservice;

import com.example.thesamespace.statisticalservice.adapter.Member;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thesamespace on 2016/4/24.
 */
public class Group {
    private int groupID;
    private String leaderName;
    private String loadName;
    private String loadPicUrl;
    private List<Member> memberList = new ArrayList<>();

    public Group(int groupID, String leaderName, String loadName) {
        this.groupID = groupID;
        this.leaderName = leaderName;
        this.loadName = loadName;
    }

    public Group(int groupID, String leaderName, String loadName, String loadPicUrl) {
        this.groupID = groupID;
        this.leaderName = leaderName;
        this.loadName = loadName;
        this.loadPicUrl = loadPicUrl;
    }

    public String getLeader() {
        return leaderName;
    }

    public void setLeader(String leaderName) {
        this.leaderName = leaderName;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }

    public void addMember(Member member) {
        this.memberList.add(member);
    }

    public String getLoadName() {
        return loadName;
    }

    public void setLoadName(String loadName) {
        this.loadName = loadName;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public String getLoadPicUrl() {
        return loadPicUrl;
    }

    public void setLoadPicUrl(String loadPicUrl) {
        this.loadPicUrl = loadPicUrl;
    }
}
