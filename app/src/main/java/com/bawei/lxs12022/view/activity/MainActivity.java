package com.bawei.lxs12022.view.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.bawei.lxs12022.R;
import com.bawei.lxs12022.base.BaseActivity;
import com.bawei.lxs12022.view.fragment.HomeFragment;
import com.bawei.lxs12022.view.fragment.MyFragment;
import com.bawei.lxs12022.view.fragment.OtherFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {
    private ViewPager viewPager;
    private RadioGroup radioGroup;
    private List<Fragment> list = new ArrayList<>();
    @Override
    protected void initData() {
        list.add(new HomeFragment());
        list.add(new OtherFragment());
        list.add(new MyFragment());
        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int i) {
                return list.get(i);
            }

            @Override
            public int getCount() {
                return list.size();
            }
        });
    }

    @Override
    protected void initView() {
        viewPager = findViewById(R.id.vp);
        radioGroup = findViewById(R.id.rg);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.but1:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.but2:
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.but3:
                        viewPager.setCurrentItem(2);
                        break;
                }
            }
        });
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                switch (i){
                    case 0:
                        radioGroup.check(R.id.but1);
                        break;
                    case 1:
                        radioGroup.check(R.id.but2);
                        break;
                    case 2:
                        radioGroup.check(R.id.but3);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }

    @Override
    protected int LayoutId() {
        return R.layout.activity_main;
    }
    public void data(){
        viewPager.setCurrentItem(2);
    }
}
