package com.example.projekt_takeaseat1.ui.login;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.projekt_takeaseat1.model.AppRepository;
import com.google.firebase.auth.FirebaseUser;

public class LoginRegisterViewModel extends AndroidViewModel {
private AppRepository appRepository;
private MutableLiveData<FirebaseUser> userMutableLiveData;

    public LoginRegisterViewModel(@NonNull Application application) {
        super(application);

        appRepository = new AppRepository(application);
        userMutableLiveData = appRepository.getUserMutableLiveData();
    }

    //Implementering af register metoden
    public void register(String email, String password){
        appRepository.register(email,password);
    }

    public void login(String email, String password){
        appRepository.login(email, password);
    }

    public MutableLiveData<FirebaseUser> getUserMutableLiveData() {
        return userMutableLiveData;
    }
}
