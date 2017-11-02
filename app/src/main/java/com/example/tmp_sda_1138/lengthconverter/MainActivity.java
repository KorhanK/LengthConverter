package com.example.tmp_sda_1138.lengthconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public double enteredNumber;
    public double convertedNumber;

    public void convert(View p){
        EditText entered = (EditText) findViewById(R.id.numberText);
        double m = 3.28084;

        enteredNumber = Double.parseDouble(entered.getText().toString());
        convertedNumber = enteredNumber*m;

        TextView result = (TextView) findViewById(R.id.targetText);
        result.setText(convertedNumber + "");

    }
}
