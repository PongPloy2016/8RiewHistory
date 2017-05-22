package com.codemobiles.cmjsonxmlfeeddemo;

/**
 * Created by PongPloy2016 on 17/5/2560.
 */

import android.location.Location;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import io.paperdb.Paper;

public class MapActivity extends FragmentActivity implements
        OnMapReadyCallback,
        GoogleApiClient.ConnectionCallbacks,
        GoogleApiClient.OnConnectionFailedListener,
        GoogleMap.OnMarkerDragListener,
        GoogleMap.OnMapLongClickListener,
        View.OnClickListener {

    //Our MapActivity
    private GoogleMap mMap;

    //To store longitude and latitude from map
    private double longitude;
    private double latitude;

    //Buttons
    private ImageButton buttonSave;
    private ImageButton buttonCurrent;
    private ImageButton buttonView;

    //Google ApiClient
    private GoogleApiClient googleApiClient;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        //Initializing googleapi client
        googleApiClient = new GoogleApiClient.Builder(this)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .addApi(LocationServices.API)
                .build();

        //Initializing views and adding onclick listeners
        buttonSave = (ImageButton) findViewById(R.id.buttonSave);
        buttonCurrent = (ImageButton) findViewById(R.id.buttonCurrent);
        buttonView = (ImageButton) findViewById(R.id.buttonView);
        buttonSave.setOnClickListener(this);
        buttonCurrent.setOnClickListener(this);
        buttonView.setOnClickListener(this);


    }

    @Override
    protected void onStart() {
        googleApiClient.connect();


        super.onStart();
    }

    @Override
    protected void onStop() {
        googleApiClient.disconnect();
        super.onStop();
    }

    //Getting current location
    private void getCurrentLocation() {
       // mMap.clear();
        //Creating a location object
        Location location = LocationServices.FusedLocationApi.getLastLocation(googleApiClient);
        if (location != null) {
            //Getting longitude and latitude
//            longitude = location.getLongitude();
            longitude = 101.0671555;
//            latitude = location.getLatitude();
            latitude = 13.674173;

            //moving the map to location
            moveMap();
        }
    }

    //Function to move the map
    private void moveMap() {

        Log.e("  moveMap","moveMap");
        //String to display current latitude and longitude
        String msg = latitude + ", " + longitude;

        longitude = 101.0671555;
//            latitude = location.getLatitude();
        latitude = 13.674173;

        //Creating a LatLng Object to store Coordinates
        LatLng latLng = new LatLng(latitude, longitude);

        //Adding marker to map
        mMap.addMarker(new MarkerOptions()
                .position(latLng) //setting position
                .draggable(true) //Making the marker draggable
                .title("Current Location" + latitude + longitude)); //Adding a title

        //Moving the camera
        mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));

        //Animating the camera
        mMap.animateCamera(CameraUpdateFactory.zoomTo(13));

        //Displaying current coordinates in toast
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        Log.e("  onMapReady","onMapReady");

        mMap = googleMap;

        String MapCheck = Paper.book().read("MapCheck");

        if(MapCheck.equals("1")){
            longitude = 101.0671555;
            latitude = 13.674173;
            LatLng latLng = new LatLng(latitude, longitude);
            //Adding marker to map
            mMap.addMarker(new MarkerOptions()
                    .position(latLng) //setting position
                    .draggable(true) //Making the marker draggable
                    .title("วัดหลวงพ่อโสธร : " + latitude + longitude)); //Adding a title
            //Moving the camera
            mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
        }
        else if(MapCheck.equals("2")){

            longitude = 101.091543;
            latitude = 13.699483;
            LatLng latLng = new LatLng(latitude, longitude);
            //Adding marker to map
            mMap.addMarker(new MarkerOptions()
                    .position(latLng) //setting position
                    .draggable(true) //Making the marker draggable
                    .title("ตลาดบ้านใหม่ 100 ปี :" + latitude + longitude)); //Adding a title
            //Moving the camera
            mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));

        }

        else if(MapCheck.equals("3")){

            longitude = 101.072817;
            latitude = 13.683;
            LatLng latLng = new LatLng(latitude, longitude);
            //Adding marker to map
            mMap.addMarker(new MarkerOptions()
                    .position(latLng) //setting position
                    .draggable(true) //Making the marker draggable
                    .title("สวนมรุพงษ์ : " + latitude + longitude)); //Adding a title
            //Moving the camera
            mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));

        }

        else if(MapCheck.equals("4")){

            longitude = 101.09121;
            latitude = 13.700206;
            LatLng latLng = new LatLng(latitude, longitude);
            //Adding marker to map
            mMap.addMarker(new MarkerOptions()
                    .position(latLng) //setting position
                    .draggable(true) //Making the marker draggable
                    .title("วัดจีนประชาสโมสร (วัดเล่งฮกยี่) : " + latitude + longitude)); //Adding a title
            //Moving the camera
            mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));

        }
        else if(MapCheck.equals("5")){

            longitude = 101.049122;
            latitude = 13.675365;
            LatLng latLng = new LatLng(latitude, longitude);
            //Adding marker to map
            mMap.addMarker(new MarkerOptions()
                    .position(latLng) //setting position
                    .draggable(true) //Making the marker draggable
                    .title("วัดชมโพธยาราม : " + latitude + longitude)); //Adding a title
            //Moving the camera
            mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));

        }
            else if(MapCheck.equals("6")){

            longitude = 101.074326;
            latitude = 13.688444;
            LatLng latLng = new LatLng(latitude, longitude);
            //Adding marker to map
            mMap.addMarker(new MarkerOptions()
                    .position(latLng) //setting position
                    .draggable(true) //Making the marker draggable
                    .title("วัดปิตุลาธิราชรังสฤษฎิ์ : " + latitude + longitude)); //Adding a title
            //Moving the camera
            mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));

        }
        else if(MapCheck.equals("7")){

            longitude = 101.140878;
            latitude = 13.701686;
            LatLng latLng = new LatLng(latitude, longitude);
            //Adding marker to map
            mMap.addMarker(new MarkerOptions()
                    .position(latLng) //setting position
                    .draggable(true) //Making the marker draggable
                    .title("วัดสมานรัตนาราม : " + latitude + longitude)); //Adding a title
            //Moving the camera
            mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));

        }
        else if(MapCheck.equals("8")){

            longitude = 101.0881031;
            latitude = 13.695813;
            LatLng latLng = new LatLng(latitude, longitude);
            //Adding marker to map
            mMap.addMarker(new MarkerOptions()
                    .position(latLng) //setting position
                    .draggable(true) //Making the marker draggable
                    .title("วัดอุภัยภาติการาม (ซำปอกง) : " + latitude + longitude)); //Adding a title
            //Moving the camera
            mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));

        }
        else if(MapCheck.equals("9")){

            longitude = 101.071318;
            latitude = 13.684548;
            LatLng latLng = new LatLng(latitude, longitude);
            //Adding marker to map
            mMap.addMarker(new MarkerOptions()
                    .position(latLng) //setting position
                    .draggable(true) //Making the marker draggable
                    .title("ศาลเจ้าพ่อหลักเมืองจังหวัดฉะเชิงเทรา  : " + latitude + longitude)); //Adding a title
            //Moving the camera
            mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));

        }
        else if(MapCheck.equals("10")){

            longitude = 101.077667;
            latitude = 13.689668;
            LatLng latLng = new LatLng(latitude, longitude);
            //Adding marker to map
            mMap.addMarker(new MarkerOptions()
                    .position(latLng) //setting position
                    .draggable(true) //Making the marker draggable
                    .title("วสำนักงานทรัพย์สินส่วนพระมหากษัตริย์จังหวัดฉะเชิงเทรา : " + latitude + longitude)); //Adding a title
            //Moving the camera
            mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));

        }






        //Animating the camera
        mMap.animateCamera(CameraUpdateFactory.zoomTo(13));


        //  getCurrentLocation();
       // moveMap();

   //     getCurrentLocation();
//
//        longitude = 101.0671555;
////            latitude = location.getLatitude();
//        latitude = 13.674173;
//
//        LatLng latLng = new LatLng(longitude, latitude);
//        mMap.addMarker(new MarkerOptions().position(latLng).draggable(true));
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
//        mMap.setOnMarkerDragListener(this);
//        mMap.setOnMapLongClickListener(this);
    }

    @Override
    public void onConnected(Bundle bundle) {

        Log.e(" onConnected","onConnected");


//        getCurrentLocation();
//        moveMap();
    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    @Override
    public void onConnectionFailed(ConnectionResult connectionResult) {

    }

    @Override
    public void onMapLongClick(LatLng latLng) {
        //Clearing all the markers
        mMap.clear();

        //Adding a new marker to the current pressed position
        mMap.addMarker(new MarkerOptions()
                .position(latLng)
                .draggable(true));
    }

    @Override
    public void onMarkerDragStart(Marker marker) {

    }

    @Override
    public void onMarkerDrag(Marker marker) {

    }

    @Override
    public void onMarkerDragEnd(Marker marker) {
        //Getting the coordinates

        Log.e(" onMarkerDragEnd","onMarkerDragEnd");
        latitude = marker.getPosition().latitude;
        longitude = marker.getPosition().longitude;

        //Moving the map
        moveMap();
    }

    @Override
    public void onClick(View v) {
        if (v == buttonCurrent) {
            getCurrentLocation();
            moveMap();

            Log.e(" onClick","onClick");
        }
    }
}