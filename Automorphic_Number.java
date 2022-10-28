import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),d,s,r;
        int temp=n;
        r=n*n;
        d=(int)Math.log10(n)+1;
      
        s=r%(int)Math.pow(10,d);
        if(s==temp)
        System.out.println("Automorphic Number");
        else
        System.out.println("Not an Automorphic Number");
    }
}