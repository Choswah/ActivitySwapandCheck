package com.example.swapperandchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button swap, check;
    EditText TextOne, TextTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        check = findViewById(R.id.check);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String firstText = TextOne.getText().toString();
                String secondText = TextTwo.getText().toString();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("firstText", firstText);
                intent.putExtra("secondText", secondText);
                startActivity(intent);
            }
        });

        TextOne = findViewById(R.id.TextOne);
        TextTwo = findViewById(R.id.TextTwo);
        check = findViewById(R.id.swap);

        check.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String swapping = TextOne.getText().toString();
                TextOne.setText(TextTwo.getText().toString());
                TextTwo.setText(swapping);
            }
        });
    }
}
