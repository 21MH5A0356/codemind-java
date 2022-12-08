import java.util.Scanner;
class Main
{
    public static boolean prime(int n)
    {
       
        if(n==1)
        return false;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            return false;
            
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int d1,d2,i;
        while(t>0)
        {
          int n=sc.nextInt();
          {
              for(i=n;;i++)
              {
                  if(prime(i))
                  {
                      d1=i;
                      break;
                  }
                  
              }
              for(i=n;;i--)
              {
                  if(prime(i))
                   {
                       d2=i;
                       break;
                   }    
              }
          }
          if((d1-n)>(n-d2))
          System.out.println(d2);
          else if((d1-n)==(n-d2))
          System.out.println(d2);
          else
          System.out.println(d1);
          t--;
          
        }
    }
}
