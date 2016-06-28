package com.softdesign.devintensive.ui.activities;

import android.app.ProgressDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.softdesign.devintensive.utils.ConstantManager;

/**
 * Created by nick on 28.06.16.
 */
public class BaseActivity extends AppCompatActivity {

    private String mTag = ConstantManager.PREFFIX_TAG + "Base Activity";
    private ProgressDialog mProgressDlg;

    public void showProgress() {
        if (mProgressDlg == null) {
            mProgressDlg = new ProgressDialog(this, R.style.progress_dlg);
            mProgressDlg.setCancelable(false);
            mProgressDlg.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        }
        mProgressDlg.show();
        mProgressDlg.setContentView(R.layout.activity_progress_dlg);
    }

    public void hideProgress() {
        if (mProgressDlg != null && mProgressDlg.isShowing())
            mProgressDlg.hide();
    }

    public void showToast(String message)
    {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public void showError(String message, Exception exp)
    {
        showToast(message);
        Log.d(mTag, exp.getMessage());
    }

}
