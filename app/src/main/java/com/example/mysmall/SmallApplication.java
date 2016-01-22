package com.example.mysmall;

import android.app.Application;

import net.wequick.small.Small;

/**
 * Created by cuiran on 16/1/20.
 */
public class SmallApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Small.setBaseUri("http://m.wequick.net/demo/");
    }
}
