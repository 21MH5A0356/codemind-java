import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,sum=0,add=0,i;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=1;i<=a/2;i++)
        {
            if(a%i==0)
            sum=sum+i;
        }
        for(i=1;i<=b/2;i++)
        {
           if(b%i==0)
           add=add+i;
        }
        if(sum==b && add==a)
         System.out.println("Amicable");
        else
         System.out.println("Not Amicable");
    }
    
}