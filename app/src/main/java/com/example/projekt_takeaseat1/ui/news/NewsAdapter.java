package com.example.projekt_takeaseat1.ui.news;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projekt_takeaseat1.R;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.Viewholder> {

    List<News> news;
    OnListItemClickListener listener;


    public NewsAdapter( OnListItemClickListener listener){
        this.listener = listener;

    }

    @NonNull
    @Override
    public NewsAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.news_item, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsAdapter.Viewholder holder, int position) {
        holder.news_name.setText(news.get(position).getName());
        holder.news_pic.setImageResource(news.get(position).getmIconid());

    }

    @Override
    public int getItemCount() {
        return news.size();
    }

    public void updateData(List<News> news) {
        this.news = news;
        notifyDataSetChanged();
    }


    public class Viewholder extends RecyclerView.ViewHolder {

        TextView news_name;
        ImageView news_pic;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onClick(getAdapterPosition());
                }
            });
            news_name = itemView.findViewById(R.id.news_name);
            news_pic = itemView.findViewById(R.id.news_pic);
        }
    }

    public interface OnListItemClickListener {
        void onClick(int position);
    }


}
