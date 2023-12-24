// Write a Java program to add two matrices of the same size.
import java.util.*;
public class code15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Matrix 1 : Enter the number of rows = ");
        int r1 = sc.nextInt();
        System.out.print("Matrix 1 : Enter the number of column = ");
        int c1 = sc.nextInt();
        System.out.print("Matrix 2 : Enter the number of rows = ");
        int r2 = sc.nextInt();
        System.out.print("Matrix 2 : Enter the number of column = ");
        int c2 = sc.nextInt();
        int m1[][] = new int[r1][c1];
        int m2[][] = new int[r2][c2];
        int m3[][] = new int[r1][c2];

        if(r1==r2 && c1==c2){
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m1[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                m2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m3[i][j] = m1[i][j] + m2[i][j];
            }
        }
        }
        else
        System.out.println("Addition can't be performed");

        for (int i = 0; i < m3.length; i++) {
            for (int j = 0; j < m3[i].length; j++) {
                System.out.print(m3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
