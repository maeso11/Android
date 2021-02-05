package com.example.t3_a1_antoniomaeso;

import android.provider.BaseColumns;

public class EstructuraBBDD {

    public static final String SQL_CREATE_PARTIDAS =
            "CREATE TABLE IF NOT EXISTS " + EstructuraPartidas.TABLE_NAME_PARTIDAS + "(" +
            EstructuraPartidas._ID + " integer PRIMARY KEY, " +
            EstructuraPartidas.COLUMN_NAME_GANADOR + " text);";

    public static final String SQL_CREATE_USUARIO =
            "CREATE TABLE IF NOT EXISTS "+ EstructuraUsuarios.TABLE_NAME_USUARIOS + "(" +
            EstructuraUsuarios._ID + "integer PRIMARY KEY, " +
            EstructuraUsuarios.COLUMN_NAME_NOMBRE + " text, " +
            EstructuraUsuarios.COLUMN_NAME_CANTIDAD + " integer, " +
            EstructuraUsuarios.COLUMN_NAME_PUNTOS + " integer);";

    public static final String SQL_DELETE_PARTIDAS =
            "DROP TABLE IF EXISTS " + EstructuraPartidas.TABLE_NAME_PARTIDAS;
    public static final String SQL_DELETE_USUARIO =
            "DROP TABLE IF EXISTS " + EstructuraUsuarios.TABLE_NAME_USUARIOS;



    private EstructuraBBDD() {
    }

    public static class EstructuraPartidas implements BaseColumns {
        public static final String TABLE_NAME_PARTIDAS = "partidas";
        public static final String COLUMN_NAME_GANADOR = "ganador";
    }

    public static class EstructuraUsuarios implements BaseColumns {
        public static final String TABLE_NAME_USUARIOS = "usuarios";
        public static final String COLUMN_NAME_NOMBRE = "nombre";
        public static final String COLUMN_NAME_PUNTOS = "puntos";
        public static final String COLUMN_NAME_CANTIDAD = "partidas jugadas";
    }
}