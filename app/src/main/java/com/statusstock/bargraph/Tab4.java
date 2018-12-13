package com.statusstock.bargraph;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.SweepGradient;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.Highlight;

import java.util.ArrayList;

public class Tab4 extends android.support.v4.app.Fragment {

    private BarChart barChart;
    private BarData barData;

    TextView textView, text_mnth, text_review;
    float crarr[] = {158f, 43f, 621f, 631f, 123f, 342f, 532f, 243f, 832f, 146f, 735f, 425f, 642f, 721f, 323f, 532f, 566f, 224f, 345f, 345f, 753f, 623f, 233f, 454f, 222f, 122f, 23f, 433f, 33f, 22f, 276f, };
    float drarr[] = {9968.0f, 71357.0f, 40254.0f, 75845.0f, 17621.0f, 82423.0f, 8234.0f, 45430.0f, 15480.0f, 78540.0f, 40040.0f, 50125.0f};


    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.tab4, container, false);


        textView = view.findViewById(R.id.text);
        text_mnth = view.findViewById(R.id.month);
        text_review = view.findViewById(R.id.review);

        barChart = view.findViewById(R.id.barchart);
        barData = new BarData(getXValues(), getBarValues());
        barData.setValueTextColor(Color.WHITE);
        barChart.setData(barData);
        barChart.getXAxis().setTextColor(Color.WHITE);
        barChart.getAxisLeft().setDrawGridLines(false);
        barChart.getXAxis().setDrawGridLines(false);
        barChart.setDescription("");    // Hide the description
        barChart.getAxisLeft().setDrawLabels(false);
        barChart.getAxisRight().setDrawLabels(false);
        barChart.getXAxis().setDrawLabels(true);
        barChart.getLegend().setEnabled(false);

        barChart.setBackgroundColor(Color.parseColor("#010635"));
        barChart.setGridBackgroundColor(Color.parseColor("#010635"));
        barChart.animateXY(3000, 3000);
        barChart.invalidate();


        XAxis xAxis = barChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);

        YAxis yAxisRight = barChart.getAxisRight();
        yAxisRight.setEnabled(false);

        YAxis yAxisLeft = barChart.getAxisLeft();
        yAxisLeft.setEnabled(false);


        barChart.setOnChartValueSelectedListener(new OnChartValueSelectedListener() {
            @Override
            public void onValueSelected(Entry e, int dataSetIndex, Highlight h) {
                float x = e.getVal();
                String s = Float.toString(x);
                textView.setText("₹ " + s);
                text_review.setVisibility(View.VISIBLE);


                float mnth = e.getXIndex();
                String mth = Float.toString(mnth);
                text_mnth.setText(mth);

                if (mth.equals("0.0")) {
                    text_mnth.setText("1st");
                } else if (mth.equals("1.0")) {
                    text_mnth.setText("2nd");
                } else if (mth.equals("2.0")) {
                    text_mnth.setText("3rd");
                } else if (mth.equals("3.0")) {
                    text_mnth.setText("4th");
                } else if (mth.equals("4.0")) {
                    text_mnth.setText("5th");
                } else if (mth.equals("5.0")) {
                    text_mnth.setText("6th");
                } else if (mth.equals("6.0")) {
                    text_mnth.setText("7th");
                } else if (mth.equals("7.0")) {
                    text_mnth.setText("8th");
                } else if (mth.equals("8.0")) {
                    text_mnth.setText("9th");
                } else if (mth.equals("9.0")) {
                    text_mnth.setText("10th");
                } else if (mth.equals("10.0")) {
                    text_mnth.setText("11th");
                } else if (mth.equals("12.0")) {
                    text_mnth.setText("12th");
                } else if (mth.equals("13.0")) {
                    text_mnth.setText("13th");
                } else if (mth.equals("14.0")) {
                    text_mnth.setText("12th");
                } else if (mth.equals("15.0")) {
                    text_mnth.setText("12th");
                } else if (mth.equals("16.0")) {
                    text_mnth.setText("16th");
                } else if (mth.equals("16.0")) {
                    text_mnth.setText("17th");
                } else if (mth.equals("17.0")) {
                    text_mnth.setText("18th");
                } else if (mth.equals("18.0")) {
                    text_mnth.setText("19th");
                } else if (mth.equals("19.0")) {
                    text_mnth.setText("20th");
                } else if (mth.equals("20.0")) {
                    text_mnth.setText("21th");
                } else if (mth.equals("21.0")) {
                    text_mnth.setText("22th");
                } else if (mth.equals("22.0")) {
                    text_mnth.setText("23th");
                } else if (mth.equals("23.0")) {
                    text_mnth.setText("24th");
                } else if (mth.equals("24.0")) {
                    text_mnth.setText("25th");
                } else if (mth.equals("25.0")) {
                    text_mnth.setText("26th");
                } else if (mth.equals("26.0")) {
                    text_mnth.setText("27th");
                } else if (mth.equals("27.0")) {
                    text_mnth.setText("28th");
                } else if (mth.equals("28.0")) {
                    text_mnth.setText("29th");
                } else if (mth.equals("29.0")) {
                    text_mnth.setText("30th");
                } else if (mth.equals("30.0")) {
                    text_mnth.setText("31st");
                }


            }

            @Override
            public void onNothingSelected() {

            }
        });

        return view;
    }


    private ArrayList<BarDataSet> getBarValues() {

        ArrayList<BarDataSet> barDataSets;

        ArrayList<BarEntry> barEntriesCr = new ArrayList<>();
        ArrayList<BarEntry> barEntriesDr = new ArrayList<>();


        for (int i = 0; i < crarr.length; i++) {
            barEntriesCr.add(new BarEntry(crarr[i], i));
        }

        for (int i = 0; i < drarr.length; i++) {
            barEntriesDr.add(new BarEntry(drarr[i], i));
        }

//        BarEntry barEntry1 = new BarEntry(16.0f, 0);
//        BarEntry barEntry2 = new BarEntry(23.0f, 1);
//        BarEntry barEntry3 = new BarEntry(35.0f, 2);
//        BarEntry barEntry4 = new BarEntry(14.0f, 3);
//        BarEntry barEntry5 = new BarEntry(27.0f, 4);
//        BarEntry barEntry6 = new BarEntry(20.0f, 5);
//        BarEntry barEntry7 = new BarEntry(15.0f, 6);
//
//        barEntries.add(barEntry1);
//        barEntries.add(barEntry2);
//        barEntries.add(barEntry3);
//        barEntries.add(barEntry4);
//        barEntries.add(barEntry5);
//        barEntries.add(barEntry6);
//        barEntries.add(barEntry7);


        BarDataSet barDataSetCr = new BarDataSet(barEntriesCr, "Credits");
        BarDataSet barDataSetDr = new BarDataSet(barEntriesDr, "Debits");
        barDataSetCr.setColor(Color.parseColor("#ededed"));
        barDataSetDr.setColor(Color.parseColor("#ffd3d3"));

        barDataSetCr.setBarSpacePercent(40);
        barDataSetDr.setBarSpacePercent(40);

        barDataSetCr.setDrawValues(false);
        barDataSetDr.setDrawValues(false);

        Paint mPaint = barChart.getRenderer().getPaintRender();
        mPaint.setShader(new SweepGradient(10, 15, Color.parseColor("#bcbaff"), Color.parseColor("#ffffff")));
//        mPaint.setShader(new LinearGradient(0,10,20,50,new   int[]{Color.parseColor("#ffffff"),Color.parseColor("#0043ff"),Color.parseColor("#000000")},new float[]{1,2,3}, Shader.TileMode.CLAMP));

        barDataSets = new ArrayList<>();
        barDataSets.add(barDataSetCr);
//        barDataSets.add(barDataSetDr);



        return barDataSets;

    }

    private ArrayList<String> getXValues() {

        ArrayList<String> xValues = new ArrayList<>();


        xValues.add("1");
        xValues.add("2");
        xValues.add("3");
        xValues.add("4");
        xValues.add("5");
        xValues.add("6");
        xValues.add("7");
        xValues.add("8");
        xValues.add("9");
        xValues.add("10");
        xValues.add("11");
        xValues.add("12");
        xValues.add("13");
        xValues.add("14");
        xValues.add("15");
        xValues.add("16");
        xValues.add("17");
        xValues.add("18");
        xValues.add("19");
        xValues.add("20");
        xValues.add("21");
        xValues.add("22");
        xValues.add("23");
        xValues.add("24");
        xValues.add("25");
        xValues.add("26");
        xValues.add("27");
        xValues.add("28");
        xValues.add("29");
        xValues.add("30");
        xValues.add("31");

        return xValues;

    }

}
