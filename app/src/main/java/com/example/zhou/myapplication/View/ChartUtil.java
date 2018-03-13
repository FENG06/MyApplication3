package com.example.zhou.myapplication.View;

import android.content.Context;
import android.widget.TextView;

import com.example.zhou.myapplication.R;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.highlight.Highlight;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhou on 2018/1/9.
 */

public class ChartUtil {

    /**
     * 显示图表
     *
     * @param context    上下文
     * @param lineChart  图表对象
     * @param xDataList  X轴数据
     * @param yDataList  Y轴数据
     * @param title      图表标题（如：XXX趋势图）
     * @param curveLabel 曲线图例名称（如：--用电量/时间）
     * @param unitName   坐标点击弹出提示框中数字单位（如：KWH）
     */


    public static void showChart(Context context, LineChart lineChart, List<String> xDataList,
                                 List<Entry> yDataList, String title, String curveLabel, String unitName) {

        //        设置数据
        lineChart.setData(setLineData(context, xDataList, yDataList, curveLabel));
        CustomMarketView mv = new CustomMarketView(context, R.layout.chart_market_view, unitName);
//        set the market to the chart
        lineChart.setMarkerView(mv);
//        是否在折线图上添加边框
        lineChart.setDrawBorders(true);
//        曲线描述-标题
        lineChart.setDescription(title);
//        标题字体大小
        lineChart.setDescriptionTextSize(16f);
//        标题字体颜色
        lineChart.setDescriptionColor(context.getApplicationContext().getResources().getColor(R.color.color_c61a04));
//    如果没有数据，会显示这个，类似文本框的placeholder
        lineChart.setNoDataTextDescription("暂无数据");
//        是否显示表格颜色
        lineChart.setDrawGridBackground(false);
//        禁止绘制图表边框的线
        lineChart.setDrawBorders(false);
//       表格的颜色，在这里是给颜色设置一个透明度
        lineChart.setDrawingCacheBackgroundColor(0x70FFFFFF);
//        设置是否启动触摸响应
        lineChart.setTouchEnabled(true);
//        设置是否拖拽
        lineChart.setDragEnabled(true);
//        是否可以缩放
        lineChart.setScaleEnabled(true);
//        如果禁用，可以在x轴和y轴分别进行缩放
        lineChart.setPinchZoom(false);
//        图例对象
        Legend mLegend = lineChart.getLegend();
//        图例样式
        mLegend.setForm(Legend.LegendForm.SQUARE);
//        图例大小
        mLegend.setFormSize(8f);
//        图例上的字体颜色
        mLegend.setTextColor(context.getApplicationContext().getResources().getColor(R.color.colorAccent));
        mLegend.setTextSize(12f);
//        图例的显示和隐藏
        mLegend.setEnabled(true);
//        隐藏右侧Y轴（只在左侧的Y轴显示刻度）
        lineChart.getAxisRight().setEnabled(false);

        XAxis xAxis = lineChart.getXAxis();
//        显示X轴上的刻度值
        xAxis.setDrawLabels(true);
//        设置X轴的数据显示在报表的下方
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
//        设置不从X轴发出纵向直线
        xAxis.setDrawGridLines(false);
//        执行的动画，x轴（动画持续时间）
        lineChart.animateX(2500);

    }

    /**
     * 曲线的赋值与设置
     *
     * @param context   上下文
     * @param xDataList x轴数据
     * @param yDataList y轴数据
     * @return LineData
     */

    private static LineData setLineData(Context context, List<String> xDataList, List<Entry> yDataList, String curveLabel) {

//        LineDataSet 表示一条曲线数据对象
        ArrayList<LineDataSet> lineDataSets = new ArrayList<>();
//        y轴的数据集合
        LineDataSet lineDataSet = new LineDataSet(yDataList, curveLabel);
//        用y轴的集合来设置参数
//        不显示坐标点的数据
        lineDataSet.setDrawValues(false);
//        显示坐标点的小圆点
        lineDataSet.setDrawCircles(true);
//        定位线
        lineDataSet.setHighlightEnabled(true);
//        线宽
        lineDataSet.setLineWidth(2.0f);
//        显示的圆形大小
        lineDataSet.setCircleSize(4f);
//        显示颜色
        lineDataSet.setColor(context.getApplicationContext().getResources().getColor(R.color.color_999999));
//        高亮的线的颜色
        lineDataSet.setHighLightColor(context.getApplicationContext().getResources().getColor(R.color.colorAccent));
//        设置坐标点的颜色
        lineDataSet.setFillColor(context.getApplicationContext().getResources().getColor(R.color.color_d81e06));
//        设置坐标点为空心环状
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setFillAlpha(65);
//        设置显示曲线和X轴围城的区域阴影
        lineDataSet.setDrawFilled(true);
//        坐标轴在左侧
        lineDataSet.setAxisDependency(YAxis.AxisDependency.LEFT);
        lineDataSet.setValueTextSize(14f);
//        曲线弧度
        lineDataSet.setCubicIntensity(0.2f);
//        设置为曲线显示，false为折现
        lineDataSet.setDrawCubic(true);
        lineDataSets.add(lineDataSet);
//        x轴的数据
        LineData lineData = new LineData(xDataList, lineDataSet);

        return lineData;
    }


    /**
     * 自定义图标的MarketView(点击坐标点，弹出提示框)
     */
    private static class CustomMarketView extends MarkerView {

        private TextView tvContent;
        private String unitName;

        /**
         * @param context        上下文
         * @param layoutResource 资源文件
         * @param unitName       Y轴数值计量单位名称
         */
        public CustomMarketView(Context context, int layoutResource, final String unitName) {
            super(context, layoutResource);
//            显示布局中的文本框
            tvContent = (TextView) findViewById(R.id.txt_tips);
            this.unitName = unitName;
        }

//            每次marketview 的回调重绘，可以用来更新内容

        @Override
        public void refreshContent(Entry entry, Highlight highlight) {

//            设置Y轴数据源对象Entry的value值为显示的文本内容
            tvContent.setText("" + entry.getVal() + unitName);
        }

        @Override
        public int getXOffset(float v) {
//            水平居中
            return -(getWidth() / 2);
        }

        @Override
        public int getYOffset(float v) {
//            提示框在坐标点上方
            return -getHeight();
        }
    }
}
