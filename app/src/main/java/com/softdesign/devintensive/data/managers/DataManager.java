package com.softdesign.devintensive.data.managers;

import android.content.Context;

/**
 * Created by nick on 28.06.16.
 */
public class DataManager {
    private static  DataManager Instance = null;
    private PreferencesManager mPreferencesManager;

    public DataManager()
    {
        this.mPreferencesManager = new PreferencesManager();
    }

    /** Get instance of DataManager class */
    public static DataManager getInstance()
    {
        if (Instance == null)
            Instance = new DataManager();
        return Instance;
    }

    public PreferencesManager getPreferencesManager()
    {
        return this.mPreferencesManager;
    }

}
