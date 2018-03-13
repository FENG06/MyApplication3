package com.example.zhou.myapplication.View;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.zhou.myapplication.R;

/**
 * Created by Zhou on 2017/7/20.
 */

public class TitleBarActivity extends Activity implements View.OnClickListener {


    private TextView mTitleTextView;
    private Button mBackButton;
    private Button mForwardButton;
    private View mContentLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupViews();//加载布局
    }

    private void setupViews() {
        super.setContentView(R.layout.layout_titlebar);
        mTitleTextView = (TextView) findViewById(R.id.text_title);
        mBackButton = (Button) findViewById(R.id.button_back);
        mForwardButton = (Button) findViewById(R.id.button_forward);
//        mContentLayout = (FrameLayout) findViewById(R.id.layout_content);
    }


    /*
    * 是否显示返回按钮
    * */
    protected void showBackView(String backwardResid, boolean show) {
        if (mBackButton != null) {
            if (show) {
                mBackButton.setText(backwardResid);
                mBackButton.setVisibility(View.VISIBLE);
            } else {
                mBackButton.setVisibility(View.INVISIBLE);
            }
        }
    }

    /*
    * 是否显示提交按钮
    * */
    protected void showForwardView(String forwardResid, boolean show) {
        if (mForwardButton != null) {
            if (show) {
                mForwardButton.setText(forwardResid);
                mForwardButton.setVisibility(View.VISIBLE);
            } else {
                mForwardButton.setVisibility(View.INVISIBLE);
            }
        }
    }


    /*
    * 返回按钮点击后触发
    * */
    protected void onBack(View backwardView) {

    }

    /*
    * 提交按钮后点击触发
    * */

    protected void onForward(View backwardView) {

    }

    /*
    * 设置标题内容
    * */

    @Override
    public void setTitle(int titleId) {
        mTitleTextView.setText(titleId);
    }

    @Override
    public void setTitle(CharSequence title) {
        super.setTitle(title);
    }

    @Override
    public void setTitleColor(int textColor) {
        super.setTitleColor(textColor);
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
    }




//    @Override
//    public void setContentView(int layoutResID) {
//        mContentLayout.removeAllViews();
//        View.inflate(this, layoutResID, mContentLayout);
//        onContentChanged();
//    }
//
//    @Override
//    public void setContentView(View view) {
//        mContentLayout.removeAllViews();
//        mContentLayout.addView(view);
//        onContentChanged();
//    }
//
//    /* (non-Javadoc)
//     * @see android.app.Activity#setContentView(android.view.View, android.view.ViewGroup.LayoutParams)
//     */
//    @Override
//    public void setContentView(View view, ViewGroup.LayoutParams params) {
//        mContentLayout.removeAllViews();
//        mContentLayout.addView(view, params);
//        onContentChanged();
//    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_back:
                onBack(v);
                break;

            case R.id.button_forward:
                onForward(v);
                break;

            default:
                break;
        }
    }
}
