import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0,prod=1,r;
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            prod=prod*r;
            n=n/10;
        }
        if(sum==prod)
        System.out.println("Spy Number");
        else
        System.out.println("Not Spy Number");
        
        
    }
}