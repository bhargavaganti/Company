package com.company;

import java.util.ArrayList;

public class Worker {
    private String name;
    private ArrayList<Work> listHours = new ArrayList<>();
    public static ArrayList<String> listWorkers = new ArrayList<>();

    public ArrayList<Work> getListHours() {
        return listHours;
    }

    public Worker(String name) {
        this.name = name;
        listWorkers.add(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                '}';
    }

    void listWorkHours(Work work) {
        listHours.add(work);
    }
}

