import java.util.*;
class Main
{
    public static int palin(int n)
    {
        Scanner sc=new Scanner(System.in);
        int rev=0,r;
        int temp=n;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        return rev;
    }
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,z;
        x=sc.nextInt();
        x=Math.abs(x);
        while(x>0)
        {
             z=x+(palin(x));
             if(z==palin(z))
            {
              System.out.println(z);
              break;
        
            }         
            x=z;
        }  
        
    }    
    
}