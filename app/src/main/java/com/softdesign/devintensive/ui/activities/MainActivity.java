package com.softdesign.devintensive.ui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import com.softdesign.devintensive.data.managers.DataManager;
import com.softdesign.devintensive.utils.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends BaseActivity {

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

    private Map<String, String> userDataList;

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
        updateTextInputFields();
    }

    /** Обновление значений текстовых полей активити загруженными данными */
    private void updateTextInputFields()
    {
        userDataList = DataManager.getInstance().getPreferencesManager().loadUserData();
        if (userDataList.containsKey(ConstantManager.USER_PHONE_TAG))
            userPhone.setText(userDataList.get(ConstantManager.USER_PHONE_TAG));
        if (userDataList.containsKey(ConstantManager.USER_EMAIL_TAG))
            userEmail.setText(userDataList.get(ConstantManager.USER_EMAIL_TAG));
        if (userDataList.containsKey(ConstantManager.USER_VK_TAG))
            userEmail.setText(userDataList.get(ConstantManager.USER_VK_TAG));
        if (userDataList.containsKey(ConstantManager.USER_GIT_TAG))
            userEmail.setText(userDataList.get(ConstantManager.USER_GIT_TAG));
        if (userDataList.containsKey(ConstantManager.USER_ABOUT_TAG))
            userEmail.setText(userDataList.get(ConstantManager.USER_ABOUT_TAG));
    }

    /** Сохранение значений текстовых полей активити */
    private void saveTextInputFields()
    {
        userDataList.put(ConstantManager.USER_PHONE_TAG, userPhone.getText().toString());
        userDataList.put(ConstantManager.USER_EMAIL_TAG, userEmail.getText().toString());
        userDataList.put(ConstantManager.USER_VK_TAG, userVk.getText().toString());
        userDataList.put(ConstantManager.USER_GIT_TAG, userGit.getText().toString());
        userDataList.put(ConstantManager.USER_ABOUT_TAG, userAbout.getText().toString());
        DataManager.getInstance().getPreferencesManager().saveUserData(userDataList);
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
        updateTextInputFields();
        Log.d(mTag, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        saveTextInputFields();
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
