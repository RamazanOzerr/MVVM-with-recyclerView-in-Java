package com.example.mvvmwithrecyclerviewinjava;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class DataViewModel extends ViewModel {

    private final MutableLiveData<List<DataModel>> liveData;
    private List<DataModel> dataModelList;

    public DataViewModel() {
        liveData = new MutableLiveData<>();
        init();
    }

    private void init(){
        dataModelList = new ArrayList<>();
        populateList();
        liveData.setValue(dataModelList);
    }

    private void populateList(){

        DataModel python = new DataModel("Python", R.drawable.python);
        DataModel java = new DataModel("Java", R.drawable.java);
        DataModel csharp = new DataModel("C#", R.drawable.csharp);
        DataModel c = new DataModel("C", R.drawable.c);
        DataModel kotlin = new DataModel("Kotlin", R.drawable.img);
        DataModel swift = new DataModel("swift", R.drawable.swift);
        dataModelList.add(python);
        dataModelList.add(java);
        dataModelList.add(csharp);
        dataModelList.add(c);
        dataModelList.add(kotlin);
        dataModelList.add(swift);

    }

    public LiveData<List<DataModel>> getChats() {
        return liveData;
    }
}
