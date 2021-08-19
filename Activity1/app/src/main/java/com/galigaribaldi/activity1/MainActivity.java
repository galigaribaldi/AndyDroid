package com.galigaribaldi.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.id_button_text);
        button = (Button) findViewById(R.id.id_button_action);
        textView = (TextView) findViewById(R.id.id_text);
    }
    public String esPrimo(int numero){
        if (numero < 2) return "No es primo";
        else{
            for(int i = 2; i < numero; i ++){
                if(numero % i == 0) return "No es Primo";
            }
        }
        return "Es Primo!";
    }

    @Override
    protected void onStart() {
        super.onStart();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = editText.getText().toString();
                int number2 = Integer.parseInt(number);
                String res = esPrimo(number2);
                textView.setText("Este numero es: "+ res);
            }
        });
    }
}