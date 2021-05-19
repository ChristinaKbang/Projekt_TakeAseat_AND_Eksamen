package com.example.projekt_takeaseat1.ui.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.projekt_takeaseat1.R;

public class Home_tableFragment extends Fragment {

    private ImageButton tablehome1,tablehome2,tablehome3,tablehome4,tablehome5,tablehome6;
    private Button reserve;
    private boolean black=false;
    private ImageButton back;

    public Home_tableFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_table, container, false);
        tablehome1 = view.findViewById(R.id.tablehome1);
        tablehome2=view.findViewById(R.id.tablehome2);
        tablehome3=view.findViewById(R.id.tablehome3);
        tablehome4=view.findViewById(R.id.tablehome4);
        tablehome5=view.findViewById(R.id.tablehome5);
        tablehome6=view.findViewById(R.id.tablehome6);
        reserve=view.findViewById(R.id.buttonTableHome);
        back=view.findViewById(R.id.backHome);
        tablehome1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"This table have already been booked", Toast.LENGTH_SHORT).show();
            }
        });
        tablehome2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"This table have already been booked", Toast.LENGTH_SHORT).show();
            }
        });
        tablehome3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"This table have already been booked", Toast.LENGTH_SHORT).show();
            }
        });

        tablehome4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (black){
                    tablehome4.setBackgroundResource(R.color.teal_700);
                } else {
                    tablehome4.setBackgroundResource(R.color.black);
                }

                black = !black;
            }
        });
        tablehome5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (black){
                    tablehome5.setBackgroundResource(R.color.teal_700);
                } else {
                    tablehome5.setBackgroundResource(R.color.black);
                }

                black = !black;
            }
        });
        tablehome6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (black){
                    tablehome6.setBackgroundResource(R.color.teal_700);
                } else {
                    tablehome6.setBackgroundResource(R.color.black);
                }

                black = !black;
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(getView()).navigate(R.id.navigation_home);
            }
        });

        reserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(getView()).navigate(R.id.home_Order_Fragment);
            }
        });


        return view;
    }
}