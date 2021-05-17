package com.example.projekt_takeaseat1.ui.home;

import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projekt_takeaseat1.R;
import com.example.projekt_takeaseat1.ui.news.News;
import com.example.projekt_takeaseat1.ui.news.NewsAdapter;
import com.example.projekt_takeaseat1.ui.news.NewsFragment;
import com.example.projekt_takeaseat1.ui.news.NewsViewModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment implements HomeAdapter.OnListItemClickListener {

    private HomeViewModel homeViewModel;
    private RecyclerView recyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_news, container, false);

        recyclerView = root.findViewById(R.id.list_of_items_home);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.hasFixedSize();
        HomeAdapter adapter = new HomeAdapter(position -> {


            if (position == 0) {
                Navigation.findNavController(HomeFragment.this.getView()).navigate(R.id.testFragment);
            } else {
                Navigation.findNavController(HomeFragment.this.getView()).navigate(R.id.testFragment);
            }


        });



        recyclerView.setAdapter(adapter);

        homeViewModel.getHome().observe(getViewLifecycleOwner(), homes -> {
            adapter.updateList(homes);
        });

        return root;
    }

    @Override
    public void onClick(int position) {

    }
}