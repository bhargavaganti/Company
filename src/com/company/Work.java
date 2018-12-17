package com.company;

public class Work {

    private int workHours;
    private String description;
    private String dayWork;

    public Work(int workHours, String description, String dayWork) {
        this.workHours = workHours;
        this.description = description;
        this.dayWork = dayWork;
    }

    public Work(int workHours, String description) {
        this.workHours = workHours;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Work{" +
                "workHours=" + workHours +
                ", description='" + description + '\'' +
                ", dayWork=" + dayWork +
                '}';
    }
}
