package com.example.administrator.mypagertest;

import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Page0 page0;
    private Page1 page1;
    private Page2 page2;
    private Page3 page3;
    private Page4 page4;
    private Page5 page5;
    private FragmentManager fmgr;
    private FragmentTransaction tran;

    private Resources res;

    TextView mesg;

    private ViewPager viewPager;
    private Fragment[] fragments;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager)findViewById(R.id.container);

        res = getResources();

        mesg = (TextView)findViewById(R.id.mesg);

        page0 = new Page0();
        page1 = new Page1();
        page2 = new Page2();
        page3 = new Page3();
        page4 = new Page4();
        page5 = new Page5();

        fragments = new Fragment[]{page0,page1,page2,page3,page4,page5};


        fmgr = getSupportFragmentManager();
//        tran = fmgr.beginTransaction();
//        tran.add(R.id.container, page1);
//        tran.commit();

        viewPager.setAdapter(new MyPagerAdapter(fmgr));
        viewPager.setCurrentItem(1);


    }

    private class MyPagerAdapter extends FragmentStatePagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments[position];
        }

        @Override
        public int getCount() {
            return fragments.length;
        }
    }

    public void gotoPage1(View view){
//        tran = fmgr.beginTransaction();
//        tran.replace(R.id.container, page1);
//        tran.commit();
        viewPager.setCurrentItem(0);
    }
    public void gotoPage2(View view){
//        tran = fmgr.beginTransaction();
//        tran.replace(R.id.container, page2);
//        tran.commit();
        viewPager.setCurrentItem(1);
    }
    public void gotoPage3(View view){
//        tran = fmgr.beginTransaction();
//        tran.replace(R.id.container, page3);
//        tran.commit();
        viewPager.setCurrentItem(2);
    }
    public void gotoPage4(View view){
//        tran = fmgr.beginTransaction();
//        tran.replace(R.id.container, page4);
//        tran.commit();
        viewPager.setCurrentItem(3);
    }

}
