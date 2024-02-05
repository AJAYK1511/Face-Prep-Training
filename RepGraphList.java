import java.util.*;
public class RepGraphList {
    public static void main(String args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Vertices : ");
        a=sc.nextInt();
        System.out.println("Enter the number of Edges : ");
        b=sc.nextInt();
        List<List<Integer>> l=new ArrayList<List<Integer>>();
        for(int i=0;i<a;i++)
        {
            l.add(new ArrayList<>());
        }
        for(int i=0;i<b;i++)
        {
            System.out.println("Enter the pair of vertices");
            int q=sc.nextInt();
            int w=sc.nextInt();
            l.get(q).add(w);
            l.get(w).add(q);
            // System.out.println(l.get(i));
        }
        for (int i = 0; i < l.size(); ++i) {
            System.out.print(i + "->");
            for (int v : l.get(i)) {
               System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}
