package com.example.ceibasoftware;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PostAdater extends RecyclerView.Adapter<PostAdater.Holder> {

    private ArrayList<String> list;

    public PostAdater(ArrayList<String> mList) {
        list = mList;
    }

    @Override
    public long getItemId(int position) {
        super.getItemId(position);
        return position;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.post_list_item, parent, false);
        return new Holder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class Holder extends RecyclerView.ViewHolder{
        private TextView title, body;

        Holder(@NonNull View itemView) {
            super(itemView);
            body = itemView.findViewById(R.id.body);
            title = itemView.findViewById(R.id.title);
        }
    }
}
