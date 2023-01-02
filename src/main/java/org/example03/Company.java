package org.example03;

public class Company {

    // 유일한 객체
    private static Company instance = new Company();

    // 외부에서 생성자 못만들게 private로 default 생성자 만들어버림
    private Company() {
    }

    // static 붙이는 이유 :  안붙이면 외부 클래스에서 객체 생성 후 사용해야 하기 때문에
    // 별도의 생성이 불가능하니 static으로 선언해줌
    // 외부에서 instance 접근해야 할때 활용할 메서드
    public static Company getInstance() {
        if (instance == null) instance = new Company();
        return instance;
    }


}
