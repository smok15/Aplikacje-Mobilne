package com.example.astro;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Sun extends Fragment {
    private final Double[] data = new Double[3];

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sun, container, false);
        TextView sunText = view.findViewById(R.id.sunInfo);
        getParentFragmentManager().setFragmentResultListener("data", this, (requestKey, result) -> {
            data[0] = result.getDouble("lat");
            data[1] = result.getDouble("lon");
            data[2] = result.getDouble("int");
            sunText.setText("Latitude: " + data[0].toString() + "\nLongitude: " + data[1].toString() + "\nInterval: " + data[2].toString());
        });
        return view;
    }


}