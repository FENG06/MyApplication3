package com.example.zhou.myapplication.Activity;

import android.app.Activity;
import android.os.Bundle;

import com.example.zhou.myapplication.R;

import butterknife.ButterKnife;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

//        setTitle(R.string.app_name);
//
//        Button button = (Button) findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this,RegisterActivity.class);
//                startActivity(intent);
//            }
//        });
    }
}
