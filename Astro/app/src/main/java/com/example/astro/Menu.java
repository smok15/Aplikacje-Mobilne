package com.example.astro;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class Menu extends Fragment implements View.OnClickListener {

    private TextView settings;
    private EditText latitude, longitude, interval;
    private final Double[] data = new Double[3];

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu, container, false);
        Button submit = view.findViewById(R.id.submit);
        latitude = view.findViewById(R.id.latitude);
        longitude = view.findViewById(R.id.longitude);
        interval = view.findViewById(R.id.refreshInterval);
        settings = view.findViewById(R.id.actualSettings);
        submit.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        Bundle bundle = new Bundle();
        data[0] = Double.parseDouble(latitude.getText().toString());
        data[1] = Double.parseDouble(longitude.getText().toString());
        data[2] = Double.parseDouble(interval.getText().toString());
        bundle.putDouble("lon", data[0]);
        bundle.putDouble("lat", data[1]);
        bundle.putDouble("int", data[2]);
        settings.setText("Latitude: " + data[0].toString() + "\nLongitude: " + data[1].toString() + "\nInterval: " + data[2].toString());
        getParentFragmentManager().setFragmentResult("data", bundle);
        getParentFragmentManager().setFragmentResult("data1", bundle);
    }


}