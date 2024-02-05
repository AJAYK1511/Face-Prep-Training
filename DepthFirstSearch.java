import java.util.*;
public class DepthFirstSearch {
    public static void main(String args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Vertices : ");
        a=sc.nextInt();
        System.out.println("Enter the number of Edges : ");
        b=sc.nextInt();
        int arr[][]=new int[a][a];
        for(int i=0;i<b;i++)
        {
            System.out.println("Enter the pair of nodes: ");
            int q=sc.nextInt();
            int w=sc.nextInt();
            arr[q][w]=1;
            arr[w][q]=1;
        }
        Queue<Integer> q=new LinkedList<>();
        List<Integer> l=new ArrayList<>();
        q.offer(0);
        l.add(0);
        while(!q.isEmpty())
        {
             int g=q.poll();
             System.out.print(g+" ");
             for(int i=0;i<a;i++)
             {

                 if(arr[g][i]==1 && !l.contains(i))
                 {
                     q.offer(i);
                     l.add(i);
                    }
                }
            }

    }
}
