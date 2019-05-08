package com.gxm.mtest.mytest.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.eyeofcloud.ab.android.sdk.EyeofcloudClient;
import com.gxm.mtest.mytest.application.MyApplication;

public class BaseActivity extends AppCompatActivity {

    public MyApplication application;
    public EyeofcloudClient eyeofcloudClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        application = (MyApplication) getApplication();

        eyeofcloudClient = application.getEyeofcloudManager().getEyeofcloud();
    }
}
