package com.example.t3_a1_antoniomaeso;

import android.provider.BaseColumns;

public class EstructuraBBDD {

    public static final String SQL_CREATE_PARTIDAS =
            "CREATE TABLE IF NOT EXISTS " + EstructuraPartidas.TABLE_NAME_PARTIDAS + "(" +
            EstructuraPartidas._ID + " integer PRIMARY KEY, " +
            EstructuraPartidas.COLUMN_NAME_JUGADOR1 + " text, " +
            EstructuraPartidas.COLUMN_NAME_JUGADOR2 + " text, " +
            EstructuraPartidas.COLUMN_NAME_DIFICULATAD + " text, " +
            EstructuraPartidas.COLUMN_NAME_GANADOR + " text);";

    public static final String SQL_DELETE_PARTIDAS =
            "DROP TABLE IF EXISTS " + EstructuraPartidas.TABLE_NAME_PARTIDAS;




    private EstructuraBBDD() {
    }

    public static class EstructuraPartidas implements BaseColumns {
        public static final String TABLE_NAME_PARTIDAS = "partidas";
        public static final String COLUMN_NAME_GANADOR = "ganador";
        public static final String COLUMN_NAME_JUGADOR1 = "jugador1";
        public static final String COLUMN_NAME_JUGADOR2 = "jugador2";
        public static final String COLUMN_NAME_DIFICULATAD = "dificultad";
    }
}