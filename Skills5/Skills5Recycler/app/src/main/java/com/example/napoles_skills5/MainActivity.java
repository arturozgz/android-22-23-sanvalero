package com.example.napoles_skills5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<PersonajeVo> listaPersonajes;
    RecyclerView recyclerPersonajes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaPersonajes = new ArrayList<>();
 //       recyclerPersonajes= (RecyclerView) findViewById(R.id.RecyclerId);
        recyclerPersonajes.setLayoutManager(new LinearLayoutManager(this));
      llenarPersonajes();

      AdaptadorPersonajes adapter=new AdaptadorPersonajes(listaPersonajes);
      recyclerPersonajes.setAdapter(adapter);
    }

    private class RecyclerId {
    }
    private void llenarPersonajes(){

        listaPersonajes.add(new PersonajeVo("Krusty","",R.drawable.krusti));

    }
}