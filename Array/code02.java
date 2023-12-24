// Write a Java program to sort a numeric array and a string array.
import java.util.*;
public class code02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        String str = new String("The quick brown fox jumps over the lazy dog");
        input(a);
        char ch[] = str.toLowerCase().toCharArray();
        Sort(a);
        Sort(ch);
        display(a);
        display(ch);
    }
    public static void input(int a[])
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<a.length;i++)
            // a[i] = sc.nextInt();
            a[i] = (10-i) *7;
    }
    public static void Sort(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    public static void Sort(char ch[])
    {
        for(int i=0;i<ch.length;i++)
        {
            for(int j=0;j<ch.length;j++)
            {
                if(ch[i]<ch[j])
                {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
    }
    public static void display(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void display(char a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

}
