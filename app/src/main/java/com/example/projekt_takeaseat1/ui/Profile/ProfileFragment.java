package com.example.projekt_takeaseat1.ui.Profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.projekt_takeaseat1.R;
import com.example.projekt_takeaseat1.viewmodel.LoggedInViewModel;
import com.google.firebase.auth.FirebaseUser;

public class ProfileFragment extends Fragment {


    private TextView profileTextview;
    private Button profileButton;
    private LoggedInViewModel LoggedInViewModel;


    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LoggedInViewModel = new ViewModelProvider(this).get(LoggedInViewModel.class);
        LoggedInViewModel.getUserMutableLiveData().observe(this, new Observer<FirebaseUser>() {
            @Override
            public void onChanged(FirebaseUser firebaseUser) {
                if (firebaseUser != null){
                    profileTextview.setText("Bruger:" + firebaseUser.getEmail());
                }
            }
        });

        LoggedInViewModel.getLoggedOutMutableLiveData().observe(this, new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean loggedOut) {
                if (loggedOut){
                    Navigation.findNavController(getView()).navigate(R.id.action_profileFragment_to_loginRegisterFragment);
                }
            }
        });
    }

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        profileButton = view.findViewById(R.id.log_out);
        profileTextview = view.findViewById(R.id.loggedIn_user);

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoggedInViewModel.logOut();
            }
        });

        return view;

       // final TextView textView = root.findViewById(R.id.fragment_loggedin_loggedInUser);
       // profileViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
           // @Override
           // public void onChanged(@Nullable String s) {
             //   textView.setText(s);
            //}
        //});
        //return root;
   // }
}
}