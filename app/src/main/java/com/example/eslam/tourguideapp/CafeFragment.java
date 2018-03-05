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
public class CafeFragment extends Fragment {


    public CafeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.list_view_activity, container, false);
        ArrayList<Place> listOfCafe = new ArrayList<>();
        listOfCafe.add(new Place(getString(R.string.Spectra), getString(R.string.Spectra_description)));
        listOfCafe.add(new Place(getString(R.string.Star), getString(R.string.Star_description)));
        listOfCafe.add(new Place(getString(R.string.Cost), getString(R.string.Cost_description)));
        listOfCafe.add(new Place(getString(R.string.Class), getString(R.string.Class_description)));
        ListView listView = rootview.findViewById(R.id.list_view);
        AdabterOfList adabter = new AdabterOfList(getActivity(), listOfCafe);
        listView.setAdapter(adabter);
        return rootview;
    }

}