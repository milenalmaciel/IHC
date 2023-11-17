package com.example.e1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNumber1;
    private EditText editTextNumber2;
    private Button btnSum;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber1 = findViewById(R.id.editTextNumber1);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        btnSum = findViewById(R.id.btnSum);
        textViewResult = findViewById(R.id.textViewResult);

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateSum();
            }
        });
    }

    private void calculateSum() {
        try {
            int num1 = Integer.parseInt(editTextNumber1.getText().toString());
            int num2 = Integer.parseInt(editTextNumber2.getText().toString());
            int soma = num1 + num2;
            textViewResult.setText("Resultado: " + soma);
        } catch (NumberFormatException e) {
            textViewResult.setText("Erro: Digite números válidos");
        }
    }

}