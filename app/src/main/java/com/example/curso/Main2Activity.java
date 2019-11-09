package com.example.curso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


    String valorExtraido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView nombre = (TextView)findViewById(R.id.textViewRecibira );
        valorExtraido = getIntent().getExtras().getString("Valor");
        nombre.setText(valorExtraido);
    }
}
