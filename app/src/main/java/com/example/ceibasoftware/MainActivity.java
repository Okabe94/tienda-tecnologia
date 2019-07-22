package com.example.ceibasoftware;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements UserAdapter.OnUserClick {

    private Context context;
    private UserAdapter adapter;
    private EditText editTextSearch;
    private RecyclerView recyclerViewSearchResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;

        editTextSearch = findViewById(R.id.editTextSearch);
        recyclerViewSearchResults = findViewById(R.id.recyclerViewSearchResults);

        ArrayList<String> list = new ArrayList<>();
        list.add("Lucho");
        adapter = new UserAdapter(list, this);
        recyclerViewSearchResults.setAdapter(adapter);
        recyclerViewSearchResults.setLayoutManager(new LinearLayoutManager(context));
    }

    @Override
    public void onUserClick(int position) {
        Intent intent = new Intent(context, PostActivity.class);
        startActivity(intent);
    }
}
