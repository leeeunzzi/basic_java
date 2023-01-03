package org.example05;

public class TwoDimensionTest {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3,}, {4, 5, 6, 7}};   // [행][열]
        for (int i = 0; i < arr.length; i++) {      // 행
            for (int j = 0; j < arr[i].length; j++) {   // 열
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println("arr[i].length >>>>>>>>> " + arr[i].length);
        }
    }
}
