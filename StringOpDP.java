import java.util.*;
public class StringOpDP {
    public static void main(String args[])
    {
        String a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String 1");
        a=sc.nextLine();
        System.out.println("Enter the String 2");
        b=sc.nextLine();
        int c=a.length();
        int d=b.length();
        
        int arr[][]=new int[c+1][d+1];
        if(c==0)
        {
            System.out.println("No of Operations "+d);
            return;
        }
        if(d==0)
        {
            System.out.println("No of Operations "+c);
            return;

        }
        for(int i=0;i<=c;i++)
        {
            arr[0][i]=i;
        }
        for(int j=0;j<=d;j++)
        {
            arr[j][0]=j;
        }
        int res=0;
        for(int i=1;i<=c;i++)
        {
            for(int j=1;j<=d;j++)
            {
                if(a.charAt(i-1)==b.charAt(j-1))
                {
                    arr[i][j]=arr[i-1][j-1];
                }
                else
                {
                    int min=Math.min(arr[i-1][j],arr[i-1][j-1]);
                    int sto=Math.min(arr[i][j-1],min);
                    arr[i][j]=sto+1;
                }
            }
        }
        System.out.println("No of Operations "+arr[c][d]);
    }
}
