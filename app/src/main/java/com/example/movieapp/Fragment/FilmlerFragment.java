package com.example.movieapp.Fragment;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import androidx.fragment.app.Fragment;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;

import com.bumptech.glide.Glide;
import com.example.movieapp.FilmlerCardAdapter;
import com.example.movieapp.FilmlerViewModel;
import com.example.movieapp.Model.FilmlerResponse;
import com.example.movieapp.databinding.FragmentFilmlerBinding;

import java.util.List;

public class FilmlerFragment extends Fragment {

    private List<FilmlerResponse> filmlerResponseListe;
    private FragmentFilmlerBinding binding;
    private FilmlerCardAdapter adapter;
    private FilmlerViewModel filmlerViewModel;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        filmlerViewModel = ViewModelProviders.of(this).get(FilmlerViewModel.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFilmlerBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        binding.rvFilmler.setLayoutManager(new GridLayoutManager(getContext(), 2));
        adapter = new FilmlerCardAdapter(this, filmlerResponseListe);
        binding.rvFilmler.setAdapter(adapter);

//        RecyclerView recyclerView = view.findViewById(R.id.rvFilmler);
//        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        filmlerViewModel.ApiCall();
        observerFilm();
    }

    private void observerFilm() {
        filmlerViewModel.getFilmlerListeObserver().observe(getViewLifecycleOwner(), new Observer<List<FilmlerResponse>>() {
            @Override
            public void onChanged(List<FilmlerResponse> filmlerResponses) {
                if (filmlerResponses != null) {
                    Glide.with(FilmlerFragment.this)
                            .load(filmlerResponses);
                }
            }
        });
    }


}