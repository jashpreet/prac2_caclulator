package com.example.hp.prac2_caclulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText val1 , val2 ;
    TextView ans ;
    Button plus, minus , multiply , divide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val1 = findViewById(R.id.val1);
        val2 = findViewById(R.id.val2);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        ans = findViewById(R.id.ans);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int v1 = Integer.parseInt(val1.getText().toString());
                int v2 = Integer.parseInt(val2.getText().toString());
                int res = v1+v2;
                String result = ""+res;
                ans.setText(result);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int v1 = Integer.parseInt(val1.getText().toString());
                int v2 = Integer.parseInt(val2.getText().toString());
                int res = v1-v2;
                String result = ""+res;
                ans.setText(result);

            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int v1 = Integer.parseInt(val1.getText().toString());
                int v2 = Integer.parseInt(val2.getText().toString());
                int res = v1*v2;
                String result = ""+res;
                ans.setText(result);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int v1 = Integer.parseInt(val1.getText().toString());
                int v2 = Integer.parseInt(val2.getText().toString());
                int res = v1/v2;
                String result = ""+res;
                ans.setText(result);
            }
        });

    }
}
