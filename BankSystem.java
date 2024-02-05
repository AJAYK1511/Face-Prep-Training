import java.util.*;
class account
{
    // int h=4;
    int bal;
    account()
    {
        bal=0;
    }
    public int update(int f)
    {
        bal=bal+f;
        return bal;
    }
    public void choose()
    {
        System.out.println(3);   
    }
    public void print()
    {
        System.out.println(4);
    }
}
public class BankSystem {
   
    public static void main(String args[])
    {
        System.out.println("Welcome to Ajay's E-Bank Services");
        Scanner sc=new Scanner(System.in);
        account a=new account();
        while(true)
        {
            System.out.println("Account Sector -> 1");
            System.out.println("Transaction Panel -> 2");
            System.out.println("Exit -> 0");
            int n=sc.nextInt();
            switch(n)
            {
                case 1:
                System.out.println("Deposit -> 1");
                System.out.println("Withdrawal -> 2");
                System.out.println("Check Balance -> 3");
                System.out.println("Go Back -> 0");
                int g=sc.nextInt();
                if(g==1)
                {
                    System.out.println("Enter amount: ");
                    int f=sc.nextInt();
                    int res=a.update(f);
                    System.out.println("Amount deposited\nCurrrent Balance "+res);
                    // a.choose();
                }
                else if(g==2)
                {
                    
                }
                a.print();
                break;
                // case 2:
                // transaction();
                // break;
                case 0:
                break;
            }
            if(n>2)
            break;
        }
    }
}
