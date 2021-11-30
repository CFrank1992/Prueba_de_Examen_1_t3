package com.example.pruebadeexamen1t3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    /*public class ButtonClick implements View.OnClickListener{
        @Override
        public void onClick(View v){

            TextView tv = findViewById(R.id.tvSaludo);

            tv.setText("Hola Luis");

            Log.i("MAIN_APP", "Click en el boton");
        }
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btn = findViewById(R.id.btnChangeText);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText input = findViewById(R.id.inputHello);
                String value = String.valueOf(input.getText());



                Log.i("MAIN_APP", "El valor del input es: "+ value);
            }
        });

    }




}