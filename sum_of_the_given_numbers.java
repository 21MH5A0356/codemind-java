import java.util.*;
class Main
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
    int n,a,b,sum=0;
    n=sc.nextInt();
    while(n>0)
    {
        a=sc.nextInt();
        b=sc.nextInt();
        sum=a+b;
        n--;
        System.out.println(sum);
    }
   
  }
}