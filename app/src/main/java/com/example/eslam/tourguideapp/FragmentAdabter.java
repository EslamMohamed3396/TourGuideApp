package com.example.eslam.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Eslam on 3/3/2018.
 */

public class FragmentAdabter extends FragmentPagerAdapter {
    Context context;

    public FragmentAdabter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.RestaurantTab);
        } else if (position == 1) {
            return context.getString(R.string.HistoricTab);
        } else {
            return context.getString(R.string.CafeTab);
        }
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ResturantFragment();
        } else if (position == 1) {
            return new HistoricFragment();
        } else {
            return new CafeFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}