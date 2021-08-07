package com.galigaribaldi.appactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView textView;
    String age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.et_age);
        button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.tv_message);
    }

    @Override
    protected void onStart() {
        /*Toma el valor de la caja de texto */
        super.onStart();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                age = editText.getText().toString();
                float ageFinal = Float.parseFloat(age) /4;
                textView.setText("Tu edad en años pakkun es: "+ageFinal);
            }
        });
    }
}