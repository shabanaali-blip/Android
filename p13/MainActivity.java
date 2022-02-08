package com.example.tablelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button clear;
    EditText email, name, username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText) findViewById(R.id.email);
        name = (EditText) findViewById(R.id.name);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);

        clear = (Button) findViewById(R.id.clear);
        clear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        email.setText("");
        name.setText("");
        username.setText("");
        password.setText("");
    }
}
