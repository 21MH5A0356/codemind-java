import java.util.Scanner;
class Main{
    public static boolean ispalindrome(int n){
        int sum=0,r,temp=n;
        while(n>0){
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(sum==temp)
          return true;
         else
          return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x[],n,i,count=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++){
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            if(ispalindrome(x[i]))
            count++;
        }
        System.out.println(count);
    }
}