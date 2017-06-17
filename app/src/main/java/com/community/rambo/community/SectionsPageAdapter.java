package com.community.rambo.community;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;




class SectionsPageAdapater extends FragmentPagerAdapter {
    private final List<Fragment> mFragmentsList=new ArrayList<>();
    private final List<String> mFragmentsTitleList=new ArrayList<>();


    public void addFragment(Fragment fragment, String title) {
        mFragmentsList.add(fragment);
        mFragmentsTitleList.add(title);
    }


    public SectionsPageAdapater(FragmentManager fm) {
        super(fm);
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentsTitleList.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentsList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentsList.size();
    }
}
