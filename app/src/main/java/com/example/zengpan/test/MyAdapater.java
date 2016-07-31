package com.example.zengpan.test;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import java.util.List;

/**
 * Created by Administrator on 2016/7/29.
 */
public class MyAdapater extends FragmentPagerAdapter {
    private static final String TAG = "MyAdapater";
    List<Fragment> fraglist;
    List<String> titlelist;

    public MyAdapater(FragmentManager fm, List<Fragment> fraglist, List<String> titlelist) {
        super(fm);
        this.fraglist = fraglist;
        this.titlelist = titlelist;
    }


    @Override
    public Fragment getItem(int position) {

        Log.i(TAG, "getItem: " +  position);
        return fraglist.get(position);
    }

    @Override
    public int getCount() {
        Log.i(TAG, "getCount: " +  fraglist.size());
        return fraglist.size();
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return titlelist.get(position);
    }
}
