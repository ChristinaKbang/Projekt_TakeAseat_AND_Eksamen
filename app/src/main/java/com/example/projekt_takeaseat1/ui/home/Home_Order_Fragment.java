package com.example.projekt_takeaseat1.ui.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.projekt_takeaseat1.R;


public class Home_Order_Fragment extends Fragment {
    private ImageButton back_to_table_home;
    private Button confirm_reservation_home;


    public Home_Order_Fragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home__order_, container, false);
        back_to_table_home = view.findViewById(R.id.back_to_table_home);
        confirm_reservation_home = view.findViewById(R.id.confirm_reservation_home);

        back_to_table_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(getView()).navigate(R.id.home_tableFragment);
            }
        });
        confirm_reservation_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(getView()).navigate(R.id.finishFragment);
            }
        });

        return view;
    }
}