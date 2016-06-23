package com.softdesign.devintensive.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import com.softdesign.devintensive.utils.*;

import com.softdesign.devintensive.ui.activities.R;

public class MainActivity extends AppCompatActivity {

    private String mTag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(mTag, "onCreate");
        mTag = ConstantManager.PREFFIX_TAG + "MainActivity";
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(mTag, "onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(mTag, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(mTag, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(mTag, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(mTag, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(mTag, "onDestroy");
    }
}
