package com.statusstock.bargraph;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewPager;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tabLayout = findViewById(R.id.tab);
        viewPager = findViewById(R.id.viewpager);

        fragmentManager = getSupportFragmentManager();
        ViewPagerAdapter adapter = new ViewPagerAdapter(fragmentManager);

        adapter.AddFragment(new Tab1(), "12 Months");
        adapter.AddFragment(new Tab2(), "6 Months");
        adapter.AddFragment(new Tab3(), "3 Months");
        adapter.AddFragment(new Tab4(), "Months");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);


    }
}
