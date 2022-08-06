package com.example.movieapp.Retrofitt;

import retrofit2.Call;

import com.example.movieapp.Model.FilmlerResponse;
import java.util.List;

import retrofit2.http.GET;

public interface IFilmler {
    @GET("shows")
    Call<List<FilmlerResponse>> filmlerCall();
}
