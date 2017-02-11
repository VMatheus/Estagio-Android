package com.example.matheus.guiamedico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import adapter.MedicoAdapter;
import model.Medico;

public class Lista extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<Medico> medicos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycle_view);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycle);

        mLayoutManager = new GridLayoutManager(this, 2);
        mRecyclerView.setLayoutManager(mLayoutManager);
        criaMedicosDemonstracao();

        //adapter
        mAdapter = new MedicoAdapter(medicos, getApplicationContext());
        mRecyclerView.setAdapter(mAdapter);


    }

    private void criaMedicosDemonstracao() {
        Medico medico1 = new Medico();
        medico1.setNome("Aldamir de Solza");
        medico1.setTelefone("(21)22600670");
        medico1.setEndereco("R. TEIXEIRA FRANCO, 20");
        medico1.setCrm("11241-4");
        medico1.setEspecialidade("Pediatria");


        Medico medico2 = new Medico();
        medico2.setNome("ADEIR DA SILVA BRAZILEIRO");
        medico2.setTelefone("(21)22345687");
        medico2.setEndereco("PCA. SAENZ PENA, 55/219");
        medico2.setCrm("22810-3");
        medico2.setEspecialidade("Pediatria");
        Medico medico3 = new Medico();
        medico3.setNome("Aecio Meireles");
        medico3.setEndereco("");
        medico3.setTelefone("");
        medico3.setCrm("");
        medico3.setEspecialidade("");
        medicos.add(medico1);
        medicos.add(medico2);
        medicos.add(medico3);
    }
}
