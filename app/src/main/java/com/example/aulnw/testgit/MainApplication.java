package com.example.aulnw.testgit;

import android.app.Application;

import com.inthecheesefactory.thecheeselibrary.manager.Contextor;

/**
 * Created by Dell on 7/6/2016.
 */
public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Initialize thing(s) here
        Contextor.getInstance().init(getApplicationContext());
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
