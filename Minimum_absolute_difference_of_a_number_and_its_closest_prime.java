import java.util.Scanner;
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
        int n,i,d1,d2;
        n=sc.nextInt();
        for(i=n;;i--){
            if(prime(i)){
            d1=i;
            break;
          }         
        }
        for(i=n;;i++){
            if(prime(i)){
            d2=i;
            break;
          }    
        }
        if((n-d1)<=(d2-n))
          System.out.println(n-d1);
        else
          System.out.println(d2-n);
    }
}