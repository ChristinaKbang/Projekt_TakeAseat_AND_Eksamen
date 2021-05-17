package com.example.projekt_takeaseat1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class OrderFragment extends Fragment {

    private ImageButton back_to_table;
    private Button confirm_reservation;

public OrderFragment(){

}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_order, container, false);
        back_to_table = v.findViewById(R.id.back_to_table);
        confirm_reservation = v.findViewById(R.id.confirm_reservation);

        back_to_table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(getView()).navigate(R.id.tableFragment);
            }
        });
confirm_reservation.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Navigation.findNavController(getView()).navigate(R.id.finishFragment);
    }
});

        return v;
    }
}