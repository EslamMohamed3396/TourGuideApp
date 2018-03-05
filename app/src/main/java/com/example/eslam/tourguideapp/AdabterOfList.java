package com.example.eslam.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Eslam on 3/3/2018.
 */

public class AdabterOfList extends ArrayAdapter<Place> {

    public AdabterOfList(Context context, ArrayList<Place> Place) {
        super(context, 0, Place);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Place place = getItem(position);
        View rootview = convertView;
        if (rootview == null) {
            rootview = LayoutInflater.from(getContext()).inflate(R.layout.detail_of_listview_activity, parent, false);
        }
        TextView name = rootview.findViewById(R.id.place_name);
        name.setText(place.getName());
        TextView description = rootview.findViewById(R.id.lower_snake_case);
        description.setText(place.getDescription());
        ImageView image = rootview.findViewById(R.id.image);
        if (place.HasImage()) {
            image.setImageResource(place.getImageID());
        } else {
            image.setVisibility(View.GONE);
        }

        return rootview;
    }
}