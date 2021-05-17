package com.example.projekt_takeaseat1.model;




import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;


import com.example.projekt_takeaseat1.R;
import com.example.projekt_takeaseat1.ui.news.News;


import java.util.ArrayList;
import java.util.List;

public class NewsRepository {


    private MutableLiveData<List<News>> newsLiveData = new MutableLiveData<>();

    public NewsRepository(){



        ArrayList<News> news = new ArrayList<>();
        news.add(new News("NEW!! Try it out!", R.drawable.lava));
        news.add(new News("NEW!! Try it out!", R.drawable.helmut));
        news.add(new News("NEW!! Try it out!", R.drawable.detgladevanvid));
        news.add(new News("NEW!! Try it out!", R.drawable.mash));
        news.add(new News("NEW!! Try it out!", R.drawable.flammen));
        news.add(new News("NEW!! Try it out!", R.drawable.jensens));


        newsLiveData.setValue(news);



    }


    public LiveData<List<News>> getNews() {
        return newsLiveData;
    }



}

