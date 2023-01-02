package org.example01;

public class Subway {

    String subColor;
    int passCount;
    int money;

    public Subway(String subColor) {
        this.subColor = subColor;
    }

    public void take(int money) {
        this.money += money;
        passCount++;
    }
    
    public void showSubInfo() {
        System.out.println(subColor + "색 지하철의 승객 수는 " + passCount + "명 이고, 수입은 " + money + "원 입니다.");
    }
}
