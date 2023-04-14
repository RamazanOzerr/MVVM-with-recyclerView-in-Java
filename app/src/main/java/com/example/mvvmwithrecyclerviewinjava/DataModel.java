package com.example.mvvmwithrecyclerviewinjava;

public class DataModel {

    private final String name;
    private final int logo;

    public DataModel(String name, int logo) {
        this.name = name;
        this.logo = logo;
    }

    public String getName() {
        return name;
    }


    public int getLogo() {
        return logo;
    }

}
