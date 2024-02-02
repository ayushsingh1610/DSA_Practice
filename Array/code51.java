// Write a Java program to replace each element of the array with the product of every other element in a given array of integers.
import java.util.*;
public class code51 {
    public static void main(String[] args) {
        // int a[] = {1,2,3,4,5};
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the length of arraylist = ");
            int l = sc.nextInt();
            int a[] = new int[l];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
        // replace(a);
        replaceWithProduct(a);
        Display(a);
    }
    public static void replace(int a[])
        {
            ArrayList <Integer> ob = new ArrayList<>();
            for (int i = 0; i < a.length; i++) {
                ob.add(a[i]);
            }

        // Calculating the product of all elements
        int product =1;
        for (int i = 0; i < a.length; i++) {
            if(ob.get(i)!=0)
            product *= ob.get(i);
        }

        // Replace the value with its other elements product value
        for(int i =0; i<a.length;i++)
        {
            ob.set(i,product/(ob.get(i)));
        }

        // Display the Arraylist
        for (Integer integer : ob) {
            System.out.print(integer + " ");
        }
    }
    public static void replaceWithProduct(int[] arr) {
        int n = arr.length;

        // Create two arrays to store products of elements to the left and right of each element
        int[] leftProducts = new int[n];
        int[] rightProducts = new int[n];

        // Calculate the products to the left of each element
        leftProducts[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProducts[i] = leftProducts[i - 1] * arr[i - 1];
        }

        // Calculate the products to the right of each element
        rightProducts[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * arr[i + 1];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = leftProducts[i] * rightProducts[i];
        }
    }
    public static void Display(int a[])
    {
        for (int integer : a) {
            System.out.print(integer + " ");
        }
    }
}

