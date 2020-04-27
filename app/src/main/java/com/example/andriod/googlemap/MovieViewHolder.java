package com.example.andriod.googlemap;


import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class MovieViewHolder extends RecyclerView.ViewHolder {

    private CardView cardView;
    private TextView movieNameView;
    private TextView movieInfoView;
    private ImageView moviePhotoView;
    private Context context;


    public MovieViewHolder(View itemView, final Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        movieNameView = (TextView) itemView.findViewById(R.id.movie_name);
        movieInfoView = (TextView) itemView.findViewById(R.id.movie_location);
        moviePhotoView = (ImageView) itemView.findViewById(R.id.movie_photo);
        this.context = context;


        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, movieNameView.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public CardView getCardView() {
        return cardView;
    }

    public Context getContext() {
        return context;
    }

    public TextView getMovieInfoView() {
        return movieInfoView;
    }

    public ImageView getMoviePhotoView() {
        return moviePhotoView;
    }

    public TextView getMovieNameView() {
        return movieNameView;
    }

    public void setCardView(CardView cardView) {
        this.cardView = cardView;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public void setMovieInfoView(TextView movieInfoView) {
        this.movieInfoView = movieInfoView;
    }

    public void setMovieNameView(TextView movieNameView) {
        this.movieNameView = movieNameView;
    }

    public void setMoviePhotoView(ImageView moviePhotoView) {
        this.moviePhotoView = moviePhotoView;
    }
}
