import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=0,b=1,c,n,found=0;
        n=sc.nextInt();
        c=a+b;
        while(c<=n){
            if(c==n){
                found=1;
                break;
            }
             a=b;
             b=c;
             c=a+b;
            
        }
        if(found==1)
         System.out.println("True");
        else
         System.out.println("False");
        
    }
}