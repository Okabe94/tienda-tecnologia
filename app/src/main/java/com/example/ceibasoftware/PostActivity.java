package com.example.ceibasoftware;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PostActivity extends Activity {

    private Context context;
    private PostAdater adater;
    private TextView name, phone, email;
    private RecyclerView recyclerViewPostsResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        name = findViewById(R.id.name);
        phone = findViewById(R.id.phone);
        email = findViewById(R.id.email);
        recyclerViewPostsResults = findViewById(R.id.recyclerViewPostsResults);

        ArrayList<String> list = new ArrayList<>();
        list.add("LUCHO");
        adater = new PostAdater(list);
        recyclerViewPostsResults.setAdapter(adater);
        recyclerViewPostsResults.setLayoutManager(new LinearLayoutManager(context));
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
