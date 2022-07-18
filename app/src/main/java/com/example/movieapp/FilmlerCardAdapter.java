package com.example.movieapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import com.example.movieapp.Model.FilmlerResponse;
import com.example.movieapp.databinding.FilmlerCardviewBinding;

import java.util.List;

public class FilmlerCardAdapter extends RecyclerView.Adapter<FilmlerCardAdapter.CardTutucu> {

    private List<FilmlerResponse> filmlerResponsesList;
    private Context context;

    public FilmlerCardAdapter(List<FilmlerResponse> filmlerResponsesList, Context context) {
        this.filmlerResponsesList = filmlerResponsesList;
        this.context = context;
    }

    @SuppressLint("NotifyDataSetChanged")
    public void setFilmlerResponsesList(List<FilmlerResponse> filmlerResponseListe) {
        this.filmlerResponsesList = filmlerResponseListe;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CardTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.filmler_cardview, parent, false);
        return new CardTutucu(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardTutucu holder, int position) {
        FilmlerResponse filmler = filmlerResponsesList.get(position);
        holder.filmler_card_view.txtFilmAdi.setText(filmler.getTitle());
        Glide.with(holder.itemView)
                .load(filmler.getPosterPath())
                .apply(RequestOptions.centerCropTransform())
                .into(holder.filmler_card_view.imgFilm);
    }

    @Override
    public int getItemCount() {
        //return filmlerResponsesList.size();
        return filmlerResponsesList == null ? 0 :
                filmlerResponsesList.size();
    }

    public class CardTutucu extends RecyclerView.ViewHolder {
        private FilmlerCardviewBinding filmler_card_view;
        public CardTutucu(View itemView) {
            super(itemView);
            filmler_card_view = FilmlerCardviewBinding.bind(itemView);

        }
    }
}
