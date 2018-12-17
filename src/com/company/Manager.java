package com.company;

import java.util.ArrayList;

public class Manager {
    private String nameManager;
    private int sumEmployers;
    private ArrayList<Worker> listWorkers = new ArrayList<>();

    public ArrayList<Worker> getListWorkers() {
        return listWorkers;
    }

    public Manager(String nameManager) {
        this.nameManager = nameManager;
    }

    public String getNameManager() {
        return nameManager;
    }

    public void setNameManager(String nameManager) {
        this.nameManager = nameManager;
    }

    public int getSumEmployers() {
        return sumEmployers;
    }

    public void setSumEmployers(int sumEmployers) {
        this.sumEmployers = sumEmployers;
    }

    public void listWorker(Worker worker) {
        if (getSumEmployers() < 3) {
            ++sumEmployers;
            listWorkers.add(worker);
        } else {
            System.out.println("Za dużo pracowników dla " + getNameManager());
        }
        return;
    }
}
