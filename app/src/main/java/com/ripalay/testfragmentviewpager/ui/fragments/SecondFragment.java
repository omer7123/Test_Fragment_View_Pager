package com.ripalay.testfragmentviewpager.ui.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ripalay.testfragmentviewpager.R;

import java.text.DateFormat;
import java.util.Date;

public class SecondFragment extends Fragment {
  //  private TextView time;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
/*
        time = view.findViewById(R.id.time_tv);
        String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
time.setText(currentDateTimeString);*/
    }
}