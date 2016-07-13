package com.reynersubrata.balancecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button1,button2,button3,button4,button5,button6;
    private Button button7, button8, button9, button0,buttondel,buttonclear;
    private ImageButton resbutton;
    private EditText income, outcome, val;
    private TextView result;
    int evalue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = (TextView)findViewById(R.id.tv_Result);
        resbutton = (ImageButton) findViewById(R.id.ResButton);
        resbutton.setOnClickListener(this);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);
        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);
        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(this);
        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(this);
        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(this);
        button0 = (Button) findViewById(R.id.button0);
        button0.setOnClickListener(this);
        buttondel = (Button) findViewById(R.id.buttondel);
        buttondel.setOnClickListener(this);
        buttonclear = (Button) findViewById(R.id.buttonclear);
        buttonclear.setOnClickListener(this);
        income = (EditText) findViewById(R.id.Income);
        outcome = (EditText) findViewById(R.id.outcome);
        val = (EditText) findViewById(R.id.Val);
        income.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                evalue = 1;
                return false;
            }
        });
        outcome.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                evalue = 2;
                return false;
            }
        });
    }

    @Override
    public void onClick(View view) {
        if(evalue == 1){
            if(view==button1){
                income.append("1");
            }
            if(view==button2){
                income.append("2");
            }
            if(view==button3){
                income.append("3");
            }
            if(view==button4){
                income.append("4");
            }
            if(view==button5){
                income.append("5");
            }
            if(view==button6){
                income.append("6");
            }
            if(view==button7){
                income.append("7");
            }
            if(view==button8){
                income.append("8");
            }
            if(view==button9){
                income.append("9");
            }
            if(view==button0){
                income.append("0");
            }
            if(view==buttonclear){
                income.setText("");
            }
            if(view==buttondel){
                if(income.length()>1){
                    income.getText().delete(income.length()-1,income.length());
                }else{
                    income.setText("");
                }
        }




        }else if(evalue == 2){
                if(view==button1){
                    outcome.append("1");
                }
                if(view==button2){
                    outcome.append("2");
                }
                if(view==button3){
                    outcome.append("3");
                }
                if(view==button4){
                    outcome.append("4");
                }
                if(view==button5){
                    outcome.append("5");
                }
                if(view==button6){
                    outcome.append("6");
                }
                if(view==button7){
                    outcome.append("7");
                }
                if(view==button8){
                    outcome.append("8");
                }
                if(view==button9){
                    outcome.append("9");
                }
                if(view==button0){
                    outcome.append("0");
                }
                if(view==buttonclear){
                    outcome.setText("");
                }
                if(view==buttondel){
                    if(outcome.length()>1){
                        outcome.getText().delete(outcome.length()-1,outcome.length());
                    }else{
                        outcome.setText("");
                    }
                }
        }
        if(view ==resbutton){
            int a = Integer.parseInt(income.toString());
            int b = Integer.parseInt(outcome.toString());
            int resultfinal = a-b;
            val.setText(resultfinal);
        }
    }
}
