package com.example.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button addButton = findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumEditText = findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = findViewById(R.id.secondNumEditText);
                TextView resultTextView = findViewById(R.id.resultTextView);
                int num1;
                int num2;
                try{
                    num1 = Integer.parseInt(firstNumEditText.getText().toString());
                }catch (Exception e){
                    num1 = 0;
                }
                try{
                    num2 = Integer.parseInt(secondNumEditText.getText().toString());
                }catch (Exception e){
                    num2 = 0;
                }
                int result = num1 + num2;
                resultTextView.setText(result + "");
            }
        });
    }
}
