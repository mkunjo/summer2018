package com.example.mk.summer2018;

import android.app.Application;

import com.example.mk.summer2018.util.LogUtil;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LogUtil.setLogSwitch(true);
    }
}
