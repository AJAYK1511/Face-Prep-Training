import java.util.*;
public class QueueByStack {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        Stack<Integer> stt=new Stack<>();
        while(true)
        {
            int n=sc.nextInt();
            if(n>0)
            {
                st.push(n);
            }
            else
            {
                break;
            }
        }
        while(true)
        {
            System.out.println("Enque -> 1");
            System.out.println("Deque -> 2");
            int g=sc.nextInt();
            if(g==1)
            {
                while(true)
                {
            int f=sc.nextInt();
            if(f>0)
            {
                st.push(f);
            }
            else
            {
                break;
            }
                }
            }
            else if(g==2)
            {
                if(stt.isEmpty() && st.isEmpty())
                {
                    System.out.println("Cannot Dequeue as No elements present in Queue");
                    return;
                }
                if(stt.isEmpty())
                {
                    while(!st.isEmpty())
                    {
                        stt.push(st.pop());
                    }
                    System.out.println("Dequeued element "+stt.pop());
                }
                else
                {
                    System.out.println("Dequeued element "+stt.pop());
                }
            }
            else
            {
                break;
            }
            //comment
        }
    }
}
