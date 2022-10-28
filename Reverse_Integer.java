import java.util.*;
class Main
{
    public static int rev(int n)
    {
        int r=0;
        while(n!=0)
        {
            r=r*10+n%10;
            n=n/10;
        }
        return r;
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int max=rev(n);
       
        System.out.println(max);
    }
}
