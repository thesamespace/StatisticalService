package com.example.thesamespace.statisticalservice.adapter;

/**
 * Created by thesamespace on 2016/4/23.
 */
public class Member {
    private int group;
    private float workTimeHours;
    private float workTimeDays;
    private String memberName;
    private int number;
    private String type;

    public Member(String memberName, int number, String type) {
        this.memberName = memberName;
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

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
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
}
