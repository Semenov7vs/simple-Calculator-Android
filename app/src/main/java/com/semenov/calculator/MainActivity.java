package com.semenov.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultTextView;
    private EditText number_field_1;
    private EditText number_field_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView = findViewById(R.id.resultTextView);
        number_field_1 = findViewById(R.id.number_field_1);
        number_field_2 = findViewById(R.id.number_field_2);
        Button add_button = findViewById(R.id.add_button);

        add_button.setOnClickListener(view -> {
            float num1 = Float.parseFloat(number_field_1.getText().toString());
            float num2 = Float.parseFloat(number_field_2.getText().toString());
            float res = num1 + num2;
            resultTextView.setText(String.valueOf(res));
        });
    }
}