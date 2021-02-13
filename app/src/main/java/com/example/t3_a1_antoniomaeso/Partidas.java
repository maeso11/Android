package com.example.t3_a1_antoniomaeso;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
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

        Cursor cursor = db.query("partidas", null, null, null, null, null, null);

        //Mostrar el contenido
        mostrarTabla(cursor);


        db.close();
    }

    private void mostrarTabla(Cursor c) {

        c.moveToFirst();

        int nfilas=c.getCount();
        String filaJugador1="\n";
        String filaJugador2 = "\n";
        String filaDificultad = "\n";
        String filaGanador = "\n";
        for (int i = 0; i < nfilas; i++) {
            filaJugador1= filaJugador1+c.getString(0) + "\n";
            filaJugador2 = filaJugador2+c.getString(1) + "\n";
            filaDificultad = filaDificultad+c.getString(2) +"\n";
            filaGanador = filaGanador+c.getString(3) + "\n";
            jugador1.append(filaJugador1);
            jugador2.append(filaJugador2);
            dificultad.append(filaDificultad);
            ganador.append(filaGanador);
            c.moveToNext();
        }
    }
}