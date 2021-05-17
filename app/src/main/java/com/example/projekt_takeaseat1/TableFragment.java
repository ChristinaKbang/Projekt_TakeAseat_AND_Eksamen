package com.example.projekt_takeaseat1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;




public class TableFragment extends Fragment {

    private ImageButton table1, table2, table3, table4;
    private Button reserve;
    private boolean black = false;
    private ImageButton back;

public TableFragment(){

}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_table, container, false);
        table1 = view.findViewById(R.id.Table1);
        table2 = view.findViewById(R.id.Table2);
        table3 = view.findViewById(R.id.Table3);
        table4 = view.findViewById(R.id.Table4);
        reserve = view.findViewById(R.id.buttonTable);
        back = view.findViewById(R.id.back);
        table1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (black){
                    table1.setBackgroundResource(R.color.teal_700);
                } else {
                    table1.setBackgroundResource(R.color.black);
                }

                black = !black;
            }
        });
        table2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (black){
                    table2.setBackgroundResource(R.color.teal_700);
                } else {
                    table2.setBackgroundResource(R.color.black);
                }

                black = !black;
            }
        });
        table3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (black){
                    table3.setBackgroundResource(R.color.teal_700);
                } else {
                    table3.setBackgroundResource(R.color.black);
                }

                black = !black;
            }
        });
        table4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (black){
                    table4.setBackgroundResource(R.color.teal_700);
                } else {
                    table4.setBackgroundResource(R.color.black);
                }

                black = !black;
            }


        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(getView()).navigate(R.id.navigation_news);
            }
        });

        reserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(getView()).navigate(R.id.orderFragment);
            }
        });
return view;
    }

}