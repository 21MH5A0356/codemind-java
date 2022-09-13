import java.util.Scanner;
class Main
{
    public static int prod(int n)
    {
        int prod=1,r;
        while(n>0)
        {
            r=n%10;
            prod=prod*r;
            n=n/10;
        }
        return prod;
    }
    public static int sum(int n)
    {
        int sum=0,r;
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),d1,d2;
        d1=prod(n);
        d2=sum(n);
        if(d1==d2)
        
         System.out.println("Spy Number");
         else
           System.out.println("Not Spy Number");
    }
}
