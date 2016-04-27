package com.example.thesamespace.statisticalservice.adapter;

import java.io.Serializable;

/**
 * Created by thesamespace on 2016/4/23.
 */
public class Member implements Serializable {
    private int groupID;
    private float workTimeHours;
    private float workTimeDays;
    private String memberName;
    private String headImgUrl;
    private int number;
    private String type;

    public Member(int groupID, String memberName, String headImgUrl, int number, String type) {
        this.groupID = groupID;
        this.memberName = memberName;
        this.headImgUrl = headImgUrl;
        this.number = number;
        this.type = type;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public float getWorkTimeHours() {
        return workTimeHours;
    }

    public void setWorkTimeHours(float workTimeHours) {
        this.workTimeHours = workTimeHours;
    }

    public float getWorkTimeDays() {
        return workTimeDays;
    }

    public void setWorkTimeDays(float workTimeDays) {
        this.workTimeDays = workTimeDays;
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl;
    }
}
