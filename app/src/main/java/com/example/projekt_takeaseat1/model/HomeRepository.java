package com.example.projekt_takeaseat1.model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.projekt_takeaseat1.R;
import com.example.projekt_takeaseat1.ui.home.Home;


import java.util.ArrayList;
import java.util.List;



public class HomeRepository {
    private MutableLiveData<List<Home>> homeLiveData = new MutableLiveData<>();

    public HomeRepository(){



        ArrayList<Home> homes = new ArrayList<>();
        homes.add(new Home("Det Glade Vanvid", R.drawable.detgladevanvid));
        homes.add(new Home("HELMUT", R.drawable.helmut));
        homes.add(new Home("flammen", R.drawable.flammen));
        homes.add(new Home("LAVA", R.drawable.lava));
        homes.add(new Home("Jensens bøfhus", R.drawable.jensens));




        homeLiveData.setValue(homes);



    }

    public LiveData<List<Home>> getHome() {
        return homeLiveData;
    }
}

