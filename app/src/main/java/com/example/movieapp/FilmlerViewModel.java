package com.example.movieapp;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.movieapp.Model.FilmlerResponse;
import com.example.movieapp.Retrofitt.RetrofitClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FilmlerViewModel extends ViewModel {

    private MutableLiveData<List<FilmlerResponse>> filmlerListe;

    public FilmlerViewModel() {
        filmlerListe = new MutableLiveData<>();
    }

    public MutableLiveData<List<FilmlerResponse>> getFilmlerListeObserver() {
        return filmlerListe;
    }


    public void ApiCall() {
        Call<List<FilmlerResponse>> call = RetrofitClient.getFilmler().filmlerCall();
        call.enqueue(new Callback<List<FilmlerResponse>>() {
            @Override
            public void onResponse(Call<List<FilmlerResponse>> call, Response<List<FilmlerResponse>> response) {
                filmlerListe.postValue(response.body());
            }

            @Override
            public void onFailure(Call<List<FilmlerResponse>> call, Throwable t) {
                filmlerListe.postValue(null);
            }
        });
    }
}
