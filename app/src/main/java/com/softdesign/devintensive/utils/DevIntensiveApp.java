package com.softdesign.devintensive.utils;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by nick on 28.06.16.
 */
public class DevIntensiveApp extends Application {
    private static SharedPreferences sSharedPreferences;

    public static SharedPreferences getSharedPreferences()
    {
        return  sSharedPreferences;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
    }
}
