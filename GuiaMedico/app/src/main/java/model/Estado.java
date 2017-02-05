package model;

import android.content.ContentValues;
import android.database.Cursor;

import dao.DataBaseHelper;

/**
 * Created by matheus on 01/02/17.
 */

public class Estado {
    private Integer _id;
    private String nome;

    public Estado(Cursor cursor) {
        set_id(cursor.getInt(cursor.getColumnIndex(DataBaseHelper.Estados._ID)));
        setNome(cursor.getString(cursor.getColumnIndex(DataBaseHelper.Estados.NOME)));
    }

    public ContentValues getValues() {
        ContentValues values = new ContentValues();
        values.put(DataBaseHelper.Estados._ID, _id);
        values.put(DataBaseHelper.Estados.NOME, nome);
        return values;
    }


    public Estado() {

    }


    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
