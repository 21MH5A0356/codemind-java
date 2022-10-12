import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b,gcd=0,min;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a<b)
         min=a;
         else
          min=b;
          for(int i=min;i>0;i--){
              if(a%i==0 && b%i==0){
                  gcd=i;
                  break;
              }
          }
          System.out.println(gcd);
    }
}