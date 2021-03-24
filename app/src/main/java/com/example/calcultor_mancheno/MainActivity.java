package com.example.calcultor_mancheno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button cButton;
    Button plusDivideSubtract;
    Button ceButton;
    Button divide;
    Button add;
    Button subtract;
    Button multiply;
    Button period;
    Button equal;
    Button number0;
    Button number1;
    Button number2;
    Button number3;
    Button number4;
    Button number5;
    Button number6;
    Button number7;
    Button number8;
    Button number9;
    TextView resultView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cButton = (Button)findViewById(R.id.cButton);




        plusDivideSubtract = (Button)findViewById(R.id.plusDivideSubtract);
        ceButton = (Button)findViewById(R.id.ceButton);
        divide = (Button)findViewById(R.id.divideButton);
        add = (Button)findViewById(R.id.addButton);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resultView.setText(resultView.getText().toString() + "+");




            }
        });



        subtract = (Button)findViewById(R.id.subtractButton);
        multiply = (Button)findViewById(R.id.multiplyButton);
        period = (Button)findViewById(R.id.periodButton);
        equal = (Button)findViewById(R.id.equalButton);

        resultView = (TextView) findViewById(R.id.resultView);







        number0 = (Button)findViewById(R.id.zeroButton);
        number0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    resultView.setText(resultView.getText().toString() + "0");


            }
        });



        number1= (Button)findViewById(R.id.oneButton);
        number1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText(resultView.getText().toString() + "1");
            }
        });


        number2 = (Button)findViewById(R.id.twoButton);
        number2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText(resultView.getText().toString() + "2");
            }
        });


        number3 = (Button)findViewById(R.id.threeButton);
        number3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText(resultView.getText().toString() + "3");
            }
        });

        number4 = (Button)findViewById(R.id.fourButton);
        number4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText(resultView.getText().toString() + "4");
            }
        });

        number5 = (Button)findViewById(R.id.fiveButton);
        number5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText(resultView.getText().toString() + "5");
            }
        });

        number6 = (Button)findViewById(R.id.sixButton);
        number6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText(resultView.getText().toString() + "6");
            }
        });

        number7 = (Button)findViewById(R.id.sevenButton);
        number7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText(resultView.getText().toString() + "7");
            }
        });

        number8 = (Button)findViewById(R.id.eightButton);
        number8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 resultView.setText(resultView.getText().toString() + "8");
            }
        });

        number9 = (Button)findViewById(R.id.nineButton);
        number9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultView.setText(resultView.getText().toString() + "0");
            }
        });
    }
}