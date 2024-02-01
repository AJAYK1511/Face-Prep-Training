import java.util.*;
class Main {
    static int prec(char c) {
        if (c == '^')
            return 3;
        else if (c == '/' || c == '*')
            return 2;
        else if (c == '+' || c == '-')
            return 1;
        else
            return -1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        Stack<Character> st=new Stack<>();
        String res="";
        for(int i=0;i<a.length();i++)
        {
           if(a.charAt(i)>='a' && a.charAt(i)<='z' ||a.charAt(i)>='0' && a.charAt(i)<='9')
           {
                 res+=a.charAt(i);
           }
           else if(a.charAt(i)=='(')
           {
                 st.push(a.charAt(i));
           }
           else if(a.charAt(i)==')')
           {
                while(st.peek()!='(')
                {
                    res+=st.peek();
                    st.pop();
                }
                st.pop();
           }
           else
           {
              while (!st.isEmpty() && (prec(a.charAt(i)) < prec(st.peek()) ||
                                             prec(a.charAt(i)) == prec(st.peek()) )){
                    res+=st.pop();
                }
                st.push(a.charAt(i));
           }
        }
        while(!st.isEmpty())
        {
            res+=st.peek();
            st.pop();
        }
        System.out.println(res);
        int val=0;
        Stack<Integer> str=new Stack<>();
        for(int i=0;i<res.length();i++)
        {
            if(res.charAt(i)>='0' && res.charAt(i)<='9')
            {
                str.push((int)res.charAt(i)-48);
            }
            else if(res.charAt(i)=='+')
            {
                int aa=str.pop();
                int b=str.pop();
                int c=aa+b;
                str.push(c);
                // System.out.println(c);  
            }
            else if(res.charAt(i)=='-')
            {
                int aa=str.pop();
                int b=str.pop();
                int c=b-aa;
                str.push(c);
                // System.out.println(c);  
            }
            else if(res.charAt(i)=='*')
            {
                int aa=str.pop();
                int b=str.pop();
                int c=aa*b;
                str.push(c);
                // System.out.println(c);  
            }
            else if(res.charAt(i)=='/')
            {
                int aa=str.pop();
                int b=str.pop();
                int c=b/aa;
                str.push(c);
                // System.out.println(c);  
            }
        }
        System.out.print(str.peek());
    }
}