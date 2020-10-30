package com.amirserry.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {


    public LocationAdapter(Context context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_list, parent, false);
        }

        Location currentLocation = getItem(position);
        TextView locationTextview = (TextView) listItemView.findViewById(R.id.location_name);
        locationTextview.setText(currentLocation.getLocationName());
        TextView locationDescTextView = (TextView) listItemView.findViewById(R.id.location_desc);
        locationDescTextView.setText(currentLocation.getLocationDesc());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentLocation.getImageResourceId());

        return listItemView;
    }
}
