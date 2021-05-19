package com.example.projekt_takeaseat1.model;




import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;


import com.example.projekt_takeaseat1.R;
import com.example.projekt_takeaseat1.ui.home.Home;
import com.example.projekt_takeaseat1.ui.news.News;


import java.util.ArrayList;
import java.util.List;

public class NewsRepository {


    private MutableLiveData<List<News>> newsLiveData = new MutableLiveData<>();

    public NewsRepository(){



        ArrayList<News> news = new ArrayList<>();

        news.add(new News("NEW!! Try it out!", R.drawable.smokehouse));
        news.add(new News("NEW!! Try it out!", R.drawable.randomrestaurant));
        news.add(new News("NEW!! Try it out!", R.drawable.mash));


        newsLiveData.setValue(news);



    }


    public LiveData<List<News>> getNews() {
        return newsLiveData;
    }



}

