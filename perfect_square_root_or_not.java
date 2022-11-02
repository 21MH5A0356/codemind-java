import java.util.*;
class Main
{
   public static boolean perfectsquare(int n)
   {
       for(int i=1;i*i<=n;i++)
       {
           if(n%i==0 && n/i==i)
           return true;
       }
       return false;
   }
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(perfectsquare(n))
         System.out.println("True");
         else
         System.out.println("False");
    }
}