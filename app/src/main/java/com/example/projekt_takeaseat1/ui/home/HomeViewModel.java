package com.example.projekt_takeaseat1.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.projekt_takeaseat1.model.HomeRepository;
import com.example.projekt_takeaseat1.model.NewsRepository;
import com.example.projekt_takeaseat1.ui.news.News;

import java.util.List;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<List<Home>> homes;
    private HomeRepository repository;

    public HomeViewModel(){
        repository = new HomeRepository();
    }
    public LiveData<List<Home>> getHome() {
        return repository.getHome();
    }
}