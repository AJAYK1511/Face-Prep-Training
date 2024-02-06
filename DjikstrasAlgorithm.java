import java.util.*;
public class DjikstrasAlgorithm {
    public static int minimum(int dist[],boolean se[],int v)
    {
        int min=Integer.MAX_VALUE,midx=-1;
        for(int i=0;i<v;i++)
        {
            if(se[i]==false && dist[i]<=min)
            {
                min=dist[i];
                midx=i;
            }
        }
        return midx;
    }
    public static void find(int arr[][],int v)
    {
        int dist[]=new int[v];
        boolean se[]=new boolean[v];
        for(int i=1;i<v;i++)
        {
            dist[i]=Integer.MAX_VALUE;
            se[i]=false;
        }
        for(int i=0;i<v-1;i++)
        {
            int res=minimum(dist,se,v);
            se[res]=true;
            for (int j=0;j<v;j++)
            {
                if (!se[j] && arr[i][j] != 0 && dist[i] != Integer.MAX_VALUE && dist[i] + arr[i][j] < dist[j])
                dist[j] = dist[i] + arr[i][j];
            }
        }
        for(int i=0;i<v;i++)
        {
            System.out.println(i+" -> "+dist[i]);
        }
    }
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
            System.out.println("Enter the pair of vertices and the weight");
            int q=sc.nextInt();
            int w=sc.nextInt();
            int we=sc.nextInt();
            arr[q][w]=we;
            arr[w][q]=we;
        }
        find(arr,a);
    }
}
