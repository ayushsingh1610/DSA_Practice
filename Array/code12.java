// Write a Java program to find common elements between two arrays (string values).
import java.util.*;
public class code12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string 1 = ");
        String str1 = sc.nextLine();
        System.out.print("Enter the string 2 = ");
        String str2 = sc.nextLine();

        for (int i = 0; i < str1.length(); i++) {
            if(isPresent(str2.toCharArray(),str1.charAt(i)))
            System.out.print(str1.charAt(i)+ " ");
        }
    }
    public static boolean isPresent(char ans[], char ch)
    {
        for (int i = 0; i < ans.length; i++) {
            if(ch==ans[i])
            return true;
        }
        return false;
    }
}
