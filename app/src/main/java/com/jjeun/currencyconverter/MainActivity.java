package com.jjeun.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view){

        EditText currencyTextField = (EditText) findViewById(R.id.currencyTextField);
        double currency = Double.parseDouble(currencyTextField.getText().toString());
        currency = currency * 1063.59;

        Toast.makeText(MainActivity.this, String.format("%.2f", currency) + " \u20A9", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
