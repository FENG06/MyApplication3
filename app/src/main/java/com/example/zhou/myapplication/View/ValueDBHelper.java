package com.example.zhou.myapplication.View;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Zhou on 2018/1/10.
 */

public class ValueDBHelper extends SQLiteOpenHelper {


    private static String CREATE_VALUE = "create table value (" + " id integer primary key autoincrement,"
            + "time text,"
            + "value float)";

    Context mContext;


    public ValueDBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {

        super(context, name, factory, version);
        this.mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_VALUE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
