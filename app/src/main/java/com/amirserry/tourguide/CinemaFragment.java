package com.amirserry.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class CinemaFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.san_stefano, R.string.san_stefano_desc,
                R.drawable.san_stefano));
        locations.add(new Location(R.string.vox, R.string.vox_desc,
                R.drawable.vox));
        locations.add(new Location(R.string.deeb, R.string.deeb_desc,
                R.drawable.deep));
        locations.add(new Location(R.string.cine_plex, R.string.cine_plex_desc,
                R.drawable.cine_plex));
        locations.add(new Location(R.string.cine_plus, R.string.cine_plus_desc,
                R.drawable.cine_plus));
        locations.add(new Location(R.string.kiroseiz, R.string.kiroseiz_desc,
                R.drawable.kiroseiz));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
