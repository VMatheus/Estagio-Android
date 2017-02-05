package model;

import android.content.ContentValues;
import android.database.Cursor;

import dao.DataBaseHelper;

/**
 * Created by matheus on 01/02/17.
 */

public class Cidade {
    private Integer _id;
    private Integer id_estado;
    private String nome;

    public Cidade(Cursor cursor){
        set_id(cursor.getInt(cursor.getColumnIndex(DataBaseHelper.Cidades._ID)));
        setId_estado(cursor.getInt(cursor.getColumnIndex(DataBaseHelper.Cidades.ID_ESTADO)));
        setNome(cursor.getString(cursor.getColumnIndex(DataBaseHelper.Cidades.NOME)));
    }

    public  Cidade(){

    }
    public ContentValues getValues(){
        ContentValues values = new ContentValues();
        values.put(DataBaseHelper.Cidades._ID, _id);
        values.put(DataBaseHelper.Cidades.ID_ESTADO, id_estado);
        values.put(DataBaseHelper.Cidades.NOME, nome);
        return values;
    }


    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }

    public Integer getId_estado() {
        return id_estado;
    }

    public void setId_estado(Integer id_estado) {
        this.id_estado = id_estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
