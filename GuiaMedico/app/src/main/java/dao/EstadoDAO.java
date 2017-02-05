package dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import model.Estado;

/**
 * Created by matheus on 01/02/17.
 */

public class EstadoDAO {

    private DataBaseHelper dataBaseHelper;
    private SQLiteDatabase database;

    public EstadoDAO(Context context) {
        dataBaseHelper = new DataBaseHelper(context);

    }


    private SQLiteDatabase getDatabase() {
        if (database == null) {
            database = dataBaseHelper.getWritableDatabase();

        }
        return database;
    }

    //sem metodo de criaçao de estados


    //lista de Estados
    public List<Estado> listaEstados() {
        Cursor cursor = getDatabase().query(DataBaseHelper.Estados.TABELA, DataBaseHelper.Estados.COLUNAS, null, null, null, null, null);
        Log.v("", "Estados quantidade" + cursor.getCount());

        List<Estado> estados = new ArrayList<Estado>();
        while (cursor.moveToNext()) {
            estados.add(new Estado(cursor));
        }
        cursor.close();
        return estados;
    }

    public void fechar() {

        dataBaseHelper.close();
        database = null;
    }

}
