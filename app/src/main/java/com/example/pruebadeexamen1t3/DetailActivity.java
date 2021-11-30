package com.example.pruebadeexamen1t3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import com.example.pruebadeexamen1t3.adapters.NameAdapter;
import com.example.pruebadeexamen1t3.entities.Persona;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Log.i("MAIN_APP", "Iniciando segunda actividad");

        //Intent intent = getIntent();
        //String nombre = intent.getStringExtra("nombre");

        RecyclerView rv = findViewById(R.id.rvNames);

        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        Persona dato1 = new Persona("Luis","987654321");
        Persona dato2 = new Persona("Miguel","94585326");
        Persona dato3 = new Persona("Alexis","94647815");

        List<Persona> datos = Arrays.asList(dato1,dato2,dato3);
        //List<String> datos2 = ArrayList(,);

        //List<String> datos = Arrays.asList("987654321","94585326","94647815");
        NameAdapter adapter = new NameAdapter(datos);



        rv.setAdapter(adapter);
    }
}