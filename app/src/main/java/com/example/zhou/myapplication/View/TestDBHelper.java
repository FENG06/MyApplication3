package com.example.zhou.myapplication.View;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * @author Zhou
 * @version 1
 * @date 2018/1/9
 */

public class TestDBHelper extends SQLiteOpenHelper {


    public static final String CREATE_BOOK = "create table Book (" + "id integer primary key autoincrement,"
            + "author text,"
            + "price real,"
            + "pages integer,"
            + "category_id integer"
            + "name text )";


    public static final String CREATE_CATEGORY = "create table Category (" + "id integer primary key autoincrement,"
            + "category_name text,"
            + "category_code integer)";


    private Context mcontext;

    public TestDBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        mcontext = context;

    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_BOOK);
        db.execSQL(CREATE_CATEGORY);
        Toast.makeText(mcontext, "Create  succeeded", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        //如果发现数据库中存在Book表或者Category表，就将这两张表删除，然后重新调用onCreate（）方法

//        switch 语句中每一个case的最后都没有使用break，这是为了保证在跨版本升级的时候，每一次的数据库修改都能被全部执行
        switch (oldVersion) {

            case 1:
                db.execSQL(CREATE_CATEGORY);

            case 2:
                db.execSQL(CREATE_BOOK);

            default:

        }

    }
}

