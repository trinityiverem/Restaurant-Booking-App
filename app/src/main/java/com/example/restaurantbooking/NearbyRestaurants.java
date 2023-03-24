package com.example.restaurantbooking;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import okhttp3.OkHttpClient;


import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;

import android.content.pm.PackageManager;

import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlaceLikelihood;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class NearbyRestaurants extends AppCompatActivity {
    private GoogleMap mMap;
    private MapView mMapView;
    private TableLayout mTableLayout;

    List<RestaurantModel> list = new ArrayList<RestaurantModel>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearby_restaurants);
        String cat = getIntent().getStringExtra("cat");
        TextView textView = findViewById(R.id.txtview);
        textView.setText(cat+ " Restaurants list");
        ListView listView = findViewById(R.id.listview);

        if (cat.equals("Italian")){
            RestaurantModel restaurantModel = new RestaurantModel("Bella Italia","The Cornerhouse, Forman St, Nottingham NG1 4DB");
            list.add(restaurantModel);

            RestaurantModel restaurantModel1 = new RestaurantModel("Zizzi","12 King St, Nottingham NG1 2AS");
            list.add(restaurantModel1);

            RestaurantModel restaurantModel2 = new RestaurantModel("Pizza Express","20 King St, Nottingham NG1 2AS");
            list.add(restaurantModel2);


            RestaurantModel restaurantModel3 = new RestaurantModel("Casa Italian","110 Upper Parliament St, Nottingham NG1 6LF");
            list.add(restaurantModel3);

            RestaurantAdapter restaurantAdapter = new RestaurantAdapter(NearbyRestaurants.this, R.layout.list_layout, list);
            Log.e("list size ", list.size()+"");
            listView.setAdapter(restaurantAdapter);



        }



    }


    }


