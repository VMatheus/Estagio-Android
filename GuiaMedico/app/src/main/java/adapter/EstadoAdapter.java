package adapter;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import com.example.matheus.guiamedico.PesquisaActivity;

import java.util.List;

import model.Estado;

/**
 * Created by matheus on 03/02/17.
 */

public class EstadoAdapter extends ArrayAdapter<Estado> {
    private List<Estado> mListaEstado;
    private Context mContext;


    public EstadoAdapter(Context context, int resource, List<Estado> listEstados) {
        super(context, resource);
        this.mContext = context;
        this.mListaEstado = listEstados;
    }

    @Override
    public int getCount() {
        return mListaEstado.size();
    }

    @Override
    public Estado getItem(int position) {
        return mListaEstado.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        TextView textView = new TextView(mContext);
        textView.setTextColor(Color.BLACK);
        textView.setTextSize(18);
        textView.setText("" + mListaEstado.get(position).getNome());
        textView.setHeight(70);
        textView.setGravity(Gravity.LEFT | Gravity.CENTER);

        return textView;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView = new TextView(mContext);
        textView.setTextColor(Color.BLACK);
        textView.setTextSize(18);
        textView.setText("" + mListaEstado.get(position).getNome());
        textView.setHeight(70);
        textView.setGravity(Gravity.LEFT | Gravity.CENTER);

        return textView;
    }


}