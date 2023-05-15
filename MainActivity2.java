package com.example.swapperandchecker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity2 extends AppCompatActivity {

    TextView Same_or_Not;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        Same_or_Not = findViewById(R.id.checking);

        String firstText = getIntent().getStringExtra("firstText");
        String secondText = getIntent().getStringExtra("secondText");

        if (firstText.equals(secondText)) {
            Same_or_Not.setText("SAME");
        }else {
            Same_or_Not.setText("NOT THE SAME");
        }

    }

}