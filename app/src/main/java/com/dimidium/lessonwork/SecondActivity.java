package com.dimidium.lessonwork;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity<clickCount> extends AppCompatActivity {

private static final String ARG_COUNT = "ARG_COUNT";

private TextView clickCount;

private int clicks = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        clickCount = findViewById(R.id.count_msg);
        updateCount();


        findViewById(R.id.btn_click).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicks++;
                updateCount();
            }
        });
    }


    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        clicks = savedInstanceState.getInt(ARG_COUNT, 0);
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putInt(ARG_COUNT,clicks);
        super.onSaveInstanceState(outState);
    }

    private void updateCount() {
        clickCount.setText(getString(R.string.clickCount,clicks));
    }

}