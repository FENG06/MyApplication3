package com.example.zhou.myapplication.baseExample;

import com.example.zhou.myapplication.debug.Debug;

/**
 * Created by Zhou on 2017/11/8.
 */

public class TestDebug {

    public static void main(String[] args) {

        Debug debug1 = new Debug();
        debug1.debug("你好");
        com.example.zhou.myapplication.debugoff.Debug debug = new com.example.zhou.myapplication.debugoff.Debug();
        debug.debug("你也好");
    }

}
