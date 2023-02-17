package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {
    TextView textMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        textMsg = findViewById(R.id.textMsg);
        Intent intent = getIntent();
        String text = intent.getStringExtra("msg");
        textMsg.setText(text);
    }
}