package com.dan.appclick;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2  extends AppCompatActivity  implements View.OnClickListener{
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.tv_saludo);
        button = findViewById(R.id.btn_saludar);

        textView.setOnClickListener(this);
        button.setOnClickListener(this);
        ///hacer invisible el TextView
        textView.setVisibility(View.VISIBLE);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv_saludo:
                textView.setText(getResources().getString(R.string.tv_click2));
                break;
            case R.id.btn_saludar:
                textView.setVisibility(View.VISIBLE);
                textView.setText("Saludo ocupando la interfaz");
            default:
                break;
        }
    }
}
