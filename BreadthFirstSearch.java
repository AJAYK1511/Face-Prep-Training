import java.util.*;

public class BreadthFirstSearch {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int e=sc.nextInt();
        int mat[][]=new int[v][v];
        for(int i=0;i<e;i++)
        {
            mat[sc.nextInt()][sc.nextInt()]=1;
        }
        Queue<Integer> q=new LinkedList<>();
        ArrayList<Integer> vis=new ArrayList<>();
        q.offer(0);
        vis.add(0);
        while(!q.isEmpty())
        {
            int a=q.poll();
            System.out.print(a+" ");
            for(int i=0;i<v;i++)
            {
                if(mat[a][i]==1 && !vis.contains(i))
                {
                    q.offer(i);
                    vis.add(i);
                }
            }
        }
    }
}