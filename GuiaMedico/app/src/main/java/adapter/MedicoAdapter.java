package adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.matheus.guiamedico.R;

import java.util.ArrayList;
import java.util.List;

import model.Medico;

/**
 * Created by matheus on 10/02/17.
 */

public class MedicoAdapter extends RecyclerView.Adapter<MedicoAdapter.MedicoViewHolder> {
    private ArrayList<Medico> medicos;
    private Context context;

    public MedicoAdapter(ArrayList<Medico> medicos, Context context) {
        this.medicos = medicos;
        this.context = context;

    }

    @Override
    public MedicoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflando adapter
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_medicos, parent, false);
        return new MedicoViewHolder(v);


    }

    @Override
    public void onBindViewHolder(MedicoViewHolder holder, final int position) {
        //atribuindo objetos da lista
        final Medico medico = medicos.get(position);
        holder.textViewNome.setText(medico.getNome());
        holder.textViewInfomracoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Tela a ser Implementada ", Toast.LENGTH_LONG).show();
            }
        });


    }


    @Override
    public int getItemCount() {
        return medicos.size();
    }

    public class MedicoViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewNome, textViewInfomracoes;

        public MedicoViewHolder(View itemView) {
            super(itemView);
            textViewNome = (TextView) itemView.findViewById(R.id.text_nome);
            textViewInfomracoes = (TextView)itemView.findViewById(R.id.text_informacoes);

        }
    }
}
