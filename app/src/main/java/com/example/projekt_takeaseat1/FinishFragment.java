package com.example.projekt_takeaseat1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class FinishFragment extends Fragment {

    private Button getOrderNumber;
    private TextView tekst, number;


    public FinishFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_finish, container, false);
        final Random myRandom = new Random();
        getOrderNumber = view.findViewById(R.id.getOrderNumber);
        number = view.findViewById(R.id.number);
        tekst = view.findViewById(R.id.tekst);


        getOrderNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.setText(String.valueOf(myRandom.nextInt(100)));
                tekst.setText("Your reservation number is:");
            }
        });

        return view;
    }

}