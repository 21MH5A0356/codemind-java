import java.util.Scanner;
class Main
{
    public static boolean Isprime(int n)
    {
        int count=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            count++;
            
        }
        if(count==0)
         return true;
         else
         return false;
    }
    public static boolean palindrome(int n)
    {
        int temp=n,sum=0,r;
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
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        for(int i=n+1;;i++)
        {
            if(Isprime(i) && palindrome(i))
            {
             System.out.println(i);
              break;
            }  
        }
    }
}