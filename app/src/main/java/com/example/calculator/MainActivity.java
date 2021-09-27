package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    /*
    Click functions 1-4 paired with add, subtract, multiply, and divide
    */
    public void clickFunctionAdd(View view){

        EditText num1 = (EditText) findViewById(R.id.enterNumber1);
        EditText num2 = (EditText) findViewById(R.id.enterNumber2);

        String str1 = num1.getText().toString();
        String str2 = num2.getText().toString();

        int int1 = Integer.parseInt(str1);
        int int2 = Integer.parseInt(str2);

        int result = int1 + int2;
        goToActivity2(String.valueOf(result));
    }

    public void clickFunctionSubtract(View view){

        EditText num1 = (EditText) findViewById(R.id.enterNumber1);
        EditText num2 = (EditText) findViewById(R.id.enterNumber2);

        String str1 = num1.getText().toString();
        String str2 = num2.getText().toString();

        int int1 = Integer.parseInt(str1);
        int int2 = Integer.parseInt(str2);

        int result = int1 - int2;
        goToActivity2(String.valueOf(result));
    }

    public void clickFunctionMultiply(View view){

        EditText num1 = (EditText) findViewById(R.id.enterNumber1);
        EditText num2 = (EditText) findViewById(R.id.enterNumber2);

        String str1 = num1.getText().toString();
        String str2 = num2.getText().toString();

        int int1 = Integer.parseInt(str1);
        int int2 = Integer.parseInt(str2);

        int result = int1 * int2;
        goToActivity2(String.valueOf(result));
    }

    public void clickFunctionDivide(View view){
        //Divide

        EditText num1 = (EditText) findViewById(R.id.enterNumber1);
        EditText num2 = (EditText) findViewById(R.id.enterNumber2);

        String str1 = num1.getText().toString();
        String str2 = num2.getText().toString();

        int int1 = Integer.parseInt(str1);
        int int2 = Integer.parseInt(str2);

        int result = int1 / int2;
        goToActivity2(String.valueOf(result));
    }
    /*
    Function to queue the transition to activity 2
     */
    public void goToActivity2(String result){
        Intent intent = new Intent( this, MainActivity2.class);
        intent.putExtra("message", result);
        startActivity(intent);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}