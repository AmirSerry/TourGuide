package com.amirserry.tourguide;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class LocationsAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public LocationsAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HistoricalPlacesFragment();
        } else if (position == 1) {
            return new RestaurantFragment();
        } else if (position == 2) {
            return new CaffeeFragment();
        } else {
            return new CinemaFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.historical_places);
        } else if (position == 1) {
            return mContext.getString(R.string.restaurant);
        } else if (position == 2) {
            return mContext.getString(R.string.caffee);
        } else {
            return mContext.getString(R.string.cinema);
        }
    }
}
