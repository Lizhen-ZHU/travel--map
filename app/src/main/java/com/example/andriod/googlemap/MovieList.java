package com.example.andriod.googlemap;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MovieList extends AppCompatActivity {

    ArrayList<MovieInfo> movie;
    MovieAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_list);


    initialData();

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new MovieAdapter(movie, this);
        recyclerView.setAdapter(adapter);

    }

    private void initialData() {
        movie = new ArrayList<>();
        movie.add(new MovieInfo("Breakfast At Tiffany’s", "Tiffany & Co Store, 727 5th Avenue and East 57th Street, Manhattan.1", R.drawable.tiffany));
        movie.add(new MovieInfo("Joker","1150 Anderson Avenue, The Bronx, New York.",R.drawable.jocker));
        movie.add(new MovieInfo("BatMan The Dark Night Rises","Federal Hall on Wall Street",R.drawable.batman));
        movie.add(new MovieInfo("SpiderMan","Times Square",R.drawable.spiderman));
        movie.add(new MovieInfo("King Kong","The Empire State Building",R.drawable.kingkong));
        movie.add(new MovieInfo("Leon: The Professional","7 Avenue (btw West 55th and 56th Streets) Manhattan.",R.drawable.leon));

    }}

