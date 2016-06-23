package com.softdesign.devintensive.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import com.softdesign.devintensive.utils.*;

public class MainActivity extends AppCompatActivity {

    private String mTag;
    /** Рейтинг пользователя */
    public TextView userRating;
    /** Кол-во строк кода */
    public TextView userLineCodeCount;
    /** Кол-во проектов */
    public TextView userProjectCount;
    /** phone number */
    public EditText userPhone;
    /** email address */
    public EditText userEmail;
    /** vk id */
    public EditText userVk;
    /** Git repository */
    public EditText userGit;
    /** about user */
    public EditText userAbout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(mTag, "onCreate");
        mTag = ConstantManager.PREFFIX_TAG + "MainActivity";
        setContentView(R.layout.activity_main);

        userRating = (TextView)findViewById(R.id.userRating);
        userLineCodeCount = (TextView)findViewById(R.id.userLineCodeCount);
        userProjectCount = (TextView)findViewById(R.id.userProjectCount);
        userVk = (EditText)findViewById(R.id.userVk);
        userGit = (EditText)findViewById(R.id.userGit);
        userPhone = (EditText)findViewById(R.id.userPhone);
        userEmail = (EditText)findViewById(R.id.userEmail);
        userAbout = (EditText)findViewById(R.id.userAbout);
        userRating.setText("5");
        userProjectCount.setText("5");
        userLineCodeCount.setText("5");
        userPhone.setText("8-917-97-77-77");
        userEmail.setText("email@address.com");
        userVk.setText("vk.com/id62678003");
        userGit.setText("github.com/Nick-dev/DevIntensive");
        userAbout.setText("About me...........................");
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
