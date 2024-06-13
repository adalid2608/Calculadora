package com.adalid.basicsapp9b;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText txtNum1;
    private EditText txtNum2;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum1 = findViewById(R.id.txtNum1);
        txtNum2 = findViewById(R.id.txtNum2);
        txtResult = findViewById(R.id.txtResult);
    }

    public void sumar(View view) {
        if (txtNum1.getText().toString().isEmpty() || txtNum2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Ingrese los números que desea sumar", Toast.LENGTH_SHORT).show();
            return;
        }else {
        float num1 = Float.parseFloat(txtNum1.getText().toString());
        float num2 = Float.parseFloat(txtNum2.getText().toString());
        float result = num1 + num2;

        txtResult.setText(String.valueOf(result));
        }
    }
    public void restar(View view) {
        if (txtNum1.getText().toString().isEmpty() || txtNum2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Ingrese los números que desea restar", Toast.LENGTH_SHORT).show();
            return;
        }else {
            float num1 = Float.parseFloat(txtNum1.getText().toString());
            float num2 = Float.parseFloat(txtNum2.getText().toString());
            float result = num1 - num2;

            txtResult.setText(String.valueOf(result));
        }
    }
    public void multiplicar(View view) {
        if (txtNum1.getText().toString().isEmpty() || txtNum2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Ingrese los números que desea Multiplicar", Toast.LENGTH_SHORT).show();
            return;
        }else {
            float num1 = Float.parseFloat(txtNum1.getText().toString());
            float num2 = Float.parseFloat(txtNum2.getText().toString());
            float result = num1 * num2;

            txtResult.setText(String.valueOf(result));
        }
    }
    public void dividir(View view) {
        if (txtNum1.getText().toString().isEmpty() || txtNum2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Ingrese los números que desea Dividir", Toast.LENGTH_SHORT).show();
            return;
        } else {
            float num1 = Float.parseFloat(txtNum1.getText().toString());
            float num2 = Float.parseFloat(txtNum2.getText().toString());
            float result = num1 / num2;

            txtResult.setText(String.valueOf(result));
        }
    }

    public void clearFields(View view) {
        if (txtNum1.getText().toString().isEmpty() || txtNum2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Los Campos estan vacios, no hay nada que limpiar", Toast.LENGTH_SHORT).show();
            return;
        } else {
            txtNum1.setText("");
            txtNum2.setText("");
            txtResult.setText("");
            Toast.makeText(this, "Los Campos se Limpiaron", Toast.LENGTH_SHORT).show();
            return;
        }
    }
}