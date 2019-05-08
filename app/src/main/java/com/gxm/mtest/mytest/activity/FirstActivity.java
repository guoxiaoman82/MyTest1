package com.gxm.mtest.mytest.activity;

import android.content.Intent;
import android.os.Bundle;

import com.eyeofcloud.ab.android.sdk.EyeofcloudClient;
import com.eyeofcloud.ab.android.sdk.EyeofcloudStartListener;
import com.gxm.mtest.mytest.R;

public class FirstActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        application.getEyeofcloudManager().initialize(this, new EyeofcloudStartListener() {
            @Override
            public void onStart(EyeofcloudClient eyeofcloudClient) {

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Intent intent = new Intent(application.getBaseContext(), MainActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }
}
