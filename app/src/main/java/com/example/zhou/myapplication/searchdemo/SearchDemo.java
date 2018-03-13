package com.example.zhou.myapplication.searchdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.zhou.myapplication.R;

/**
 * @author Zhou
 * @Date 2018/3/9
 */

public class SearchDemo extends Activity {


//    1.初始化搜索框变量

    private SearchView searchView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//    2.绑定视图
        setContentView(R.layout.activity_search);

//    3.绑定组件
        searchView = (SearchView) findViewById(R.id.search_view);

//    4.设置点击搜索案件后的操作（通过回调接口）
//    参数 = 搜索框输入的内容

        searchView.setOnClickSearch(new ICallBack() {
            @Override
            public void SearchAction(String string) {
                System.out.println("我收到了" + string);
            }
        });

//        5.设置点击返回按键后的操作（通过回调接口）
        searchView.setOnClickBack(new bCallBack() {
            @Override
            public void BackAction() {
                finish();
            }
        });
    }
}
