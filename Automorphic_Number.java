import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n,r,d,s;
         d=(int)Math.log10(n)+1;
         r=n*n;
         s=r%(int)Math.pow(10,d);
         if(s==temp)
         System.out.println("Automorphic Number");
         else
         System.out.println("Not an Automorphic Number");
    }
}