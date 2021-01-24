package com.example.group2activity;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

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

        // Add a marker in Sydney and move the camera
        LatLng Urdaneta = new LatLng(15.975168, 120.562991);
        mMap.addMarker(new MarkerOptions().position(Urdaneta).title("Marker in Christopher House"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Urdaneta));


        LatLng UCU = new LatLng(15.9796885700614, 120.5607071226075);
        mMap.addMarker(new MarkerOptions().position(UCU).title("Marker in UCU"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(UCU));
        mMap.setMapType(mMap.MAP_TYPE_SATELLITE);


        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(15.975168, 120.562991),
                        new LatLng(15.975470, 120.562937),
                        new LatLng(15.975589, 120.563764),
                        new LatLng(15.979996, 120.563423),
                        new LatLng( 15.981801, 120.560137),
                        new LatLng(15.9796885700614, 120.5607071226075))
                .width(10)
                .color(Color.BLUE));

        LatLng stamaria = new LatLng(15.949089, 120.658248);
        mMap.addMarker(new MarkerOptions().position(stamaria).title("Marker in Kate House"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(stamaria));

        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(15.949107, 120.658153),
                        new LatLng(15.949115, 120.658162),
                        new LatLng(15.943939, 120.659917),
                        new LatLng(15.941072, 120.656492),
                        new LatLng(15.928558, 120.650820),
                        new LatLng( 15.923837, 120.651305),
                        new LatLng(15.900843, 120.633747),
                        new LatLng(15.899239, 120.633223),
                        new LatLng(15.893908, 120.633768),
                        new LatLng(15.893820, 120.631441),
                        new LatLng(15.894269, 120.630502),
                        new LatLng(15.897651, 120.626107),
                        new LatLng(15.894713, 120.615480),
                        new LatLng(15.886264, 120.603276),
                        new LatLng(15.885529, 120.597598),
                        new LatLng(15.906164, 120.585242),
                        new LatLng(15.928309, 120.580654),
                        new LatLng(15.943963, 120.580594),
                        new LatLng(15.964043, 120.573022),
                        new LatLng(15.975853, 120.570747),
                        new LatLng(15.975657, 120.563725),
                        new LatLng(15.979994, 120.563425),
                        new LatLng(15.981800, 120.560134),
                        new LatLng(15.9796885700614, 120.5607071226075))

                .width(10)
                .color(Color.BLUE));

        LatLng manaoag = new LatLng(16.04500297288719, 120.4868595358355);
        mMap.addMarker(new MarkerOptions().position(manaoag).title("Marker in Mark Gerald House"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(manaoag));

        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(16.044941043375147, 120.48685256663425),


                        new LatLng(16.044923, 120.487330),
                        new LatLng(16.044520, 120.487362),
                        new LatLng(16.043345, 120.487488),
                        new LatLng(16.04241663257638, 120.48841848205673),
                        new LatLng(16.038987, 120.490114),
                        new LatLng(16.03763834118743, 120.49142318235118),
                        new LatLng(16.030893, 120.501571),
                        new LatLng(16.026294, 120.505471),
                        new LatLng(16.02022126268479, 120.50812294696779),
                        new LatLng(16.016226, 120.517603),
                        new LatLng(16.003361, 120.534785),
                        new LatLng(16.001819684034036, 120.53587397673564),
                        new LatLng(15.99076747848195, 120.54365401063325),
                        new LatLng(15.990380938703883, 120.5441631678944),
                        new LatLng(15.987359108656845, 120.54862086906071),
                        new LatLng(15.98657548570279, 120.55009598037712),
                        new LatLng(15.984884, 120.554932),
                        new LatLng(15.984504264225084, 120.55567712405929),
                        new LatLng(15.982616910436208, 120.55861365912446),
                        new LatLng(15.981800, 120.560134),
                        new LatLng(15.9796885700614, 120.5607071226075))

                .width(10)
                .color(Color.BLUE));
//christopher's location
        mMap.addCircle(new CircleOptions()
                .center(new LatLng(15.975168, 120.562991))
                .radius(10)
                .strokeWidth(10)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128, 255, 0, 0)));

        //kate's location
        mMap.addCircle(new CircleOptions()
                .center(new LatLng(15.949089, 120.658248))
                .radius(10)
                .strokeWidth(10)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128, 255, 0, 0)));
//gerald's location
        mMap.addCircle(new CircleOptions()
                .center(new LatLng(16.04500297288719, 120.4868595358355))
                .radius(10)
                .strokeWidth(10)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128, 255, 0, 0)));

        //UCU location
        mMap.addCircle(new CircleOptions()
                .center(new LatLng(15.9796885700614, 120.5607071226075))
                .radius(100)
                .strokeWidth(10)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128, 255, 0, 0)));
    }
}