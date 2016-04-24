package com.example.thesamespace.statisticalservice;

import com.example.thesamespace.statisticalservice.adapter.Member;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thesamespace on 2016/4/24.
 */
public class Group {
    private Member leader;
    private Load load;
    private List<Member> memberList = new ArrayList<>();

    public Member getLeader() {
        return leader;
    }

    public void setLeader(Member leader) {
        this.leader = leader;
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

    public Load getLoad() {
        return load;
    }

    public void setLoad(Load load) {
        this.load = load;
    }
}
