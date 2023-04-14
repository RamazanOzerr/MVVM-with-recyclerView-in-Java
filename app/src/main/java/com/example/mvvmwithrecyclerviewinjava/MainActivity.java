package com.example.mvvmwithrecyclerviewinjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.android.material.appbar.MaterialToolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<DataModel> dataModelList;
    private RecyclerView recyclerView;
    private DataAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataViewModel viewModel = new ViewModelProvider(this).get(DataViewModel.class);

        init();

        viewModel.getChats().observe(this, dataModels -> {
            dataModelList.clear();
            dataModelList.addAll(dataModels);
            adapter = new DataAdapter(dataModelList);
            recyclerView.setAdapter(adapter);
        });

    }

    private void init(){
        recyclerView = findViewById(R.id.recyclerView_main);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        dataModelList = new ArrayList<>();
        MaterialToolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
}