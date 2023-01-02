package org.example01;

public class TakeTrans {

    public static void main(String[] args) {
        Student studentJ = new Student("James", 5000);
        Student studentT = new Student("Tomas", 10000);
        Student studentE = new Student("Edward", 20000);

        Bus bus100 = new Bus(100);
        Bus bus500 = new Bus(500);
        Subway subGreen = new Subway("초록");
        Subway subRed = new Subway("빨강");
        Taxi taxi = new Taxi("잘나간다 운수");

        studentJ.takeBus(bus100);
        studentT.takeSubway(subGreen);
        studentE.takeTaxi(taxi);

        studentJ.showInfo();
        studentT.showInfo();
        studentE.showInfo();

        bus100.showBusInfo();
        bus500.showBusInfo();
        subGreen.showSubInfo();
        subRed.showSubInfo();
        taxi.showTaxiInfo();

    }
}
