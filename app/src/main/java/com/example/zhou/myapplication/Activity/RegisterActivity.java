package com.example.zhou.myapplication.Activity;

import android.os.Bundle;
import android.util.Log;

import com.example.zhou.myapplication.R;
import com.example.zhou.myapplication.View.TitleBarActivity;

/**
 * Created by Zhou on 2017/7/16.
 */

public class RegisterActivity extends TitleBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.w("Fudai","imageviewplus onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regisiter);

        setTitle(R.string.app_name);

        Log.w("Fudai","imageviewplus on");

    }
}
