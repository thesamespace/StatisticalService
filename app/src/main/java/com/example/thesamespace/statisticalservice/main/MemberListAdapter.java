package com.example.thesamespace.statisticalservice.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thesamespace.statisticalservice.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thesamespace on 2016/4/23.
 */
public class MemberListAdapter extends BaseAdapter {
    private Context context;
    private List<Member> memberList = new ArrayList<>();

    public MemberListAdapter(Context context, List<Member> memberList) {
        this.context = context;
        this.memberList = memberList;
    }

    @Override
    public int getCount() {
        return memberList.size();
    }

    @Override
    public Object getItem(int position) {
        return memberList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_memberlist, parent, false);
            holder = new ViewHolder();
            holder.img_head = (ImageView) convertView.findViewById(R.id.img_head);
            holder.tv_name = (TextView) convertView.findViewById(R.id.tv_name);
            holder.tv_number = (TextView) convertView.findViewById(R.id.tv_number);
            holder.tv_type = (TextView) convertView.findViewById(R.id.tv_type);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.img_head.setImageResource(R.drawable.user);
        holder.tv_name.setText(memberList.get(position).getMemberName());
        holder.tv_number.setText("工号：" + memberList.get(position).getNumber());
        holder.tv_type.setText("类型：" + memberList.get(position).getType());
        return convertView;
    }

    class ViewHolder {
        ImageView img_head;
        TextView tv_name;
        TextView tv_number;
        TextView tv_type;
    }
}