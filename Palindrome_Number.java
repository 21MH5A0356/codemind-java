import java.util.*;
class Main
{
    public static boolean palin(int n)
    {
        int temp=n,sum=0,r;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
            
        }
        if(temp==sum)
         return true;
         else
          return false;
          
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,n;
        t=sc.nextInt();
        while(t>0)
        {
            n=sc.nextInt();
            if(palin(n))
            System.out.println("True");
            else
            System.out.println("False");
        }
    }
}