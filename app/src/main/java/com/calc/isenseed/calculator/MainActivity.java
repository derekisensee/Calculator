package com.calc.isenseed.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.calc.isenseed.calculator.R.id.button0;
import static com.calc.isenseed.calculator.R.id.button1;
import static com.calc.isenseed.calculator.R.id.button2;
import static com.calc.isenseed.calculator.R.id.button3;
import static com.calc.isenseed.calculator.R.id.button4;
import static com.calc.isenseed.calculator.R.id.button5;
import static com.calc.isenseed.calculator.R.id.button6;
import static com.calc.isenseed.calculator.R.id.button7;
import static com.calc.isenseed.calculator.R.id.button8;
import static com.calc.isenseed.calculator.R.id.button9;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addString(View view) {
        //Button b = (Button)findViewById(R.id.button0);

        TextView t = (TextView)findViewById(R.id.currentNum);

        switch (view.getId()) {
            case button0:
                Button b = (Button)findViewById(R.id.button0);
                t.setText(b.getText().toString());
                break;
            case R.id.button1:
                Button b1 = (Button)findViewById(R.id.button1);
                t.setText(b1.getText().toString());
                break;
            case R.id.button2:
                Button b2 = (Button)findViewById(R.id.button2);
                t.setText(b2.getText().toString());
                break;
            case R.id.button3:
                Button b3 = (Button)findViewById(R.id.button3);
                t.setText(b3.getText().toString());
                break;
            case R.id.button4:
                Button b4 = (Button)findViewById(R.id.button4);
                t.setText(b4.getText().toString());
                break;
            case R.id.button5:
                Button b5 = (Button)findViewById(R.id.button5);
                t.setText(b5.getText().toString());
                break;
            case R.id.button6:
                Button b6 = (Button)findViewById(R.id.button6);
                t.setText(b6.getText().toString());
                break;
            case R.id.button7:
                Button b7 = (Button)findViewById(R.id.button7);
                t.setText(b7.getText().toString());
                break;
            case R.id.button8:
                Button b8 = (Button)findViewById(R.id.button8);
                t.setText(b8.getText().toString());
                break;
            case R.id.button9:
                Button b9 = (Button)findViewById(R.id.button9);
                t.setText(b9.getText().toString());
                break;

        }
    }
}
