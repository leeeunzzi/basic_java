package org.example05;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<>();
        library.add(new Book("자바1", "이은진1"));
        library.add(new Book("자바2", "이은진2"));
        library.add(new Book("자바3", "이은진3"));
        library.add(new Book("자바4", "이은진4"));
        library.add(new Book("자바5", "이은진5"));

        for (int i = 0; i < library.size(); i++) {
            library.get(i).showInfo();
        }
    }
}
