package com.amirserry.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class HistoricalPlacesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.old_town, R.string.old_town_desc,
                R.drawable.old_town));
        locations.add(new Location(R.string.al_qasr, R.string.al_qasr_desc,
                R.drawable.al_qasr));
        locations.add(new Location(R.string.faiyum, R.string.faiyum_desc,
                R.drawable.faiyum));
        locations.add(new Location(R.string.aswna, R.string.aswna_desc,
                R.drawable.aswan));
        locations.add(new Location(R.string.dahab, R.string.dahab_desc,
                R.drawable.dahab));
        locations.add(new Location(R.string.wadi_el_natrun, R.string.wadi_el_natrun_desc,
                R.drawable.wadi_natrun));
        locations.add(new Location(R.string.luxor, R.string.luxor_desc,
                R.drawable.luxor));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
