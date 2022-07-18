package com.example.movieapp.Retrofitt;

import retrofit2.Call;

import com.example.movieapp.Model.FilmlerResponse;
import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;


public interface IFilmler {
    //api_key=cb1c5f5551eca0a107a0e085a7aed94a
    @GET("/3/movie/popular?api_key=cb1c5f5551eca0a107a0e085a7aed94a")
    Call<List<FilmlerResponse>> filmlerCall(@Query("page")String page);
}
