package com.example.eslam.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ResturantFragment extends Fragment {


    public ResturantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.list_view_activity, container, false);
        ArrayList<Details> listOfResturant = new ArrayList<>();
        listOfResturant.add(new Details(getString(R.string.Hut), getString(R.string.LocztionOFHut), R.drawable.pizza_hut));
        listOfResturant.add(new Details(getString(R.string.King), getString(R.string.LocztionOFKing), R.drawable.pizza_king));
        listOfResturant.add(new Details(getString(R.string.KFc), getString(R.string.LocationOfKFC), R.drawable.kfc));
        listOfResturant.add(new Details(getString(R.string.Buffalo_burger), getString(R.string.LocztionOFBurger), R.drawable.burger));
        ListView listView = (ListView) rootview.findViewById(R.id.list_view);
        AdabterOfList adabter = new AdabterOfList(getActivity(), listOfResturant);
        listView.setAdapter(adabter);
        return rootview;
    }
}