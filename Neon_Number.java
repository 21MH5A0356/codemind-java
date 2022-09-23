import java.util.Scanner;
class Main{
    public static boolean neon(int n){
        int temp=n,sum=0;
        n=n*n;
        while(n>0){
            sum=sum+n%10;
            n=n/10;
        }
        if(temp==sum)
         return true;
          else
          return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(neon(n))
          System.out.println("Neon Number");
        else
          System.out.println("Not Neon Number");
    }
}