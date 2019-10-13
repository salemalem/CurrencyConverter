package com.example.currency_convertor_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convert(View view) {
        EditText dollarAmountEditText = findViewById(R.id.dollarAmountEditText);
        Double dollarAmountDouble = Double.parseDouble(dollarAmountEditText.getText().toString());

        // 1 dollar = 392 tenge
        Double tengeAmount = dollarAmountDouble * 392;
        Toast.makeText(MainActivity.this, tengeAmount.toString(), Toast.LENGTH_SHORT).show();
//        Log.i("amount", dollarAmountEditText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
