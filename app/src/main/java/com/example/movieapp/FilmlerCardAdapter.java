package com.example.movieapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.movieapp.Fragment.FilmlerFragment;
import com.example.movieapp.Model.FilmlerResponse;
import com.example.movieapp.databinding.FilmlerCardviewBinding;

import java.util.ArrayList;
import java.util.List;

public class FilmlerCardAdapter extends RecyclerView.Adapter<FilmlerCardAdapter.CardTutucu> {

    private FilmlerFragment context;
    private List<FilmlerResponse> filmlerResponsesList;

    public void setFilmler(List<FilmlerResponse> filmlerResponsesList) {
        this.filmlerResponsesList = filmlerResponsesList;
    }

    public FilmlerCardAdapter(FilmlerFragment context, List<FilmlerResponse> filmlerResponsesList) {
        this.context = context;
        this.filmlerResponsesList = filmlerResponsesList;
    }

    @NonNull
    @Override
    public CardTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        FilmlerCardviewBinding view = FilmlerCardviewBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new CardTutucu(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardTutucu holder, int position) {
        FilmlerResponse filmler = filmlerResponsesList.get(position);
        holder.txtFilmAdi.setText(filmler.getName());
        Glide.with(context)
                .load(filmler.getImage().getMedium())
                .apply(RequestOptions.centerCropTransform())
                .into(holder.img_Film);

    }

    @Override
    public int getItemCount() {
        return filmlerResponsesList == null ? 0 : filmlerResponsesList.size();
    }

    public class CardTutucu extends RecyclerView.ViewHolder {
        private TextView txtFilmAdi;
        private ImageView img_Film;

        public CardTutucu(FilmlerCardviewBinding film) {
            super(film.getRoot());
            txtFilmAdi = film.txtFilmAdi;
            img_Film = film.imgFilm;

        }
    }
}
