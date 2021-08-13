package com.dan.appclick;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private static final String LOGTAG = "INFORMACION";

    // SOY UN COMENTARIO DE UNA LINEA   -> JAVA

    /* SOY UN
        COMENTARIO
        DE VARIAS LINEAS   --> ANDROID
    */

    TextView tvSaludo;
    Button btnSaludar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int a = 5;
        int b = 10;
        int c = 20;
        int res = 0;

        /* - - - Vinculación de Vista - - - */
        tvSaludo = findViewById(R.id.tv_saludo);
        btnSaludar = findViewById(R.id.btn_saludar);

        /* - - - Hacer invisible el textView - - - */
        tvSaludo.setVisibility(View.GONE);

        /* - - - LOGTAG - - - */
        Log.i(LOGTAG," El Valor de a es: " + a);
        Log.i(LOGTAG," El Valor de b es: " + b);

        /* - - - Evento Onclick  - - - */
        btnSaludar.setOnClickListener(new View.OnClickListener() {
            /* - - - Metodo onClick sobrescrito  - - -*/
            @Override
            public void onClick(View view) {
                //Metodos Getters y Setters
                tvSaludo.setVisibility(View.VISIBLE);
                tvSaludo.setText("HOLA ANDROIDS JUNIORS");  // hard coding
            }
        });

        res = a + c;

        int finalRes = res;

        tvSaludo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvSaludo.setText(getResources().getString(R.string.tv_click));  // sin hard coding

                Log.i(LOGTAG, "El valor de a + b es: " + (a+b));

                Log.i(LOGTAG, "El valor de a + c es: " + finalRes);
            }
        });


    }

    /** - - - Revisar  - - - **/
    // Tipos de varibles
    // CLASE, OBJETO, MODELO
    // Pilares de la POO
    // Metodos Getters y Setters
    //Procedencia de operadores
    //precedencia de operadores

}




