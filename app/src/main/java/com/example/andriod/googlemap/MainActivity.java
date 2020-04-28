package com.example.andriod.googlemap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<President> presidents;
    PresidentAdapter presAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData(); //notice we call the method in onCreate. why here?

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        presAdapter = new PresidentAdapter(presidents, this);
        recyclerView.setAdapter(presAdapter);
    }

    private void initialData() {
        presidents = new ArrayList<>();
        presidents.add(new President("Joker", "2019", R.drawable.jocker1));
        presidents.add(new President("THE AVENGERS 3", "2019", R.drawable.ave3));
        presidents.add(new President("The Dark Knight Rises ", "2012", R.drawable.batman1));
        presidents.add(new President("JOHN WICK", "2014", R.drawable.john1));
        presidents.add(new President("The Seven Year Itch ", "1995", R.drawable.seven1));
        presidents.add(new President("Breakfast At Tiffany’s  ", "1961", R.drawable.tiffany1));
        presidents.add(new President("Spider-Man", "2012", R.drawable.spiderman1));
        presidents.add(new President("Sex And The City 2 ", "2010", R.drawable.sex1));
        presidents.add(new President("Leon ", "1994", R.drawable.leon1));
        presidents.add(new President("THE AVENGERS", "2012", R.drawable.ave1));
        presidents.add(new President("King Kong ", "2005", R.drawable.kingkong1));


    }


    public void GoToMap(View view){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
        Toast.makeText(this, "Enter the Map", Toast.LENGTH_SHORT).show();
    }
}
