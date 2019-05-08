package com.gxm.mtest.mytest.application;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;

import com.eyeofcloud.ab.android.sdk.EyeofcloudManager;
import com.gxm.mtest.mytest.util.Constants;
import com.gxm.mtest.mytest.util.SPHelper;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class MyApplication extends Application {


    private EyeofcloudManager eyeofcloudManager;
    public EyeofcloudManager getEyeofcloudManager() {
        return eyeofcloudManager;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        eyeofcloudManager = EyeofcloudManager.builder(Constants.PRIJDCT_ID)
                .withEventHandlerDispatchInterval(30, TimeUnit.SECONDS)
                .withDataFileDownloadInterval(30, TimeUnit.SECONDS)
                .build();
    }

    public Map<String,String> getAttributes() {
        Map<String,String> attributes = new HashMap<>();
        attributes.put(Constants.ATTRIBUTE_KEY, "test1");
        return attributes;
    }

    @NonNull
    public String getUserName() {

        String uname = SPHelper.getString(this,Constants.UNAME_KEY,null);
        if (uname == null){
            uname = UUID.randomUUID().toString();
            SPHelper.putString(this,Constants.UNAME_KEY,uname);
        }
        return uname;

    }
}
