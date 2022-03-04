package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1, t2;
    Button bl, ro, fa, mo, sl, zo, bo, in, st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        t1 = (TextView) findViewById(R.id.textView);
        t2 = (TextView) findViewById(R.id.textView2);

        bl = (Button) findViewById(R.id.button);
        ro = (Button) findViewById(R.id.button1);
        fa = (Button) findViewById(R.id.button2);
        mo = (Button) findViewById(R.id.button3);
        sl = (Button) findViewById(R.id.button4);
        zo = (Button) findViewById(R.id.button5);
        bo = (Button) findViewById(R.id.button6);
        in = (Button) findViewById(R.id.button7);
        st = (Button) findViewById(R.id.button8);

        bl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.blink));
            }

        });

        ro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate));
            }
        });

        fa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade));
            }

        });
        mo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.move));
            }

        });
        sl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.slide));
            }

        });
        zo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom));
            }

        });
        bo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce));
            }

        });
        in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.interpolator));
            }

        });
        st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               view.clearAnimation();
            }

        });
    }
}