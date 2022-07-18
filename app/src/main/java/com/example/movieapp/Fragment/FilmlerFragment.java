package com.example.movieapp.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.movieapp.FilmlerCardAdapter;
import com.example.movieapp.FilmlerViewModel;
import com.example.movieapp.Model.FilmlerResponse;
import com.example.movieapp.databinding.FragmentFilmlerBinding;


import java.util.List;

public class FilmlerFragment extends Fragment {

    private List<FilmlerResponse> filmlerResponseListe;
    private FragmentFilmlerBinding binding;
    private FilmlerCardAdapter myAdapter;
    private FilmlerViewModel filmlerViewModel;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myAdapter = new FilmlerCardAdapter(filmlerResponseListe, getContext());
        filmlerViewModel = new ViewModelProvider(this).get(FilmlerViewModel.class);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFilmlerBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.rvFilmler.setVisibility(View.VISIBLE);
        prepareFilmlerRV();
        getFilmler();
    }

    private void getFilmler() {
        filmlerViewModel.getFilmlerListeObserver().observe(getViewLifecycleOwner(), new Observer<List<FilmlerResponse>>() {
            @Override
            public void onChanged(List<FilmlerResponse> filmlerResponses) {
                myAdapter.setFilmlerResponsesList(filmlerResponses);
            }
        });
        filmlerViewModel.ApiCall();
    }

    private void prepareFilmlerRV() {
        binding.rvFilmler.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new GridLayoutManager(getContext(), 2);
        binding.rvFilmler.setLayoutManager(layoutManager);
        binding.rvFilmler.setAdapter(myAdapter);

    }


}