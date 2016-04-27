package com.example.thesamespace.statisticalservice;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.thesamespace.statisticalservice.adapter.Member;
import com.loopj.android.image.SmartImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thesamespace on 2016/4/23.
 */
public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    ListView lv_memberList;
    SmartImageView smartImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
    }

    private void initView() {
        ImageView img_addMember = (ImageView) findViewById(R.id.img_addMember);
        if (img_addMember != null) {
            img_addMember.setOnClickListener(this);
        }
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
                startActivity(new Intent(MainActivity2.this, AddMemberActivity.class));
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

    private List<Group> getGroupList() {
        List<Group> groupList = new ArrayList<>();
        groupList.add(new Group(1, "组长01", "亲仁西路", "http://pic15.nipic.com/20110628/3864212_150446097000_2.jpg"));
        groupList.add(new Group(2, "组长02", "亲仁东路", "http://pic1a.nipic.com/2008-10-24/20081024115246354_2.jpg"));
        groupList.add(new Group(3, "组长03", "亲仁北路", "http://pic3.nipic.com/20090717/2008853_100144068_2.jpg"));
        return groupList;
    }

    private List<Member> getMemberList(int gropID) {
        List<Member> memberList = new ArrayList<>();
        switch (gropID) {
            case 0:
                memberList.add(new Member(gropID, "唐美嫦0", "http://tx.haiqq.com/qqtouxiang/uploads/2014-02-15/032908103.jpg", 500, "A"));
                memberList.add(new Member(gropID, "唐美嫦1", "http://up.qqjia.com/z/14/tu17239_11.jpg", 501, "A"));
                memberList.add(new Member(gropID, "唐美嫦2", "http://thumb.webps.cn/i1/img/2/TB1Tj4NFVXXXXbPXFXXXXXXXXXX_!!0-item_pic.jpg_200x200.jpg", 502, "A"));
                memberList.add(new Member(gropID, "唐美嫦3", "http://thumb.webps.cn/i1/img/2/T1y67EFq4kXXXXXXXX_!!0-item_pic.jpg_200x200.jpg", 503, "A"));
                memberList.add(new Member(gropID, "唐美嫦4", "http://g.hiphotos.baidu.com/zhidao/wh%3D600%2C800/sign=81f99b86d300baa1ba794fbd7720952a/55e736d12f2eb93885942c98d7628535e4dd6fda.jpg", 504, "A"));
                memberList.add(new Member(gropID, "唐美嫦5", "http://up.qqjia.com/z/14/tu17239_9.jpg", 505, "A"));
                memberList.add(new Member(gropID, "唐美嫦6", "http://tx.haiqq.com/qqtouxiang/uploads/2015-05-15/094723651.jpg", 506, "A"));
                memberList.add(new Member(gropID, "唐美嫦7", "http://up.qqjia.com/z/14/tu17249_15.jpg", 507, "A"));
                break;
            case 1:
                memberList.add(new Member(gropID, "张三0", "http://img2.a0bi.com/upload/ttq/20160420/1461129996264.jpg", 600, "A"));
                memberList.add(new Member(gropID, "张三1", "http://ww4.sinaimg.cn/thumb180/d6176109jw1f2n1295hz1j20rs0rstaf.jpg", 601, "A"));
                memberList.add(new Member(gropID, "张三2", "http://img5.duitang.com/uploads/item/201603/13/20160313145445_AMUtP.png", 602, "A"));
                memberList.add(new Member(gropID, "张三3", "http://ww2.sinaimg.cn/thumb180/d6176109jw1f330vvtm9cj20h80gcjs9.jpg", 603, "A"));
                memberList.add(new Member(gropID, "张三4", "http://www.th7.cn/d/file/p/2016/04/22/960e2e4466b88c5990c052efff347507.jpg", 604, "A"));
                memberList.add(new Member(gropID, "张三5", "http://www.poluoluo.com/qq/UploadFiles_7828/201604/2016042219412712.jpg", 605, "A"));
                memberList.add(new Member(gropID, "张三6", "http://www.poluoluo.com/qq/UploadFiles_7828/201604/2016042219411801.jpg", 606, "A"));
                memberList.add(new Member(gropID, "张三7", "http://www.kfzimg.com/G00/M00/BC/12/oYYBAFbW8HuACm4ZAAAxilgK-6M792_b.jpg", 607, "A"));
                break;
            case 2:
                memberList.add(new Member(gropID, "李四0", "http://www.poluoluo.com/qq/UploadFiles_7828/201604/2016042219412723.jpg", 700, "A"));
                memberList.add(new Member(gropID, "李四1", "http://www.poluoluo.com/qq/UploadFiles_7828/201604/2016042219412744.jpg", 701, "A"));
                memberList.add(new Member(gropID, "李四2", "http://img5q.duitang.com/uploads/item/201506/02/20150602065134_siXQj.thumb.224_0.jpeg", 702, "A"));
                memberList.add(new Member(gropID, "李四3", "http://g.hiphotos.baidu.com/zhidao/wh%3D600%2C800/sign=a32e5446950a304e5277a8fce1f88bbe/30adcbef76094b36f29e3bafa1cc7cd98d109d67.jpg", 703, "A"));
                memberList.add(new Member(gropID, "李四4", "http://img5.duitang.com/uploads/item/201411/02/20141102091107_YTfe4.jpeg", 704, "A"));
                memberList.add(new Member(gropID, "李四5", "http://h.hiphotos.baidu.com/zhidao/wh%3D450%2C600/sign=05b045eca20f4bfb8c859650367f54c6/cdbf6c81800a19d83b8cae7635fa828ba61e4631.jpg", 705, "A"));
                memberList.add(new Member(gropID, "李四6", "http://img5.duitang.com/uploads/item/201411/01/20141101230029_rBAkE.thumb.224_0.jpeg", 706, "A"));
                memberList.add(new Member(gropID, "李四7", "http://dynamic-image.yesky.com/300x-/uploadImages/upload/20140826/1difnw1n0kxjpg.jpg", 707, "A"));
                break;
        }

        return memberList;
    }

}
