package com.example.projekt_takeaseat1.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.projekt_takeaseat1.model.NewsRepository;

import java.util.List;

public class NewsViewModel extends ViewModel {

    private MutableLiveData<List<News>> news;
    private NewsRepository repository;

    public NewsViewModel(){
        repository = new NewsRepository();
    }
    public LiveData<List<News>> getNews() {
        return repository.getNews();
    }
}