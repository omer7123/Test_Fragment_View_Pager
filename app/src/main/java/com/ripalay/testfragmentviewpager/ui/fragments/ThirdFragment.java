package com.ripalay.testfragmentviewpager.ui.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;

import com.ripalay.testfragmentviewpager.R;

public class ThirdFragment extends Fragment {
    private SwitchCompat switchC;
    private ImageView imageView;
    Fragment first = new Fragment(R.layout.five_fragment);
    Fragment second = new Fragment(R.layout.fragment_four);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getChildFragmentManager().beginTransaction().add(R.id.container, first).commit();

        switchC = view.findViewById(R.id.switch_compat);

        switchC.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                getChildFragmentManager()
                        .beginTransaction()
                        .setCustomAnimations(R.anim.animation, R.anim.anim)
                        .replace(R.id.container, second)
                        .commit();

            } else {
                getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.reverse_animation, R.anim.reverse_anim)
                        .replace(R.id.container, first)
                        .commit();
            }
        });
    }
}