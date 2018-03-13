package com.example.zhou.myapplication.searchdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.example.zhou.myapplication.R;

/**
 * @author Zhou
 * @Date 2018/3/9
 */

public class ActivityMain extends Activity {

    private Button button;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_search1);

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityMain.this,SearchDemo.class));
            }
        });
    }
}
