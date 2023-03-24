package com.example.restaurantbooking;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.drawerlayout.widget.DrawerLayout;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;


public class CuisinesFragment extends Fragment {


    public CuisinesFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static CuisinesFragment newInstance(String param1, String param2) {
        CuisinesFragment fragment = new CuisinesFragment();
        Bundle args = new Bundle();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
        /**  ImageButton btnAfrican= getView().findViewById(R.id.african);
        ImageButton btnAsian= getView().findViewById(R.id.asian);
        ImageButton btnCarr= getView().findViewById(R.id.caribbean);
        ImageButton btnEnglish= getView().findViewById(R.id.english);
        ImageButton btnItalian= getView().findViewById(R.id.italian);
        ImageButton btnMexican= getView().findViewById(R.id.mexican);



        btnAfrican.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSubCategory("African");
            }
        });


        btnAsian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSubCategory("Asian");
            }
        });



        btnCarr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSubCategory("Caribbean");
            }
        });



        btnEnglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSubCategory("English");
            }
        });



        btnItalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSubCategory("Italian");
            }
        });



        btnMexican.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSubCategory("Mexican");
            }
        });






    }

    private void openSubCategory(String cat) {
        Intent i = new Intent(getActivity(), NearbyRestaurants.class);
        i.putExtra("cat", cat);
        startActivity(i);

    }

*/
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cuisines, container, false);




    }
}