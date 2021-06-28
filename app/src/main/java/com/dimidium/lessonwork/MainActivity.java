package com.dimidium.lessonwork;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.View;
import android.content.pm.ActivityInfo;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonOne;
    Button buttonTwo;
    Button buttonThree;
    Button buttonFour;
    Button buttonFive;
    Button buttonSix;
    Button buttonSeven;
    Button buttonEight;
    Button buttonNine;
    Button buttonPlus;
    Button buttonMinus;
    Button buttonMultiply;
    Button buttonDivide;
    Button buttonResult;
    TextView displayResult;

    String resultTyping = " ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayResult = findViewById(R.id.displayResult);
        buttonOne = findViewById(R.id.buttonOne);
        buttonTwo = findViewById(R.id.buttonTwo);
        buttonTwo = findViewById(R.id.buttonThree);
        buttonTwo = findViewById(R.id.buttonFour);
        buttonTwo = findViewById(R.id.buttonFive);
        buttonTwo = findViewById(R.id.buttonSix);
        buttonTwo = findViewById(R.id.buttonSeven);
        buttonTwo = findViewById(R.id.buttonEight);
        buttonTwo = findViewById(R.id.buttonNine);
        buttonTwo = findViewById(R.id.buttonPlus);
        buttonTwo = findViewById(R.id.buttonMinus);
        buttonTwo = findViewById(R.id.buttonMultiply);
        buttonTwo = findViewById(R.id.buttonDivide);
        buttonResult = findViewById(R.id.buttonResult);

        displayResult.setOnClickListener(this);
        buttonOne.setOnClickListener(this);
        buttonTwo.setOnClickListener(this);
        buttonThree.setOnClickListener(this);
        buttonFour.setOnClickListener(this);
        buttonFive.setOnClickListener(this);
        buttonSix.setOnClickListener(this);
        buttonSeven.setOnClickListener(this);
        buttonEight.setOnClickListener(this);
        buttonNine.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
        buttonResult.setOnClickListener(this);

    }


    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View view) {



         if (view.getId() == R.id.buttonOne) {
                resultTyping = resultTyping + "1";
            } else if (view.getId() == R.id.buttonTwo) {
                resultTyping = resultTyping + "2";
            } else if (view.getId() == R.id.buttonThree) {
                resultTyping = resultTyping + "3";
            }else if (view.getId() == R.id.buttonFour) {
                resultTyping = resultTyping + "4";
            } else if (view.getId() == R.id.buttonFive) {
                resultTyping = resultTyping + "5";
            } else if (view.getId() == R.id.buttonSix) {
                resultTyping = resultTyping + "6";
            } else if (view.getId() == R.id.buttonSeven) {
                resultTyping = resultTyping + "7";
            } else if (view.getId() == R.id.buttonEight) {
                resultTyping = resultTyping + "8";
            } else if (view.getId() == R.id.buttonNine) {
                resultTyping = resultTyping + "9";
            } else if (view.getId() == R.id.buttonPlus) {
                resultTyping = resultTyping + "+";
            }else if (view.getId() == R.id.buttonMinus) {
                resultTyping = resultTyping + "-";
            }else if (view.getId() == R.id.buttonMultiply) {
                resultTyping = resultTyping + "*";
            }else if (view.getId() == R.id.buttonDivide) {
                resultTyping = resultTyping + "/";
            }else if (view.getId() == R.id.buttonResult) {
             resultTyping = resultTyping + "=";
            }
            displayResult.setText(resultTyping);
       }
    }




     /*
        if (v.getId() == R.id.buttonOne) {
            displayResult.setText(resultTyping + "1");
        } else if (v.getId() == R.id.buttonTwo) {
            displayResult.setText(resultTyping + "2");
            }
        */


 /*
    switch (v.getId()){
            case R.id.buttonOne:
                displayResult.setText(resultTyping + "1");
                break;
            case R.id.buttonTwo:
                displayResult.setText(resultTyping + "2");
                break;
        }*/


/*
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonOne:
                Button buttonOne = findViewById(R.id.buttonOne);
                buttonOne.setOnClickListener(this);
                positionNamber--;
                updatePosition();
                break;

            case R.id.buttonTwo:
                Button buttonTwo = findViewById(R.id.buttonTwo);
                buttonTwo.setOnClickListener(this);
                positionNamber++;
                updatePosition();
                break;
        }


        }
    public void updatePosition() {
        displayResult = findViewById(R.id.displayResult);
        displayResult.setText(Integer.toString(positionNamber));
    }


}
*/

   /* Button buttonUp = findViewById(R.id.buttonOne);
    Button buttonDown = findViewById(R.id.buttonTwo);
    Button buttonPlus = findViewById(R.id.buttonPlus);
    Button buttonMinus = findViewById(R.id.buttonMinus);
    TextView displayResult = findViewById(R.id.displayResult);

    updatePosition ();

        buttonUp.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v)  {
            positionNamber++;
            updatePosition ();
        }
    });

//        Button num_0 = findViewById(R.id.num_0);
//        num_0.setOnClickListener(this);


        buttonDown.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            positionNamber--;
            updatePosition ();
        }
    });
}

    private void updatePosition (){
        displayResult.setText(Integer.toString(positionNamber));*/

