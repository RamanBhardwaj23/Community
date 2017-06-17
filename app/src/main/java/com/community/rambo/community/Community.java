package com.community.rambo.community;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.firebase.client.Firebase;


public class Community extends AppCompatActivity {
    private static final String TAG="Main_Activity";
    private SectionsPageAdapater mSectionPageAdapter;
    private ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community);
        Log.d(TAG, "onCreate: Starting");
        mViewPager=(ViewPager)findViewById(R.id.container);
        SetupViewPager(mViewPager);
        TabLayout tabLayout =(TabLayout)findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
        mSectionPageAdapter=new SectionsPageAdapater(getSupportFragmentManager());


    }
    private void SetupViewPager(ViewPager viewpager){
        SectionsPageAdapater adapter=new SectionsPageAdapater(getSupportFragmentManager());
        adapter.addFragment(new parental_queries(),"Parental Queries");
        adapter.addFragment(new shopping_queries(),"Shopping Queries");
        viewpager.setAdapter(adapter);
    }
}