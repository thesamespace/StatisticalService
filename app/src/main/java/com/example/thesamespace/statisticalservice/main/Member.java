package com.example.thesamespace.statisticalservice.main;

/**
 * Created by thesamespace on 2016/4/23.
 */
public class Member {
    private String memberName;
    private String number;
    private String type;

    public Member(String memberName, String number, String type) {
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
