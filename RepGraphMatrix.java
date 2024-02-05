import java.util.*;
public class RepGraphMatrix {
    public static void main(String args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Vertices : ");
        a=sc.nextInt();
        System.out.println("Enter the number of Edges : ");
        b=sc.nextInt();
        int arr[][]=new int[a+1][a+1];
    
        for(int i=0;i<b;i++)
        {
            System.out.println("Enter the pair of vertices");
            int q=sc.nextInt();
            int w=sc.nextInt();
            arr[q-1][w-1]=1;
            arr[w-1][q-1]=1;
        }
        System.out.println("Matrix representation follows : ");
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
