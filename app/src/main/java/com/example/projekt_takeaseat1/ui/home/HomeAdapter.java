package com.example.projekt_takeaseat1.ui.home;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projekt_takeaseat1.R;
import com.example.projekt_takeaseat1.ui.news.NewsAdapter;

import java.util.List;


public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.Viewholder>  {

    List<Home> homes;
    OnListItemClickListener listener;


    public HomeAdapter(OnListItemClickListener onListItemClickListener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public HomeAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.home_item, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeAdapter.Viewholder holder, int position) {
        holder.home_name.setText(homes.get(position).getHome_name());
        holder.home_pic.setImageResource(homes.get(position).gethImageid());

    }

    public void updateList(List<Home> homes) {
        this.homes = homes;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return homes.size();
    }


    public class Viewholder extends RecyclerView.ViewHolder {

        TextView home_name;
        ImageView home_pic;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onClick(getAdapterPosition());
                }
            });
            home_name = itemView.findViewById(R.id.home_name);
            home_pic = itemView.findViewById(R.id.home_pic);
        }
    }

    public interface OnListItemClickListener {
        void onClick(int position);
    }


}
