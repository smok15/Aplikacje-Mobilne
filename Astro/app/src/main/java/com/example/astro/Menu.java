package com.example.astro;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class Menu extends Fragment implements View.OnClickListener {

    private EditText latitude, longitude, refreshInterval;
    private TextView settings;
    public Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu, container, false);
        latitude = view.findViewById(R.id.latitude);
        longitude = view.findViewById(R.id.longitude);
        refreshInterval = view.findViewById(R.id.refreshInterval);
        settings = view.findViewById(R.id.actualSettings);
        button = view.findViewById(R.id.submit);
        button.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        String input = latitude.getText().toString();
        //MainActivity.latitude = latitude.getText().toString();
        //MainActivity.longitude = longitude.getText().toString();
        //MainActivity.refreshInterval = refreshInterval.getText().toString();
        //settings.setText("Aktualne ustawienia:\nSzerokość geograficzna: " + MainActivity.latitude + "\nDługość geograficzna: " + MainActivity.longitude + "\nCzas odświeżania: " + MainActivity.refreshInterval);
    }


}