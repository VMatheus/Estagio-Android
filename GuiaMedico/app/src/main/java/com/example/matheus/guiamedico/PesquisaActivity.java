package com.example.matheus.guiamedico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.List;

import adapter.EstadoAdapter;
import dao.CidadeDAO;
import dao.EspecialidadeDAO;
import dao.EstadoDAO;
import model.Estado;

public class PesquisaActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner estado_spinner, cidade_spinner, especialidade_spiner;
    private ArrayAdapter adapter;
    private EstadoDAO estadoDAO;
    private CidadeDAO cidadeDAO;
    private EspecialidadeDAO especialidadeDAO;
    private EstadoAdapter estadoAdapter;
    private Integer id_estado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesquisa);

        estado_spinner = (Spinner) findViewById(R.id.estado_spinner);
        estadoDAO = new EstadoDAO(this);
        estado_spinner.setOnItemSelectedListener(this);
        carregarEstados();


    }

    private void carregarEstados() {
        List<Estado> estadoList = estadoDAO.listaEstados();
        estadoAdapter = new EstadoAdapter(this, android.R.layout.simple_spinner_item, estadoList);
        estadoDAO = new EstadoDAO(getApplicationContext());
        estado_spinner.setAdapter(estadoAdapter);
        estadoAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
        if (adapterView == findViewById(R.id.estado_spinner)) {
            Estado selecionado = (Estado) adapterView.getItemAtPosition(position);
            id_estado = selecionado.get_id();

        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
