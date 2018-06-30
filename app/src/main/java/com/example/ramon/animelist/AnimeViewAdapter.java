package com.example.ramon.animelist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.ramon.animelist.R;

public class AnimeViewAdapter extends RecyclerView.Adapter<AnimeViewAdapter.animeViewHolder> {

    private Context mContext;
    private List<Anime> Datos;
    RequestOptions option;

    public AnimeViewAdapter(Context mContext, List<Anime> datos) {
        this.mContext = mContext;
        Datos = datos;

        option = new RequestOptions().centerCrop().placeholder(R.drawable.loading_shape).error(R.drawable.loading_shape);
    }


    @Override
    public animeViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view;

        LayoutInflater infla = LayoutInflater.from(mContext);
        view = infla.inflate(R.layout.anime_list_item,parent,false);

        return new animeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull animeViewHolder holder, int position) {

        holder.tv_nombre.setText(Datos.get(position).getNombre());
        holder.tv_categoria.setText(Datos.get(position).getCategorias());
        holder.tv_calificacion.setText(Datos.get(position).getClasificacion());
        holder.tv_estudio.setText(Datos.get(position).getEstudio());


        Glide.with(mContext).load(Datos.get(position).getImagen()).apply(option).into(holder.img_portada);
    }

    @Override
    public int getItemCount() {
        return Datos.size();
    }

    public static class animeViewHolder extends RecyclerView.ViewHolder{

       private TextView tv_nombre;
        TextView tv_calificacion;
        TextView tv_categoria;
        TextView tv_estudio;
        AppCompatImageView img_portada;

        public animeViewHolder(View itemView) {
            super(itemView);
            tv_nombre = itemView.findViewById(R.id.nombre);
            tv_calificacion = itemView.findViewById(R.id.calificacion);
            tv_categoria = itemView.findViewById(R.id.categoria);
            tv_estudio = itemView.findViewById(R.id.estudio);
            img_portada = itemView.findViewById(R.id.portada);

        }
    }
}
