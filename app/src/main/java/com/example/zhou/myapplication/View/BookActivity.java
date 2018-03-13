package com.example.zhou.myapplication.View;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.zhou.myapplication.R;
import com.github.mikephil.charting.data.Entry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhou on 2018/1/9.
 */

public class BookActivity extends Activity {

    static List<String> xDataList = new ArrayList<>();
    static List<Entry> yDataList = new ArrayList<>();
    private TestDBHelper dbHelper;
    private ValueDBHelper valueDBHelper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

//        传入比1大的version号，执行onUpgrade()方法

        dbHelper = new TestDBHelper(this, "BookStore.db", null, 1);
        valueDBHelper = new ValueDBHelper(this, "ValueStore.db", null, 1);

        final Button createDb = (Button) findViewById(R.id.create_database);
        Button addData = (Button) findViewById(R.id.add_data);
        Button updateData = (Button) findViewById(R.id.update_data);
        Button deleteData = (Button) findViewById(R.id.delete_data);
        Button queryData = (Button) findViewById(R.id.query_data);
        Button replaceData = (Button) findViewById(R.id.replace_data);
        Button jump = (Button) findViewById(R.id.jump);
        final EditText editTime = (EditText) findViewById(R.id.time_value);
        final EditText editValue = (EditText) findViewById(R.id.value_data);
        Button btn_save = (Button) findViewById(R.id.btn_save);


        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String time = editTime.getText().toString().trim();
                float value = Integer.parseInt(editValue.getText().toString().trim());

                SQLiteDatabase db = valueDBHelper.getWritableDatabase();
                ContentValues contentValues = new ContentValues();
                contentValues.put("time", time);
                contentValues.put("value", value);
                System.out.println("time:" + time + "\n" + "value:" + value);

                db.insert("Value", null, contentValues);

            }
        });


        createDb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.getWritableDatabase();
            }
        });

        addData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SQLiteDatabase db = dbHelper.getWritableDatabase();
                ContentValues values = new ContentValues();

//                开始组装第一条数据

                values.put("name", "The Da Vinci Code");
                values.put("author", "Dan Brown");
                values.put("pages", 454);
                values.put("price", 46.96);
                db.insert("Book", null, values);

//                开始组装第二条数据
                values.put("name", "The Lost Symbol");
                values.put("author", "Dan Brown");
                values.put("pages", 510);
                values.put("price", 19.95);
                db.insert("Book", null, values);

            }
        });


        updateData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                ContentValues values = new ContentValues();
                values.put("price", 10.99);
                db.update("Book", values, "name=?", new String[]{"The Da Vinci Code"});


            }
        });


        deleteData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                db.delete("Book", "pages >?", new String[]{"500"});
            }
        });


        queryData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                System.out.println("test");
                //                查询Book表中所有的数据
                Cursor cursor = db.query("Book", null, null, null, null, null, null);
                if (cursor.moveToFirst()) {
                    do {
//                        遍历Cursor对象，取出数据并打印
                        String name = cursor.getString(cursor.getColumnIndex("name"));
                        String author = cursor.getString(cursor.getColumnIndex("author"));
                        int pages = cursor.getInt(cursor.getColumnIndex("pages"));
                        double price = cursor.getDouble(cursor.getColumnIndex("price"));
                        Log.d("BookActivity", "Book name is " + name);
                        Log.d("BookActivity", "Book author is " + author);
                        Log.d("BookActivity", "Book pages are " + pages);
                        Log.d("BookActivity", "Book price is " + price);
                    } while (cursor.moveToNext());
                }
                cursor.close();
            }
        });


        replaceData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
//                开启事务
                db.beginTransaction();
                try {

                    db.delete("Book", null, null);

                    if (true) {
                        throw new NullPointerException();
                    }

//            在这里手动抛出一个异常，让事务失败

//            手动添加一个异常，在删除旧数据之后，新添加的数据的操作是执行不到的，但是由于事务的存在，中途出现异常会导致事务的失败，此时旧数据应该是删除不掉的。

                    ContentValues values = new ContentValues();
                    values.put("name", "Game of Thrones");
                    values.put("author", "George Martin");
                    values.put("pages", 720);
                    values.put("price", 20.85);
                    db.insert("Book", null, values);
                    db.setTransactionSuccessful();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    db.endTransaction();
                }
            }
        });


        jump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                SQLiteDatabase db = dbHelper.getReadableDatabase();
                String[] query = {"price", "name"};
                Cursor c = db.query("Book", query, null, null, null, null, null);
                if (c.moveToNext()) {
                    int i = 0;
                    do {
                        String name = c.getString(c.getColumnIndex("name"));
                        double price = c.getDouble(c.getColumnIndex("price"));
                        System.out.println(price);
                        xDataList.add(name);
                        yDataList.add(new Entry((float) price, i++));
                    } while (c.moveToNext());
                    System.out.println(xDataList);

                }
                c.close();
                Intent intent = new Intent(BookActivity.this, LineActivity.class);
                startActivity(intent);
            }
        });


    }
}
