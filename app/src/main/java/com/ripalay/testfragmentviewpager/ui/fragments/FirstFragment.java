package com.ripalay.testfragmentviewpager.ui.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ripalay.testfragmentviewpager.R;
import com.ripalay.testfragmentviewpager.ui.adapters.KryptoBlock;
import com.ripalay.testfragmentviewpager.ui.adapters.PriceCoinAdapter;

import java.util.ArrayList;

public class FirstFragment extends Fragment {
    private ArrayList<KryptoBlock> list = new ArrayList<>();
    private PriceCoinAdapter adapter = new PriceCoinAdapter();
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycler);
        for(long i = 0; i < 100; i++){
            KryptoBlock vcoin = new KryptoBlock(R.drawable.bitcoin, "V- coin", "1.00");
            list.add(vcoin);
        }
//        KryptoBlock bitcoin = new KryptoBlock(R.drawable.bitcoin, "B - coin +", "1.00");
//        KryptoBlock bitcoin = new KryptoBlock(R.drawable.bitcoin, "B - coin +", "1.00");
//        KryptoBlock bitcoin = new KryptoBlock(R.drawable.bitcoin, "B - coin +", "1.00");
//        KryptoBlock bitcoin = new KryptoBlock(R.drawable.bitcoin, "B - coin +", "1.00");
//        KryptoBlock bitcoin = new KryptoBlock(R.drawable.bitcoin, "B - coin +", "1.00");
//        KryptoBlock bitcoin = new KryptoBlock(R.drawable.bitcoin, "B - coin +", "1.00");
//        KryptoBlock bitcoin = new KryptoBlock(R.drawable.bitcoin, "B - coin +", "1.00");
//        KryptoBlock bitcoin = new KryptoBlock(R.drawable.bitcoin, "B - coin +", "1.00");
//
//
//        list.add(bitcoin);
//        list.add(bitcoin);
//        list.add(bitcoin);
//        list.add(bitcoin);
//        list.add(bitcoin);
//        list.add(bitcoin);
//        list.add(bitcoin);
//        list.add(bitcoin);
//        list.add(bitcoin);

        adapter.setList(list);
        recyclerView.setAdapter(adapter);


    }


}