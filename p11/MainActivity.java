package com.example.uivalidation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements TextWatcher, View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    int num = 0;
    EditText percentage;
    CheckBox cb;
    ToggleButton tb;
    LinearLayout lin;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t = (TextView) findViewById(R.id.t);
        percentage = (EditText) findViewById(R.id.percentage);
        cb = (CheckBox) findViewById(R.id.cb);
        tb = (ToggleButton) findViewById(R.id.tb);
        lin = (LinearLayout) findViewById(R.id.lin);

        cb.setOnClickListener(this);
        tb.setOnCheckedChangeListener(this);
        percentage.addTextChangedListener(this);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {}

    @Override
    public void afterTextChanged(Editable s) {
        if(s != null && !TextUtils.isEmpty(s)) {
            num = Integer.parseInt(String.valueOf(s));
            if(num > 100)
                s.replace(0, s.length(), "100");
        }
    }

    @Override
    public void onClick(View v) {
        if(cb.isChecked())
            Toast.makeText(this,"Accepted", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this,"Please accept", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(isChecked) {
            lin.setBackgroundColor(Color.DKGRAY);
            t.setTextColor(Color.WHITE);
            cb.setTextColor(Color.WHITE);
            percentage.setTextColor(Color.WHITE);
        } else {
            lin.setBackgroundColor(Color.WHITE);
            t.setTextColor(Color.BLACK);
            cb.setTextColor(Color.BLACK);
            percentage.setTextColor(Color.BLACK);
        }
    }
}
