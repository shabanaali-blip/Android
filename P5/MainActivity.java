package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText result;
    Button zero, one, two, three, four, five, six, seven, eight, nine, equal, plus, minus, divide, multiply, clear, dot;

    String text, sign;
    float sum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (EditText) findViewById(R.id.result);

        zero = (Button) findViewById(R.id.zero);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);

        equal = (Button) findViewById(R.id.equal);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        divide = (Button) findViewById(R.id.divide);
        multiply = (Button) findViewById(R.id.multiply);
        dot = (Button) findViewById(R.id.dot);
        clear = (Button) findViewById(R.id.clear);


        zero.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);

        clear.setOnClickListener(this);
        minus.setOnClickListener(this);
        plus.setOnClickListener(this);
        divide.setOnClickListener(this);
        multiply.setOnClickListener(this);
        dot.setOnClickListener(this);
        equal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        text = result.getText().toString();
        if(v.getId() == R.id.zero)
            result.setText(text + "0");
        else if (v.getId() == R.id.one)
            result.setText(text + "1");
        else if (v.getId() == R.id.two)
            result.setText(text + "2");
        else if (v.getId() == R.id.three)
            result.setText(text + "3");
        else if (v.getId() == R.id.four)
            result.setText(text + "4");
        else if (v.getId() == R.id.five)
            result.setText(text + "5");
        else if (v.getId() == R.id.six)
            result.setText(text + "6");
        else if (v.getId() == R.id.seven)
            result.setText(text + "7");
        else if (v.getId() == R.id.eight)
            result.setText(text + "8");
        else if (v.getId() == R.id.nine)
            result.setText(text + "9");
        else if (v.getId() == R.id.dot)
            result.setText(text + ".");
        else if (v.getId() == R.id.plus) {
            sign = "+";
            sum = Float.valueOf(result.getText().toString());
            result.setText("");
        } else if (v.getId() == R.id.minus) {
            sign = "-";
            sum = Float.valueOf(result.getText().toString());
            result.setText("");
        } else if (v.getId() == R.id.multiply) {
            sign = "*";
            sum = Float.valueOf(result.getText().toString());
            result.setText("");
        } else if (v.getId() == R.id.divide) {
            sign = "/";
            sum = Float.valueOf(result.getText().toString());
            result.setText("");
        }
        else if (v.getId() == R.id.equal) {
            if (sign.equals("-")) {
                sum = sum - Float.valueOf(result.getText().toString());
                result.setText(String.valueOf(sum));
                sum = 0;
            } else if (sign.equals("+")) {
                sum = sum + Float.valueOf(result.getText().toString());
                result.setText(String.valueOf(sum));
                sum = 0;
            } else if (sign.equals("*")) {
                sum = sum * Float.valueOf(result.getText().toString());
                result.setText(String.valueOf(sum));
                sum = 0;
            } else if (sign.equals("/")) {
                sum = sum / Float.valueOf(result.getText().toString());
                result.setText(String.valueOf(sum));
                sum = 0;
            }
        } else if(v.getId() == R.id.clear)
            result.setText("");
    }
}