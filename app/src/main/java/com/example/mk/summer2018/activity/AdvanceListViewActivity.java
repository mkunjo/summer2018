package com.example.mk.summer2018.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.mk.summer2018.R;
import com.example.mk.summer2018.adapter.AdvListAdapter;
import com.example.mk.summer2018.adapter.ViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class AdvanceListViewActivity extends AppCompatActivity {

    private ListView listView;
    private AdvListAdapter adapter;
    private ViewPagerAdapter adpater2;
    private List<String> list = new ArrayList<String>();

    //private ArrayList<Fragment> fragmentList = new ArrayList<Fragment> ();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_list_view);

        View view = getLayoutInflater().inflate(R.layout.listview_header,null );

        list.add("Hello!");
        list.add("Hey!");
        list.add("Whats UP?!");
        list.add("CovFeFe?");
        list.add("Ikr");
        list.add("yea");
        list.add("What're gonna do today");
        list.add("Maybe something");


        // fragmentList.add(new DemoFragment());
        //fragmentList.add(new WorkFragment());

        listView = findViewById(R.id.adv_lv);
        adapter = new AdvListAdapter(this, list);
        // adpater2 =  new ViewPagerAdapter(getSupportFragmentManager(),fragmentList)
        //view.
        listView.setAdapter(adapter);

        listView.addHeaderView(view);

    }
}
