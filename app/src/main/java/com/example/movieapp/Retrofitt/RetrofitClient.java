package com.example.movieapp.Retrofitt;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static Retrofit retrofit;

    public static final String Base_Url = "https://api.themoviedb.org";

    public static Retrofit getRetrofit() {
            retrofit = new Retrofit.Builder()
                    .baseUrl(Base_Url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            return retrofit;
    }


    public static IFilmler getFilmler() {
        return getRetrofit().create(IFilmler.class);
    }
}