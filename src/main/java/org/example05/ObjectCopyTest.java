package org.example05;

public class ObjectCopyTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("태백산맥1", "이은진");
        library[1] = new Book("태백산맥2", "이은진");
        library[2] = new Book("태백산맥3", "이은진");
        library[3] = new Book("태백산맥4", "이은진");
        library[4] = new Book("태백산맥5", "이은진");

        System.arraycopy(library, 0, copyLibrary, 0, 5);

        System.out.println("=== library start ===");
        for (Book book : library) {
            System.out.println(book);
            book.showInfo();
        }
        System.out.println("=== library end ===");

        System.out.println("=== copyLibrary start ===");
        for (Book book : copyLibrary) {
            System.out.println(book);
            book.showInfo();
        }
        System.out.println("=== copyLibrary end ===");

///////////////////////////////////////////////////////////////////////////

        library[0].setTitle("백두산");
        library[0].setAuthor("김은진");

        System.out.println("=== library start2 ===");
        for (Book book : library) {
            System.out.println(book);
            book.showInfo();
        }
        System.out.println("=== library end2 ===");


        System.out.println("=== copyLibrary start2 ===");
        for (Book book : copyLibrary) {
            System.out.println(book);
            book.showInfo();
        }
        System.out.println("=== copyLibrary end2 ===");

        // 만약 복사 배열이 값이 같아지는 것을 막고싶다면
        // copyLibrary 배열도 new book()으로 새로 객체 생성 해줘야함
    }
}
