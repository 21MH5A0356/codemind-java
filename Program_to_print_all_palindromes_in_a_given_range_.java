import java.util.*;
class Main
{
    public static boolean palin(int n)
    {
        int temp=n,r,sum=0;
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
      int a,b,i;
      a=sc.nextInt();
      b=sc.nextInt();
      for(i=a;i<=b;i++){
          if(palin(i))
          System.out.print(i+" ");
      }
    }
}