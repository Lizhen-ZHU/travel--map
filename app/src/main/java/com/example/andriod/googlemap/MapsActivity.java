package com.example.andriod.googlemap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends AppCompatActivity implements
        GoogleMap.OnInfoWindowClickListener,
        OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng mark = new LatLng(40.757753, -73.971423);
        LatLng mark1 = new LatLng(40.757753, -73.971423);
        LatLng mark2 = new LatLng(40.762535, -73.973392);
        LatLng mark3 = new LatLng(40.835922, -73.924228);
        LatLng mark4 = new LatLng(40.757973, -73.985554);
        LatLng mark5 = new LatLng(40.707486, -74.010299);
        LatLng mark6 = new LatLng(40.748616, -73.985571);
        LatLng mark7 = new LatLng(40.764197, -73.980882);
        LatLng mark8 = new LatLng(40.763460, -73.973872);
        LatLng mark9 = new LatLng(40.752912, -73.977373);
        LatLng mark10 = new LatLng(40.775621, -73.974788);
        LatLng mark11 = new LatLng(40.731197, -73.997343);
        LatLng mark12 = new LatLng(40.704411, -73.994622);

        mMap.addMarker(new MarkerOptions().position(mark1).title("The Seven Year Itch (1955)"));
        mMap.addMarker(new MarkerOptions().position(mark2).title("Breakfast At Tiffany’s (1961)"));
        mMap.addMarker(new MarkerOptions().position(mark3).title("Joker(2019)"));
        mMap.addMarker(new MarkerOptions().position(mark4).title("Spider-Man (2012)"));
        mMap.addMarker(new MarkerOptions().position(mark5).title("The Dark Knight Rises (2012)"));
        mMap.addMarker(new MarkerOptions().position(mark6).title("King Kong (2005)"));
        mMap.addMarker(new MarkerOptions().position(mark7).title("Leon(1994)"));
        mMap.addMarker(new MarkerOptions().position(mark8).title("Sex And The City 2 (2010)"));
        mMap.addMarker(new MarkerOptions().position(mark9).title("THE AVENGERS 3 (2018)"));
        mMap.addMarker(new MarkerOptions().position(mark10).title("HOME ALONE 2 (1992)"));
        mMap.addMarker(new MarkerOptions().position(mark11).title("THE AVENGERS (2012)"));
        mMap.addMarker(new MarkerOptions().position(mark12).title("JOHN WICK (2014)"));
        Marker melbourne = mMap.addMarker(new MarkerOptions()
                .position(mark)
                .title("Travel with Film")
                .snippet("Explore New york with iconic movies"));
        melbourne.showInfoWindow();

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mark1, 12));
        mMap.setOnInfoWindowClickListener(this);

}



        @Override
        public void onInfoWindowClick (Marker marker){

            if (marker.getTitle().equals("Joker(2019)")) {
                Intent intent = new Intent(this, MovieInfo.class);
                startActivity(intent);
                Toast.makeText(this, "HAHAHA", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "OK", Toast.LENGTH_SHORT).show();
            }
        }


}