package com.example.t3_a1_antoniomaeso;

import android.provider.BaseColumns;

public class EstructuraBBDD {

    public static final String SQL_CREATE_PARTIDAS =
            "CREATE TABLE IF NOT EXISTS " + EstructuraPartidas.TABLE_NAME_PARTIDAS + "(" +
            EstructuraPartidas._ID + " integer PRIMARY KEY, " +
            EstructuraPartidas.COLUMN_NAME_GANADOR + " text);"

}

private EstructuraBBDD(){}

public static class EstructuraPartidas implements BaseColumns {
    public static final String TABLE_NAME_PARTIDAS = "partidas";
    public static final String COLUMN_NAME_GANADOR = "ganador";
}

public static class EstructuraUsuarios implements BaseColumns{
    public static final String TABLE_NAME_USUARIOS = "usuarios";
    public static final String COLUMN_NAME_NOMBRE = "nombre";
    public static final String COLUMN_NAME_PUNTOS = "puntos";
    public static final String COLUMN_NAME_CANTIDAD = "partidas jugadas";
}