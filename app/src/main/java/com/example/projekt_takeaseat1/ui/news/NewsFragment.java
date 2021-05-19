package com.example.projekt_takeaseat1.ui.news;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projekt_takeaseat1.R;

public class NewsFragment extends Fragment {

    private NewsViewModel newsViewModel;
    private RecyclerView recyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        newsViewModel = new ViewModelProvider(this).get(NewsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_news, container, false);

        recyclerView = root.findViewById(R.id.list_of_items);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.hasFixedSize();
        NewsAdapter adapter = new NewsAdapter(new NewsAdapter.OnListItemClickListener() {
            @Override
            public void onClick(int position) {
                //en bruger har trykke på en position i listen

                if (position == 0) {
                    Navigation.findNavController(NewsFragment.this.getView()).navigate(R.id.newsTableFragment);
                } else {
                    Navigation.findNavController(NewsFragment.this.getView()).navigate(R.id.newsTableFragment);
                }


            }
        });



        recyclerView.setAdapter(adapter);

        newsViewModel.getNews().observe(getViewLifecycleOwner(), news -> {
            adapter.updateData(news);
        });

        return root;
    }
}