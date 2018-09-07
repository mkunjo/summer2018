package com.example.mk.summer2018.Fragment;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;


import com.example.mk.summer2018.MainActivity;
import com.example.mk.summer2018.R;
import com.example.mk.summer2018.activity.AdvanceListViewActivity;
import com.example.mk.summer2018.activity.AdvanceViewPagerActivity;
import com.example.mk.summer2018.activity.CheckBoxActivity;
import com.example.mk.summer2018.activity.DialogActivity;
import com.example.mk.summer2018.activity.HandlerActivity;
import com.example.mk.summer2018.activity.IntentAndBundleActivity;
import com.example.mk.summer2018.activity.LaunchModeActivity;
import com.example.mk.summer2018.activity.NinePatchActivity;
import com.example.mk.summer2018.activity.NotificationActivity;
import com.example.mk.summer2018.activity.RadioGroupActivity;
import com.example.mk.summer2018.activity.ScaleTypeActivity;
import com.example.mk.summer2018.activity.ViewPagerActivity;
import com.example.mk.summer2018.adapter.MainListAdapter;
import com.example.mk.summer2018.bean.Base;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */

public class DemoFragment extends Fragment {

    private MainListAdapter adapter;
    //This array list will hold the list of items in our frament view
    public List<String> list = new ArrayList<String>();
    private ListView listView;

    public DemoFragment() {
        list.add("LaunchMode");
        list.add("SimpleViewPager");
        list.add("9Patch");
        list.add("ScaleType");
        list.add("Intent & Bundle");
        list.add("Notification");
        list.add("AdvancelistView");
        list.add("AdvanceViewPager");
        list.add("RadioGroup");
        list.add("Checkbox");
        list.add("Dialogs");
        list.add("Handler");
    }

    //Below is an adapter for the listview which makes things interactive?


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this Fragment

        View view = inflater.inflate(R.layout.fragment_demo, container, false);
        listView = view.findViewById(R.id.main_demo_lv);
        adapter = new MainListAdapter(getContext(), list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            Intent intent =  new Intent();
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    //adding a headerview to our listview  increments every position by 1
                    case 0:
                        //Switch view to LaunchModeActivity
                        //The  first parameter is the current activity while the second is the next activity
                        intent.setClass(getActivity(), LaunchModeActivity.class);
                        startActivity(intent);
                        break;

                    case 1:
                        //the first parameter is the current activity while the second is the next activity we want t
                        //go to
                        intent.setClass(getActivity(), ViewPagerActivity.class);
                        startActivity(intent);

                    case 2:
                        intent.setClass(getActivity(), NinePatchActivity.class);
                        startActivity(intent);
                    case 3:
                        intent.setClass(getActivity(), ScaleTypeActivity.class);
                        startActivity(intent);
                    case 4:
                        intent = new Intent(getActivity(), IntentAndBundleActivity.class);
                        intent.putExtra("Msg","Say Hello");
                        intent.putExtra("number",10);
                        Base newBase = new Base();
                        newBase.setName("Muhammad");
                        Bundle bundle = new Bundle();
                        bundle.putInt("B_Msg",100);
                        bundle.putString("B_Msg","FromBundle");
                        bundle.putSerializable("Base", newBase);
                        intent.putExtra("B_Msg",bundle);
                        startActivity(intent);
                        break;
                    case 5:
                        intent.setClass(getActivity(),NotificationActivity.class);
                        startActivity(intent);
                        break;

                    case 6:
                        intent.setClass(getActivity(), AdvanceListViewActivity.class);
                        startActivity(intent);
                        break;
                    case 7:
                        ((MainActivity) getActivity()).startActivity(AdvanceViewPagerActivity.class);
                        break;
                    case 8:
                        ((MainActivity) getActivity()).startActivity(RadioGroupActivity.class);
                        break;
                    case 9:
                        ((MainActivity) getActivity()).startActivity(CheckBoxActivity.class);
                        break;

                    case 10:
                        ((MainActivity) getActivity()).startActivity(DialogActivity.class);
                        break;
                    case 11:
                        ((MainActivity) getActivity()).startActivity(HandlerActivity.class);
                        break;
                    default:
                }
            }
        });

        return view;
    }

}