import java.util.*;
public class LongestIncSubsequence {
   public static void main(String args[])
   {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        int li[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            li[i]=1;
        }
        int res=1;
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[i]>arr[j] && li[i]<li[j]+1)
                {
                    li[i]=li[j]+1;
                }
            }
            if(li[i]>res)
            res=li[i];
        }
        System.out.println(res);
   } 
}
