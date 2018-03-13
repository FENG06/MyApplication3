package com.example.zhou.myapplication.thinkinjava;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by Zhou on 2018/1/8.
 */

public class ExerciseP253 {

    public static void main(String[] args) {
        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Catch" + e);
        }

        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println("Catch" + e);
        }
    }


}


class LoggingException extends Exception {
    private static Logger logger = Logger.getLogger("LoggingException");

    public LoggingException() {
        StringWriter trace = new StringWriter();
//        printStackTrace 不会默认的产生字符串，为了获取字符串，需要使用重载的printStackTrace()方法
        printStackTrace(new PrintWriter(trace));

        logger.severe(trace.toString());
    }
}
