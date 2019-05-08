package com.gxm.mtest.mytest.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.eyeofcloud.ab.config.Variation;
import com.gxm.mtest.mytest.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MainActivity extends BaseActivity {

    private Unbinder unbinder;

    @BindView(R.id.tv1)
    protected TextView tv1;
    private String uname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        unbinder = ButterKnife.bind(this);
        uname = application.getUserName();

        //激活优化方案，优化方案名称，用户ID，attribute（属性没有设置可不填）
        //激活后variation的结果是优化方案中随机出来的其中一个版本，然后对这个用户始终都是这个版本了
        Variation variation = eyeofcloudClient.activate("m_plan", uname);

        if (variation != null) {

            String str = variation.getId() + "," + variation.getKey() + "," + variation.toString();
            tv1.setText(str);
            Toast.makeText(this, str, Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(this, "null variation", Toast.LENGTH_LONG).show();
        }

        //实时变量，在优化方案中配置的，第一次使用从网上获取，以后从eyeofcloud缓存中获取，配置默认值
        String tv1_color = eyeofcloudClient.getVariableString("tv1_color", uname, true);

        if (tv1_color != null) {
            tv1.setTextColor(Color.parseColor(tv1_color));

        }else {
            Toast.makeText(this, "null color", Toast.LENGTH_LONG).show();
        }

        //事件跟踪（如按钮点击），attribute（属性没有设置可不填）
        eyeofcloudClient.track("click", uname);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (unbinder != null) {
            unbinder.unbind();
        }
    }

}
