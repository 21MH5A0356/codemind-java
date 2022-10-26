import java.util.Scanner;
class Main
{
    public static boolean fibonacci(int n)
    {
        int a=0,b=1,c,found=0;
        c=a+b;
        while(c<=n)
        {
            if(c==n)
            {
                found=1;
                break;
            }
            a=b;
            b=c;
            c=a+b;
        }
       if(found==1)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d1,d2; 
       n=sc.nextInt();
      for(int i=n+1;;i++)
      {
         if(fibonacci(i))
         {
             d1=i;
             break;
         }
      }
      for(int j=n-1;;j--)
      {
          if(fibonacci(j))
          {
            d2=j;
            break;
          }    
      }
      if((n-d2)==(d1-n))
      System.out.println(d2+" "+d1);
      else if((n-d2)>(d1-n))
      System.out.println(d1);
      else
      System.out.println(d2);
    }
}