package com.softdesign.devintensive.data.managers;

import android.preference.PreferenceManager;

/**
 * Created by nick on 28.06.16.
 */
public class DataManager {
    private static  DataManager Instance = null;
    private PreferenceManager mPreferenceManager;

    public DataManager()
    {
        this.mPreferenceManager = new PreferenceManager();
    }

    /** Get instance of DataManager class */
    public static DataManager getInstance()
    {
        if (Instance == null)
            Instance = new DataManager();
        return Instance;
    }

    public PreferenceManager getPreferenceManager()
    {
        return this.mPreferenceManager;
    }

}
