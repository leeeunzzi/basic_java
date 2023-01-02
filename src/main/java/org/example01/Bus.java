package org.example01;

public class Bus {
    int busNumber;
    int passCount;
    int money;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void take(int money) {
        this.money += money;
        passCount++;
    }

    public void showBusInfo() {
        System.out.println(busNumber + "번 버스의 승객 수는 " + passCount + "명 이고, 수입은 " + money + "원 입니다.");
    }
}
