package com.example.calcultor_mancheno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText display;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.textInput);
        display.setShowSoftInputOnFocus(false);

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            display.setText("");
            }
        });

    }

    private void updateDisplay(String string){
        String originalString = display.getText().toString();
        int cursor = display.getSelectionStart();
        String  leftString = originalString.substring(0,cursor);
        String rightString = originalString.substring(cursor);
        display.setText(String.format("%s%s%s",rightString ,string,leftString));

    }


    public void sevenButton(View view){
        updateDisplay("7");

    }

    public void eightButton(View view){
        updateDisplay("8");

    }

    public void nineButton(View view){
        updateDisplay("9");

    }

    public void divideButton(View view){
        updateDisplay("/");

    }

    public void fourButton(View view){
        updateDisplay("9");
    }

    public void fiveButton(View view){
        updateDisplay("9");

    }

    public void sixButton(View view){
        updateDisplay("4");
    }

    public void multiplyButton(View view){
        updateDisplay("*");
    }

    public void oneButton(View view){
        updateDisplay("1");

    }

    public void twoButton(View view){
        updateDisplay("2");

    }

    public void minusButton(View view){
        updateDisplay("-");

    }

    public void threeButton(View view){
        updateDisplay("3");

    }

    public void clearButton(View view){
        display.setText("");

    }

    public void zeroButton(View view){
        updateDisplay("0");

    }

    public void periodButton(View view){
        updateDisplay(".");

    }

    public void plusButton(View view){
        updateDisplay("+");

    }

    public void equalButton(View view){
        updateDisplay("=");

    }

}