package com.statusstock.bargraph;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
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

public class Tab1 extends android.support.v4.app.Fragment {

    private BarChart barChart;
    private BarData barData;

    TextView textView, text_mnth, text_review;
    float crarr[] = {15875.26f, 43213.10f, 6211.20f, 23418.00f, 40589.00f, 25000.80f, 17231.70f, 21330.00f, 51230.40f, 53450.80f, 34210.00f, 65320.50f};
    float drarr[] = {9968.0f, 71357.0f, 40254.0f, 75845.0f, 17621.0f, 82423.0f, 8234.0f, 45430.0f, 15480.0f, 78540.0f, 40040.0f, 50125.0f};


    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.tab1, container, false);


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
                    text_mnth.setText("Jan 18");
                } else if (mth.equals("1.0")) {
                    text_mnth.setText("Feb 18");
                } else if (mth.equals("2.0")) {
                    text_mnth.setText("Mar 18");
                } else if (mth.equals("3.0")) {
                    text_mnth.setText("Apr 18");
                } else if (mth.equals("4.0")) {
                    text_mnth.setText("May 18");
                } else if (mth.equals("5.0")) {
                    text_mnth.setText("Jun 18");
                } else if (mth.equals("6.0")) {
                    text_mnth.setText("Jul 18");
                } else if (mth.equals("7.0")) {
                    text_mnth.setText("Aug 18");
                } else if (mth.equals("8.0")) {
                    text_mnth.setText("Sept 18");
                } else if (mth.equals("9.0")) {
                    text_mnth.setText("Oct 18");
                } else if (mth.equals("10.0")) {
                    text_mnth.setText("Nov 18");
                } else if (mth.equals("11.0")) {
                    text_mnth.setText("Dec 18");
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
        mPaint.setShader(new SweepGradient(0, 0, Color.parseColor("#ddfffb"), Color.parseColor("#eaf2ff")));
//        mPaint.setShader(new LinearGradient(1,5,5,5,new int[]{
//                Color.parseColor("#ffe100"),
//                Color.parseColor("#0043ff"),
//                Color.parseColor("#d1e2ff")},
//                new float[]{0,1,2}, Shader.TileMode.CLAMP));

        barDataSets = new ArrayList<>();
        barDataSets.add(barDataSetCr);
//        barDataSets.add(barDataSetDr);



        return barDataSets;

    }

    private ArrayList<String> getXValues() {

        ArrayList<String> xValues = new ArrayList<>();
        xValues.add("Jan");
        xValues.add("Feb");
        xValues.add("Mar");
        xValues.add("Apr");
        xValues.add("May");
        xValues.add("Jun");
        xValues.add("Jul");
        xValues.add("Aug");
        xValues.add("Sept");
        xValues.add("Oct");
        xValues.add("Nov");
        xValues.add("Dec");

        return xValues;

    }

}
