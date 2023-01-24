package com.example.calculator01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editNum1,editNum2;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNum1= findViewById(R.id.editNum1);
        editNum2= findViewById(R.id.editNum2);
        textResult= findViewById(R.id.textResult);
    }

    public  void btnAdd(View view){
        double num1 = Double.parseDouble(editNum1.getText().toString());
        double num2 = Double.parseDouble(editNum2.getText().toString());
        double result =  num1 + num2;
        textResult.setText(Double.toString(result));
    }
    public  void btnSub(View view){
        double num1 = Double.parseDouble(editNum1.getText().toString());
        double num2 = Double.parseDouble(editNum2.getText().toString());
        double result =  num1 - num2;
        textResult.setText(Double.toString(result));
    }
    public  void btnMul(View view){
        double num1 = Double.parseDouble(editNum1.getText().toString());
        double num2 = Double.parseDouble(editNum2.getText().toString());
        double result =  num1 * num2;
        textResult.setText(Double.toString(result));
    }
    public  void btnDiv(View view){
        double num1 = Double.parseDouble(editNum1.getText().toString());
        double num2 = Double.parseDouble(editNum2.getText().toString());
        double result =  num1 / num2;
        textResult.setText(Double.toString(result));
    }
}
//