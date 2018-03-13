package com.example.zhou.myapplication.View;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.zhou.myapplication.R;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhou on 2018/1/9.
 */

public class LineActivity extends Activity {

    private LineChart lineChart;
    /**
     * @xDataList x轴数据源
     * @yDataList y轴数据源
     */
    List<String> xDataList = new ArrayList<>();
    List<Entry> yDataList = new ArrayList<>();
    TestDBHelper dbHelper = new TestDBHelper(this, "Book", null, 1);
    List<String> xDataList1 = BookActivity.xDataList;
    List<Entry> yDataList1 = BookActivity.yDataList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitychart);
        lineChart = (LineChart) findViewById(R.id.lineChart);

        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String[] query = {"price"};
        Cursor c = db.query("Book", query, null, null, null, null, null);

        if (c.moveToNext()) {
            int i = 0;
            do {
                double price = c.getDouble(c.getColumnIndex("price"));
                System.out.println(price);
                float value = 1;
                xDataList.add(price + "元");
                yDataList.add(new Entry(value, i++));
            } while (c.moveToNext());

        }

        c.close();

        ChartUtil.showChart(this, lineChart, xDataList1, yDataList1, "测试图", "千克/时间", "kg/h");
    }


}
