// Write a Java program to find the maximum product of two integers in a given array of integers.

import java.util.Scanner;

public class code41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int l = sc.nextInt();
        int a[] = new int [l];
        System.out.print("Enter the elements of array = ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("The maximum product of two number is using Brute Force = " + Brute_Force_Method(a));
        System.out.println("The maximum product of two number is using Optimal Method = " + Optimal_Method(a));
    }
    public static int Brute_Force_Method(int a[])
    {
        int maximum =0;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if((a[i]*a[j])>maximum)
                maximum = (a[i]*a[j]);
            }
        }
        return maximum;
    }
    public static int Optimal_Method(int a[])
    {
        int largest = 0;
        int slargest = -1;

        for (int i = 0; i < a.length; i++) {
            if(a[i]>largest && slargest!=largest)
            {
                slargest = largest;
                largest = a[i];
            }
        }
        return largest*slargest;
    } 
}
