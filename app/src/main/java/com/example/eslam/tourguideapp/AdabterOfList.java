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

public class AdabterOfList extends ArrayAdapter<Details> {

    public AdabterOfList(Context context, ArrayList<Details> Details) {
        super(context, 0, Details);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Details details = getItem(position);
        View rootview = convertView;
        if (rootview == null) {
            rootview = LayoutInflater.from(getContext()).inflate(R.layout.detail_of_listview_activity, parent, false);
        }
        TextView name = (TextView) rootview.findViewById(R.id.name);
        name.setText(details.getName());
        TextView description = (TextView) rootview.findViewById(R.id.Description);
        description.setText(details.getDescription());
        ImageView image = (ImageView) rootview.findViewById(R.id.image);
        if (details.HasImage()) {
            image.setImageResource(details.getImageID());
        } else {
            image.setVisibility(View.GONE);
        }

        return rootview;
    }
}