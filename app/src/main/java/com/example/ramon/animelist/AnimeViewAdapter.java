package com.example.ramon.animelist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;
import com.example.ramon.animelist.R;

public class AnimeViewAdapter extends RecyclerView.Adapter<AnimeViewAdapter.animeViewHolder> {

    private Context mContext;
    private List<Anime> Datos;

    public AnimeViewAdapter(Context mContext, List<Anime> datos) {
        this.mContext = mContext;
        Datos = datos;
    }


    @Override
    public animeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater infla = LayoutInflater.from(mContext);
        view = infla.inflate(R.layout.anime_list_item,parent,false);
        
        return new animeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull animeViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return Datos.size();
    }

    public static class animeViewHolder extends RecyclerView.ViewHolder{

        public animeViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
