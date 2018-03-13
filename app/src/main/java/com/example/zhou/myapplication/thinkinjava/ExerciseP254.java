package com.example.zhou.myapplication.thinkinjava;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by Zhou on 2018/1/8.
 */

public class ExerciseP254 {

    private static Logger logger = Logger.getLogger("LoggingExceptions2");

    static void logException(Exception e) {

        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args) {

        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            logger.severe(String.valueOf(e));
        }
    }


}
