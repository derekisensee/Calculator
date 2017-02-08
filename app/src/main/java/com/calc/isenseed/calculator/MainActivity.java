package com.calc.isenseed.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import static com.calc.isenseed.calculator.R.id.button0;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = new ArrayList<>();
    }

    public void buttonPressed(View view) {
        TextView t = (TextView)findViewById(R.id.currentNum);

        switch (view.getId()) {
            case button0:
                Button b = (Button)findViewById(R.id.button0);
                a.add(b.getText().toString());
                break;
            case R.id.button1:
                Button b1 = (Button)findViewById(R.id.button1);
                a.add(b1.getText().toString());
                break;
            case R.id.button2:
                Button b2 = (Button)findViewById(R.id.button2);
                a.add(b2.getText().toString());
                break;
            case R.id.button3:
                Button b3 = (Button)findViewById(R.id.button3);
                a.add(b3.getText().toString());
                break;
            case R.id.button4:
                Button b4 = (Button)findViewById(R.id.button4);
                a.add(b4.getText().toString());
                break;
            case R.id.button5:
                Button b5 = (Button)findViewById(R.id.button5);
                a.add(b5.getText().toString());
                break;
            case R.id.button6:
                Button b6 = (Button)findViewById(R.id.button6);
                a.add(b6.getText().toString());
                break;
            case R.id.button7:
                Button b7 = (Button)findViewById(R.id.button7);
                a.add(b7.getText().toString());
                break;
            case R.id.button8:
                Button b8 = (Button)findViewById(R.id.button8);
                a.add(b8.getText().toString());
                break;
            case R.id.button9:
                Button b9 = (Button)findViewById(R.id.button9);
                a.add(b9.getText().toString());
                break;
            case R.id.add:
                Button add = (Button)findViewById(R.id.add);
                a.add(add.getText().toString());
                break;
            case R.id.subtract:
                Button subtract = (Button)findViewById(R.id.subtract);
                a.add(subtract.getText().toString());
                break;
            case R.id.multiply:
                Button multiply = (Button)findViewById(R.id.multiply);
                a.add(multiply.getText().toString());
                break;
            case R.id.divide:
                Button divide = (Button)findViewById(R.id.divide);
                a.add(divide.getText().toString());
                break;
            case R.id.clear:
                a = new ArrayList<>();
                break;
        }
        t.setText(a.toString());
    }
}