package com.example.thesamespace.statisticalservice.adapter;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by thesamespace on 2016/4/11.
 */
public class LoadPagerAdapter extends PagerAdapter {
    private ArrayList<PagerItem> pagerItems = new ArrayList<>();

    public LoadPagerAdapter() {
    }

    public void addItem(String title,View view){
        pagerItems.add(new PagerItem(view,title));
    }

    public  PagerItem getItem(int position){
        return pagerItems.get(position);
    }

    public void removeItem(int positon){
        pagerItems.remove(positon);
    }

    public void clear(){
        pagerItems.clear();
    }

    @Override
    public int getCount() {
        return pagerItems.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((PagerItem) object).view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView(pagerItems.get(position).view);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return pagerItems.get(position).title;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ((ViewPager)container).addView(pagerItems.get(position).view);
        return pagerItems.get(position);
    }

    class PagerItem {
        View view;
        String title;

        PagerItem(View view, String title) {
            this.view = view;
            this.title = title;
        }
    }
}
