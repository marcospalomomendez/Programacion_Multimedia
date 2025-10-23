package com.example.calculadomarcos;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText txtResultado;
    double numero1 = 0;
    double numero2 = 0;
    String operador = "";
    boolean nuevoNumero = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        txtResultado = findViewById(R.id.txtResultado);
        Button btn0 = findViewById(R.id.btn0);
        btn0.setOnClickListener(v -> escribirNumero("0"));

        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(v -> escribirNumero("1"));

        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(v -> escribirNumero("2"));

        Button btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(v -> escribirNumero("3"));

        Button btn4 = findViewById(R.id.btn4);
        btn4.setOnClickListener(v -> escribirNumero("4"));

        Button btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(v -> escribirNumero("5"));

        Button btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(v -> escribirNumero("6"));

        Button btn7 = findViewById(R.id.btn7);
        btn7.setOnClickListener(v -> escribirNumero("7"));

        Button btn8 = findViewById(R.id.btn8);
        btn8.setOnClickListener(v -> escribirNumero("8"));

        Button btn9 = findViewById(R.id.btn9);
        btn9.setOnClickListener(v -> escribirNumero("9"));

        Button btnSuma = findViewById(R.id.btnsuma);
        btnSuma.setOnClickListener(v -> setOperador("+"));

        Button btnResta = findViewById(R.id.btnresta);
        btnResta.setOnClickListener(v -> setOperador("-"));

        Button btnMultiplicacion = findViewById(R.id.btnproducto);
        btnMultiplicacion.setOnClickListener(v -> setOperador("*"));
        Button btnDivision = findViewById(R.id.btndivision);
        btnDivision.setOnClickListener(v -> setOperador("/"));

        Button btnIgual = findViewById(R.id.btnIgual);
        btnIgual.setOnClickListener(v -> calcular());
        Button btnLimpiar = findViewById(R.id.btnLimpiar);
        btnLimpiar.setOnClickListener(v -> limpiar());
    }

    private void limpiar(){
        txtResultado.setText("0");
    }
    private void escribirNumero(String num) {
        if (nuevoNumero) {
            txtResultado.setText("");
            nuevoNumero = false;
        }
        String actual = txtResultado.getText().toString();
        if (actual.equals("0")) actual = "";
        txtResultado.setText(actual + num);
    }

    private void setOperador(String op){
        numero1 = Double.parseDouble(txtResultado.getText().toString());
        operador = op;
        nuevoNumero = true;
    }

    private void calcular(){
        try {
            numero2 = Double.parseDouble(txtResultado.getText().toString());
            double resultado = 0;

            switch (operador) {
                case "+": resultado = numero1 + numero2; break;
                case "-": resultado = numero1 - numero2; break;
                case "*": resultado = numero1 * numero2; break;
                case "/":
                    if (numero2 != 0) resultado = numero1 / numero2;
                    else {
                        txtResultado.setText("Error");
                        return;
                    }
                    break;
            }
            txtResultado.setText(String.valueOf(resultado));
            nuevoNumero = true;
        } catch (Exception e) {
            txtResultado.setText("Error");
        }
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("LifeCycle","onRestart");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LifeCycle","onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LifeCycle","onResume");

    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("LifeCycle","onStop");

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LifeCycle","onDestroy");

    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LifeCycle","onPause");
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.i("LifeCycle","onConfigurationChanged");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i("LifeCycle","onPostResumes");
    }

}