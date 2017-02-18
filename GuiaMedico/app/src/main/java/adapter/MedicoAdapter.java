package adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import utils.CircleTransform;
import com.example.matheus.guiamedico.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import model.Medico;

/**
 * Created by matheus on 10/02/17.
 */

public class MedicoAdapter extends RecyclerView.Adapter<MedicoAdapter.MedicoViewHolder> {
    private ArrayList<Medico> medicos;
    private Context context;

    private Bitmap circleBitmap;

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
        holder.imageViewPerfil.setImageBitmap(circleBitmap);
        Picasso.with(context).load("http://i.imgur.com/o8Xw7Pu.jpg").transform(new CircleTransform()).into(holder.imageViewPerfil);


        holder.buttonInformacoes.setOnClickListener(new View.OnClickListener() {
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
        private TextView textViewNome;
        private Button buttonInformacoes;
        private ImageView imageViewPerfil;

        public MedicoViewHolder(View itemView) {
            super(itemView);
            imageViewPerfil = (ImageView) itemView.findViewById(R.id.image_perfil);
            textViewNome = (TextView) itemView.findViewById(R.id.text_nome);
            buttonInformacoes = (Button) itemView.findViewById(R.id.text_informacoes);

        }
    }



}
