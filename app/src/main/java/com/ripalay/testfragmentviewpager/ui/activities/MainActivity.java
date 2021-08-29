package com.ripalay.testfragmentviewpager.ui.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.ripalay.testfragmentviewpager.R;
import com.ripalay.testfragmentviewpager.ui.adapters.ViewPagerAdapter;
import com.ripalay.testfragmentviewpager.ui.fragments.FirstFragment;
import com.ripalay.testfragmentviewpager.ui.fragments.SecondFragment;
import com.ripalay.testfragmentviewpager.ui.fragments.ThirdFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ViewPager2 viewPager2;
    private ArrayList<Fragment> list = new ArrayList<>();
    private ViewPagerAdapter adapter = new ViewPagerAdapter(this);
    private String[] titles = {"Exchange", "Date & Time", "More"};
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        createList();
        initAdapter();


    }

    private void initAdapter() {
        adapter.setList(list);
        viewPager2.setAdapter(adapter);
        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setText(titles[position]);
            }
        }).attach();
    }

    private void createList() {
        list.add(new FirstFragment());
        list.add(new SecondFragment());
        list.add(new ThirdFragment());

    }

    private void initViews() {
        viewPager2 = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);
    }
}
