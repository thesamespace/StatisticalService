package com.example.thesamespace.statisticalservice;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.thesamespace.statisticalservice.adapter.Member;
import com.example.thesamespace.statisticalservice.adapter.MemberListAdapter;
import com.loopj.android.image.SmartImageView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by thesamespace on 2016/4/23.
 */
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, View.OnClickListener, ViewPager.OnPageChangeListener {
    ListView lv_memberList;
    private MainAdapter mainAdapter = new MainAdapter();
    private ViewPager vp_pager;
    MemberListAdapter memberListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initPager();
    }

    private void initView() {
        lv_memberList = (ListView) findViewById(R.id.lv_memberList);
        memberListAdapter = new MemberListAdapter(MainActivity.this, getMemberList(1));
        lv_memberList.setAdapter(memberListAdapter);
        lv_memberList.setOnItemClickListener(this);

        ImageView img_addMember = (ImageView) findViewById(R.id.img_addMember);
        if (img_addMember != null) {
            img_addMember.setOnClickListener(this);
        }
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void initPager() {
        vp_pager = (ViewPager) findViewById(R.id.vp_pager);
        for (Load load : getLoadList()) {
            SmartImageView smartImageView = new SmartImageView(this);
            smartImageView.setImageUrl(load.getLoadImgUrl());
            smartImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            smartImageView.setScaleType(SmartImageView.ScaleType.FIT_XY);
            mainAdapter.addItem(load.getLoadName(), smartImageView);
        }

        if (vp_pager != null) {
            vp_pager.setAdapter(mainAdapter);
            vp_pager.setOnPageChangeListener(this);
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(MainActivity.this, MemberActivity.class);
        intent.putExtra("member", (Serializable) parent.getItemAtPosition(position));
        startActivity(intent);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        AlertDialog isExit = new AlertDialog.Builder(this).create();
        isExit.setTitle("退出提示");
        isExit.setMessage("确定要退出？");
        isExit.setButton("是", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        isExit.setButton2("否", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        isExit.show();
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.img_addMember:
                startActivity(new Intent(MainActivity.this, AddMemberActivity.class));
                break;
        }
    }

    private List<Load> getLoadList() {
        List<Load> loadList = new ArrayList<>();
        loadList.add(new Load("亲仁西路", "http://pic15.nipic.com/20110628/3864212_150446097000_2.jpg", getMemberList(1)));
        loadList.add(new Load("亲仁东路", "http://pic1a.nipic.com/2008-10-24/20081024115246354_2.jpg", getMemberList(2)));
        loadList.add(new Load("亲仁北路", "http://pic3.nipic.com/20090717/2008853_100144068_2.jpg", getMemberList(3)));
        return loadList;
    }

    private List<Member> getMemberList(int gropID) {
        List<Member> memberList = new ArrayList<>();
        switch (gropID) {
            case 0:
                memberList.add(new Member(gropID + "唐美嫦0", "http://tx.haiqq.com/qqtouxiang/uploads/2014-02-15/032908103.jpg", 500, "A"));
                memberList.add(new Member(gropID + "唐美嫦1", "http://up.qqjia.com/z/14/tu17239_11.jpg", 501, "A"));
                memberList.add(new Member(gropID + "唐美嫦2", "http://thumb.webps.cn/i1/img/2/TB1Tj4NFVXXXXbPXFXXXXXXXXXX_!!0-item_pic.jpg_200x200.jpg", 502, "A"));
                memberList.add(new Member(gropID + "唐美嫦3", "http://thumb.webps.cn/i1/img/2/T1y67EFq4kXXXXXXXX_!!0-item_pic.jpg_200x200.jpg", 503, "A"));
                memberList.add(new Member(gropID + "唐美嫦4", "http://g.hiphotos.baidu.com/zhidao/wh%3D600%2C800/sign=81f99b86d300baa1ba794fbd7720952a/55e736d12f2eb93885942c98d7628535e4dd6fda.jpg", 504, "A"));
                memberList.add(new Member(gropID + "唐美嫦5", "http://up.qqjia.com/z/14/tu17239_9.jpg", 505, "A"));
                memberList.add(new Member(gropID + "唐美嫦6", "http://tx.haiqq.com/qqtouxiang/uploads/2015-05-15/094723651.jpg", 506, "A"));
                memberList.add(new Member(gropID + "唐美嫦7", "http://up.qqjia.com/z/14/tu17249_15.jpg", 507, "A"));
                break;
            case 1:
                memberList.add(new Member(gropID + "张三0", "http://img2.a0bi.com/upload/ttq/20160420/1461129996264.jpg", 600, "A"));
                memberList.add(new Member(gropID + "张三1", "http://ww4.sinaimg.cn/thumb180/d6176109jw1f2n1295hz1j20rs0rstaf.jpg", 601, "A"));
                memberList.add(new Member(gropID + "张三2", "http://img5.duitang.com/uploads/item/201603/13/20160313145445_AMUtP.png", 602, "A"));
                memberList.add(new Member(gropID + "张三3", "http://ww2.sinaimg.cn/thumb180/d6176109jw1f330vvtm9cj20h80gcjs9.jpg", 603, "A"));
                memberList.add(new Member(gropID + "张三4", "http://www.th7.cn/d/file/p/2016/04/22/960e2e4466b88c5990c052efff347507.jpg", 604, "A"));
                memberList.add(new Member(gropID + "张三5", "http://www.poluoluo.com/qq/UploadFiles_7828/201604/2016042219412712.jpg", 605, "A"));
                memberList.add(new Member(gropID + "张三6", "http://www.poluoluo.com/qq/UploadFiles_7828/201604/2016042219411801.jpg", 606, "A"));
                memberList.add(new Member(gropID + "张三7", "http://www.kfzimg.com/G00/M00/BC/12/oYYBAFbW8HuACm4ZAAAxilgK-6M792_b.jpg", 607, "A"));
                break;
            case 2:
                memberList.add(new Member(gropID + "李四0", "http://www.poluoluo.com/qq/UploadFiles_7828/201604/2016042219412723.jpg", 700, "A"));
                memberList.add(new Member(gropID + "李四1", "http://www.poluoluo.com/qq/UploadFiles_7828/201604/2016042219412744.jpg", 701, "A"));
                memberList.add(new Member(gropID + "李四2", "", 702, "A"));
                memberList.add(new Member(gropID + "李四3", "", 703, "A"));
                memberList.add(new Member(gropID + "李四4", "", 704, "A"));
                memberList.add(new Member(gropID + "李四5", "", 705, "A"));
                memberList.add(new Member(gropID + "李四6", "", 706, "A"));
                memberList.add(new Member(gropID + "李四7", "", 707, "A"));
                break;
        }

        return memberList;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {
        if (state == 2) {
            memberListAdapter = new MemberListAdapter(MainActivity.this, getMemberList(vp_pager.getCurrentItem()));
            lv_memberList.setAdapter(memberListAdapter);
        }
    }
}
