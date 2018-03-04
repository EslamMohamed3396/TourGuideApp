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
public class HistoricFragment extends Fragment {


    public HistoricFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.list_view_activity, container, false);
        ArrayList<Details> listOfHostoric = new ArrayList<>();
        listOfHostoric.add(new Details(getString(R.string.simble), getString(R.string.simble_description), R.drawable.abu_simbel));
        listOfHostoric.add(new Details(getString(R.string.sphinx), getString(R.string.sphinx_description), R.drawable.sphinx));
        listOfHostoric.add(new Details(getString(R.string.Karnak), getString(R.string.karnak_description), R.drawable.karnak));
        listOfHostoric.add(new Details(getString(R.string.Pyramids), getString(R.string.py_description), R.drawable.py));
        ListView listView = (ListView) rootview.findViewById(R.id.list_view);
        AdabterOfList adabter = new AdabterOfList(getActivity(), listOfHostoric);
        listView.setAdapter(adabter);
        return rootview;
    }

}