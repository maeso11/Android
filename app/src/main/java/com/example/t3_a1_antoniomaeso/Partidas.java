package com.example.t3_a1_antoniomaeso;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

public class Partidas extends AppCompatActivity {

    SQLiteHelper helper;
    SQLiteDatabase db;
    TextView jugador1, jugador2, dificultad, ganador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partidas);

        jugador1 = findViewById(R.id.txtJugadores1);
        jugador2 = findViewById(R.id.txtJugadores2);
        dificultad = findViewById(R.id.txtDificultad);
        ganador = findViewById(R.id.txtGanador1);
        helper = new SQLiteHelper(this);
        db = helper.getReadableDatabase();
    }
}