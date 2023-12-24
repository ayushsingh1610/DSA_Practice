// Write a Java program to find duplicate values in an array of string values.
import java.util.*;
public class code11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string = ");
        String str = sc.nextLine();
        char ans[] = Duplicate(str.toCharArray());
        
        for (char c : ans) {
            if(c != ' ')
            System.out.print(c + " ");
        }
    }
    public static char[] Duplicate(char ch[])
    {
        char ans[] = new char[ch.length];
        int count=0,k=0;
        for (int i = 0; i < ch.length; i++) {
            for (int j = i+1; j < ch.length; j++) {
                if(ch[i] == ch[j])
                {
                    count++;
                }
            }
            if(count >=1 && isNOTPresent(ans,ch[i]))
            {
                ans[k++] = ch[i];
                count =0;
            }
        }
        return ans;
    }
    public static boolean isNOTPresent(char ans[] , char c)
    {
        for (int i = 0; i < ans.length; i++) {
            if(c == ans[i])
            return false;
        }
        return true;
    }
}
