import java.util.*;
public class CoinChangeDP {
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of coins ");
        n=sc.nextInt();
        int carr[]=new int[n];
        System.out.println("Enter the coin Values ");
        for(int i=0;i<n;i++)
        {
            carr[i]=sc.nextInt();
        }
        Arrays.sort(carr);
        int rup=sc.nextInt();
        // int narr1[]=new int[rup+1];
        int narr2[]=new int[rup+1];
        for(int i=1;i<=rup;i++)
        {
            // narr1[i]=i;
            narr2[i]=Integer.MAX_VALUE;
        }
        for(int i=0;i<n;i++)
        {
            int val=carr[i];
            for(int j=val;j<=rup;j++)
            {
                int f=j-val;
                if(narr2[f]!=Integer.MAX_VALUE && narr2[j]>(narr2[f]+1))
                {
                    narr2[j]=narr2[f]+1;
                }
            }
        }
        if(narr2[rup]!=Integer.MAX_VALUE)
        System.out.println("The minimum no of coins change is "+narr2[rup]);
        else
        System.out.println("No Combinatios Possible");
    }
}
