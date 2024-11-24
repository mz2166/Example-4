package com.example.exanple_4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private EditText et_num1,et_num2;
private TextView tv_result;
private Button btnPlus,btnMinus,btnMull,btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_num1=findViewById(R.id.etNum1);
        et_num2=findViewById(R.id.etNum2);
        tv_result=findViewById(R.id.tvResult);
        btnPlus=findViewById(R.id.btnPlus);
        btnPlus.setOnClickListener(this);
        btnMinus=findViewById(R.id.btnMinus);
        btnMinus.setOnClickListener(this);
        btnMull=findViewById(R.id.btnMull);
        btnMull.setOnClickListener(this);
        btnDiv=findViewById(R.id.btnDiv);
        btnDiv.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (!(et_num1.getText().toString().isEmpty() || et_num2.getText().toString().isEmpty())) {
            int num1, num2;
            num1 = Integer.parseInt(et_num1.getText().toString());
            num2 = Integer.parseInt(et_num2.getText().toString());
            et_num1.setText(null);
            et_num2.setText("");
            if (view.getId() == R.id.btnPlus) {
                tv_result.setText(String.valueOf(num1 + num2));
            }
            if (view.getId() == R.id.btnMinus) {
                tv_result.setText(String.valueOf(num1 - num2));
            }
            if (view.getId() == R.id.btnMull) {
                tv_result.setText(String.valueOf(num1 * num2));
            }
            if (view.getId() == R.id.btnDiv) {
                if (Integer.parseInt(et_num2.getText().toString())==0) {
                    tv_result.setText("cant divide by zero");
                }
                else {
                    tv_result.setText(String.valueOf(num1 / num2));

                }

            }
        }
        else {
            if (et_num1.getText().toString().isEmpty()){
                et_num1.setError("numner 1 is empty");
            }
            else {
                et_num2.setError("number 2 is empty");
            }
        }
    }
}