package com.ncertguruji.recyclerviewdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SimpleListAdapter extends RecyclerView.Adapter<SimpleListAdapter.SimpleListViewHolder> {


    private ArrayList<String> data1;
    private ArrayList<String> data2;
    private ArrayList<Integer> imgId1;

    public SimpleListAdapter(ArrayList<String> data1, ArrayList<String> data2, ArrayList<Integer> imgId1){
        this.data1 = data1;
        this.data2 = data2;
        this.imgId1 = imgId1;
    }

    @NonNull
    @Override
    public SimpleListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_layout,parent,false);
        return new SimpleListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SimpleListViewHolder holder, int position) {
        String title = data1.get(position);
        String content = data2.get(position);
        int imageId = imgId1.get(position);

        holder.textViewTitle.setText(title);
        holder.textViewContent.setText(content);
        holder.imgIcon.setImageResource(imageId);

    }

    @Override
    public int getItemCount() {
        return data1.size();
    }

    public static class SimpleListViewHolder extends RecyclerView.ViewHolder{
            ImageView imgIcon;
            TextView textViewTitle;
            TextView textViewContent;
        public SimpleListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgIcon = itemView.findViewById(R.id.imgIcon);
            textViewTitle = itemView.findViewById(R.id.textTitle);
            textViewContent = itemView.findViewById(R.id.textContent);

        }
    }
}
