package com.example.restaurantbooking;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.content.Context;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class RestaurantAdapter extends ArrayAdapter<RestaurantModel> {
    List<RestaurantModel> restaurantModelList;
    Context context;
    int res;

    public RestaurantAdapter(@NonNull Context context, int resource, List<RestaurantModel> list){
        super(context, resource);
        this.res=resource;
        this.restaurantModelList = list;
        this.context=context;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View v = convertView;
        if(v==null){
            LayoutInflater l;
            l = LayoutInflater.from(context);
            v=l.inflate(res, null);
        }
        Log.e("item name ", restaurantModelList.get(position).name);

        TextView textView = v.findViewById(R.id.txtview);
        textView.setText(restaurantModelList.get(position).name);

        return super.getView(position, convertView, parent);
    }

}
