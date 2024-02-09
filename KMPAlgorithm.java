import java.util.*;
public class KMPAlgorithm {
    public static void main(String args[])
    {
        String a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        a=sc.nextLine();
        System.out.println("Enter the pattern");
        b=sc.nextLine();
        int arr[]=new int[b.length()];
        int i=0,j=1;
        // System.out.println(arr[0]+" ");
        while(j<b.length())
        {
             if(b.charAt(i)==b.charAt(j))
             {
                arr[j]=i+1;
                i++;
                j++;
             }
             else
             {
                if(i==0)
                {
                    arr[j]=0;
                    j++;
                }
                else
                {
                    i=arr[i-1];
                }
             }
            //  arr[m]=max;
        }
        System.out.println("LSP array is ");
        for(int m=0;m<b.length();m++)
        System.out.print(arr[m]+" ");
        System.out.println();
        i=0;
        j=0;
        while(i<a.length() && j<b.length())
        {
            if(a.charAt(i)==b.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                if(j==0)
                {
                    i++;
                }
                else
                {
                    j=arr[j-1];
                }
            }
        }
        if(j==b.length())
        {
           System.out.println("Match Found at Index "+(i-j));
        }
        else
        {
            System.out.println("No  match Found");
        }
    }
}
