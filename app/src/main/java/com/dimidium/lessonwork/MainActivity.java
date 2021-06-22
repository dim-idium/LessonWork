package com.dimidium.lessonwork;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.View;
import android.content.pm.ActivityInfo;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;


public class MainActivity extends AppCompatActivity {

    Integer positionNamber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonUp = findViewById(R.id.goUp);
        Button buttonDown = findViewById(R.id.goDown);
        TextView position = findViewById(R.id.position);

        buttonUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionNamber++;
                position.setText(Integer.toString(positionNamber));
            }
        });

        buttonDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                positionNamber--;
                position.setText(Integer.toString(positionNamber+1));
            }
        });

    }
}