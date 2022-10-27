package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        final Button button = findViewById(R.id.button1);
        final Resources.Theme theme = getTheme();
        button.setOnClickListener(view -> button.setBackgroundColor(getResources().getColor(R.color.green, theme)));


    }
}

