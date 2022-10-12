import java.util.*;
class Main
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      int n,x[],sum=0,count=0,i;
      n=sc.nextInt();
      x=new int[n];
      for(i=0;i<n;i++)
       x[i]=sc.nextInt();
      
       for(i=0;i<n;i++)
       {
           sum=sum+x[i];
       }
       int avg=sum/n;
       for(i=0;i<n;i++)
       {
           if(avg>=x[i])
           {
               count++;
           }
       }
       System.out.println(count);
  }
    
}