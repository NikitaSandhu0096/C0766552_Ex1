package com.nikita.c0766552_ex1;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView txtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        ActionBar actBar =getSupportActionBar();
        actBar.setTitle("Welcome");

        txtView = findViewById(R.id.txtView);
        Intent rInt =getIntent();
        String a = rInt.getStringExtra("user");
        txtView.setTextColor(getResources().getColor(R.color.incorrect));
        txtView.setTextSize(20);
        txtView.setText("Welcome, " + a);
    }
}
