package com.farhan.advotics.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.farhan.advotics.R;
import com.farhan.advotics.RecyclerAdapter;
import com.farhan.advotics.mCat;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private RecyclerView rc;
    RecyclerAdapter adapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(this, new Observer<mCat>() {
            @Override
            public void onChanged(mCat mCat) {

            }
        });

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this.getActivity());
        rc = root.findViewById(R.id.recycleer_view);
        rc.setLayoutManager(layoutManager);
        rc.setHasFixedSize(true);
        rc.setNestedScrollingEnabled(false);
        adapter = new RecyclerAdapter();
        rc.setAdapter(adapter);

        return root;
    }
}