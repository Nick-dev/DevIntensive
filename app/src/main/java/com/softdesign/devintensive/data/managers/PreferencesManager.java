package com.softdesign.devintensive.data.managers;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.softdesign.devintensive.utils.ConstantManager;
import com.softdesign.devintensive.utils.DevIntensiveApp;

import java.util.Iterator;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * Created by nick on 28.06.16.
 */
public class PreferencesManager {
    private SharedPreferences mSharedPreferences;
    private static final String[] KEY_FIELDS = {
                    ConstantManager.USER_PHONE_TAG, ConstantManager.USER_EMAIL_TAG,
                    ConstantManager.USER_VK_TAG, ConstantManager.USER_GIT_TAG, ConstantManager.USER_ABOUT_TAG};

    public PreferencesManager()
    {
        this.mSharedPreferences = DevIntensiveApp.getSharedPreferences();
    }

    /** Save user data */
    public void saveUserData(Map<String, String> data)
    {
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        Set<String> keys = data.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            editor.putString(key, data.get(key));
        }
        editor.apply();
    }

    /** Load user data */
    public Map<String, String> loadUserData()
    {
        Map<String, String> data = new HashMap<>();
        for (int i =0; i < KEY_FIELDS.length; i ++) {
            data.put(KEY_FIELDS[i], this.mSharedPreferences.getString(KEY_FIELDS[i], ""));
        }
        return data;
    }
}
