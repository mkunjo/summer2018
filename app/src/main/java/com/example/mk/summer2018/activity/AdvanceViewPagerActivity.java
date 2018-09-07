package com.example.mk.summer2018.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;

import com.example.mk.summer2018.Fragment.DemoFragment;
import com.example.mk.summer2018.Fragment.WorkFragment;
import com.example.mk.summer2018.R;
import com.example.mk.summer2018.adapter.AdvancePagerAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AdvanceViewPagerActivity extends AppCompatActivity {

    @BindView(R.id.advance_viewpager_title)
    TabLayout title;
    @BindView(R.id.advance_viewpager)
    ViewPager vp;

    private List<Pair<String, Fragment>> fragmentList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_view_pager);
        ButterKnife.bind(this);

        fragmentList.add(new Pair<String, Fragment>("1st", new WorkFragment()));
        fragmentList.add(new Pair<String, Fragment>("2nd", new DemoFragment()));
        fragmentList.add(new Pair<String, Fragment>("3rd", new WorkFragment()));
        fragmentList.add(new Pair<String, Fragment>("4th", new DemoFragment()));


        AdvancePagerAdapter adapter =
                new AdvancePagerAdapter(getSupportFragmentManager(), fragmentList);

        vp.setAdapter(adapter);
        title.setupWithViewPager(vp);


    }
}