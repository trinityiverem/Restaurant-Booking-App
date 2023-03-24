package com.example.restaurantbooking;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;




public class HomeFragment extends Fragment  {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        Button noBookingsButton = (Button) view.findViewById(R.id.home_bookings);
        noBookingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View view) {
             Fragment nextFrag = new BookingsFragment();
              FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
             fm.replace(R.id.fragment_container, nextFrag).commit();
           }
       });
        return view;
    }
   

}