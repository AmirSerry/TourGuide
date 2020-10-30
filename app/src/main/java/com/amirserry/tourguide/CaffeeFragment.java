package com.amirserry.tourguide;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class CaffeeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.left_bank, R.string.left_bank_desc,
                R.drawable.left_bank));
        locations.add(new Location(R.string.kafein, R.string.kafein_desc,
                R.drawable.kafein));
        locations.add(new Location(R.string.fresco_bakery, R.string.fresco_bakery_desc,
                R.drawable.fresco_bakery));
        locations.add(new Location(R.string.cafe_corniche, R.string.cafe_corniche_desc,
                R.drawable.cafe_corniche));
        locations.add(new Location(R.string.cake_cafe, R.string.cake_cafe_desc,
                R.drawable.cake_cafe));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
