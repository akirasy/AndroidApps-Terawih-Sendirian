package com.urbanmusleem.terawihsendirian;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Terawih2Activity extends AppCompatActivity {

    private int[] image = new int[] {
            R.drawable.ic_al_fatihah,
            R.drawable.ic_al_takathur,
            R.drawable.ic_al_fatihah,
            R.drawable.ic_al_asr,
            R.drawable.ic_selawat_terawih04_01,
            R.drawable.ic_selawat_terawih04_02,
            R.drawable.ic_selawat_terawih04_03
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terawih2);
        actionButton();
        actionViewPager();
    }

    private void actionButton() {
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Terawih2Activity.this, Terawih4Activity.class);
                startActivity(intent);
            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Terawih2Activity.this, SelawatActivity.class);
                startActivity(intent);
            }
        });

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Terawih2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    private void actionViewPager() {
        ViewPager viewPager = findViewById(R.id.pager1);
        ImageViewPagerAdapter adapter = new ImageViewPagerAdapter(this, image);
        viewPager.setAdapter(adapter);
    }
}
