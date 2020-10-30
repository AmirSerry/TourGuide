package com.amirserry.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class RestaurantFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.peppermint, R.string.peppermint_desc,
                R.drawable.peppermint));
        locations.add(new Location(R.string.nisantasi, R.string.nisantasi_desc,
                R.drawable.nisantasi));
        locations.add(new Location(R.string.esplanade, R.string.esplanade_desc,
                R.drawable.esplanade));
        locations.add(new Location(R.string.indira, R.string.indira_desc,
                R.drawable.indira));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
