import java.util.Scanner;
class Palindrome
{
   public static boolean isPalindrome(int n)
   {
         int temp=n,r,sum=0;
		 while(n>0)
		 {
		     r=n%10;
			 sum=sum*10+r;
			 n=n/10;
		 }
        if(sum==temp)
           return true;
        else
           return false;

    }
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int n;
       n=sc.nextInt();
       n=Math.abs(n);
       if(isPalindrome(n))
           System.out.println(2);
       else
           System.out.println(1);
       sc.close();

   }
}