package com.statusstock.bargraph;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;

public class MainActivity extends AppCompatActivity {


    FloatingActionButton btn1, btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final FloatingActionMenu floatingActionMenu = findViewById(R.id.floatingActionMenu);
        floatingActionMenu.setClosedOnTouchOutside(true);

//        AnimatorSet set = new AnimatorSet();
//
//
//        ObjectAnimator scaleOutX = ObjectAnimator.ofFloat(floatingActionMenu.getMenuIconView(), "scaleX", 1.0f, 0.2f);
//        ObjectAnimator scaleOutY = ObjectAnimator.ofFloat(floatingActionMenu.getMenuIconView(), "scaleY", 1.0f, 0.2f);
//
//        ObjectAnimator scaleInX = ObjectAnimator.ofFloat(floatingActionMenu.getMenuIconView(), "scaleX", 0.2f, 1.0f);
//        ObjectAnimator scaleInY = ObjectAnimator.ofFloat(floatingActionMenu.getMenuIconView(), "scaleY", 0.2f, 1.0f);
//
//        scaleOutX.setDuration(50);
//        scaleOutY.setDuration(50);
//
//        scaleInX.setDuration(150);
//        scaleInY.setDuration(150);
//
//        scaleInX.addListener(new AnimatorListenerAdapter() {
//            @Override
//            public void onAnimationStart(Animator animation) {
//                floatingActionMenu.getMenuIconView().setImageResource(floatingActionMenu.isOpened()
//                        ? R.drawable.ic_add_white_24dp : R.drawable.ic_close_white_24dp);
//            }
//        });
//
//        set.play(scaleOutX).with(scaleOutY);
//        set.play(scaleInX).with(scaleInY).after(scaleOutX);
//        set.setInterpolator(new OvershootInterpolator(2));
//
//        floatingActionMenu.setIconToggleAnimatorSet(set);


        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
