package com.example.ceibasoftware;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.Holder> {

    private OnUserClick listener;
    private ArrayList<String> list;

    public UserAdapter(ArrayList<String> mList, OnUserClick mListener) {
        list = mList;
        listener = mListener;
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
        View itemView = inflater.inflate(R.layout.user_list_item, parent, false);
        return new Holder(itemView, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        // object para dividir
        holder.name.setText("");
        holder.phone.setText("");
        holder.email.setText("");
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class Holder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private OnUserClick listener;
        private Button btn_view_post;
        private TextView name, phone, email;

        Holder(@NonNull View itemView, OnUserClick mListener) {
            super(itemView);
            listener = mListener;
            name = itemView.findViewById(R.id.name);
            phone = itemView.findViewById(R.id.phone);
            email = itemView.findViewById(R.id.email);
            btn_view_post = itemView.findViewById(R.id.btn_view_post);
            btn_view_post.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            listener.onUserClick(getAdapterPosition());
        }
    }

    public interface OnUserClick {
        void onUserClick(int position);
    }
}
