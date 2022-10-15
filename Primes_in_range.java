import java.util.*;
class Main{
    public static boolean prime(int n){
        int count=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0)
            count++;
        }
        if(count==0)
         return true;
        else
         return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b,count=0,i;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a==1)
        a=2;
        for(i=a;i<=b;i++){
            if(prime(i))
            count++;
        }
        System.out.println(count);
    }
}