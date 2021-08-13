package com.dan.appclick;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity{
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main3);
        textView = findViewById(R.id.tv_saludo);
        button = findViewById(R.id.btn_saludar);

        ///hacer invisible el TextView
        textView.setVisibility(View.VISIBLE);
    }

    public void click(View view) {
        switch (view.getId()){
            case R.id.tv_saludo:
                textView.setVisibility(View.VISIBLE);
                textView.setText("Saludo desde el método 3");
                break;
            case R.id.btn_saludar:
                textView.setText(getResources().getString(R.string.tv_click_p3));
                textView.setText("Saludo ocupando la interfaz");
            default:
                break;
        }
    }
}

