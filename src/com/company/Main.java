package com.company;

public class Main {

    public static void main(String[] args) {
        Manager manager1 = new Manager("Manager1");
        Manager manager2 = new Manager("Manager2");
        Manager manager3 = new Manager("Manager3");

        Worker worker = new Worker("1");
        Worker worker1 = new Worker("2");
        Worker worker2 = new Worker("3");
        Worker worker3 = new Worker("4");
        Worker worker4 = new Worker("5");
        Worker worker5 = new Worker("6");
        Worker worker6 = new Worker("7");

        manager1.listWorker(worker);
        manager1.listWorker(worker1);
        manager2.listWorker(worker2);
        manager3.listWorker(worker3);
        manager3.listWorker(worker4);
        manager3.listWorker(worker5);
        manager3.listWorker(worker6);

        Work day1 = new Work(5, "stanie", "monday");
        Work day2 = new Work(2, "siedzenie", "saturday");
        Work day3 = new Work(5, "patrzenie", "sunday");
        worker.listWorkHours(day1);
        worker.listWorkHours(day2);
        worker.listWorkHours(day1);
        worker1.listWorkHours(day2);
        worker1.listWorkHours(day3);

        System.out.println(manager3.getListWorkers());
        for (String workers : Worker.listWorkers) {
            System.out.println(workers);
        }

        System.out.println(worker.getListHours());
    }
}
