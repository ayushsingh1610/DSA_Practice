// Write a Java program to replace each element of the array with the product of every other element in a given array of integers.
import java.util.*;
public class code51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of arraylist = ");
        int l = sc.nextInt();

        ArrayList <Integer> ob = new ArrayList<>();

        for (int i = 0; i < l; i++) {
            ob.add(sc.nextInt());
        }

        // Calculating the product of all elements
        int product =1;
        for (int i = 0; i < l; i++) {
            if(ob.get(i)!=0)
            product *= ob.get(i);
        }

        // Replace the value with its other elements product value
        for(int i =0; i<l;i++)
        {
            ob.set(i,product/(ob.get(i)));
        }

        // Display the Arraylist
        for (Integer integer : ob) {
            System.out.print(integer + " ");
        }

    }
}
