package com.example.mymaps_cobaspbu;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
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

        // Beri marker di lokasi Rumah Surabaya
        LatLng Rumah = new LatLng(-7.272391, 112.765536);
        mMap.addMarker(new MarkerOptions().position(Rumah).title("Rumah Nizar M Surabaya"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Rumah));

        LatLng sekolah = new LatLng( -7.272326, 112.766062);
        mMap.addMarker(new MarkerOptions().position(sekolah).title("SD Muhammadiyah 5 Surabaya"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sekolah));

        LatLng sekolah2 = new LatLng( -7.272701, 112.764627);
        mMap.addMarker(new MarkerOptions().position(sekolah2).title("SMP Muhammadiyah 9 Surabaya"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sekolah2));

        LatLng sekolah3 = new LatLng( -7.273321, 112.763188);
        mMap.addMarker(new MarkerOptions().position(sekolah3).title("SMK DR.SOETOMO SURABAYA"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sekolah3));


    }
}
