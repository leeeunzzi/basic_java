package org.example01;

public class Taxi {
    String taxiCmp;
    int money;

    public Taxi(String taxiCmp) {
        this.taxiCmp = taxiCmp;
    }

    public void take(int money) {
        this.money += money;
    }

    public void showTaxiInfo() {
        System.out.println(taxiCmp + " 회사 택시의 수입은 " + money + "원 입니다.");
    }


}
