import java.util.*;
public class NaiveAlgorithm {
    public static void main(String args[])
    {
        String a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        a=sc.nextLine();
        System.out.println("Enter the pattern");
        b=sc.nextLine();
        int i=0,j=0;
        while(i<a.length() && j<b.length())
        {
             if(a.charAt(i)==b.charAt(j))
             {
                i++;
                j++;
             }
             else
             {
                int s=i-j+1;
                i=s;
                j=0;
             }
        }
        if(j==b.length())
        {
            System.out.println("String found at Index : "+(i-j));
        }
        else
        {
            System.out.println("Pattern Not Found");
        }
    }
}
