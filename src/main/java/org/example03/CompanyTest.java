package org.example03;

public class CompanyTest {
    public static void main(String[] args) {
        Company company1 = Company.getInstance();
        System.out.println("company1 = " + company1);
        Company company2 = Company.getInstance();
        System.out.println("company2 = " + company2);
    }
}
