import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,x[],i,m,found=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
         x[i]=sc.nextInt();
         m=sc.nextInt();
         for(i=0;i<n;i++){
             if(m==x[i])
             found=1;
            
      }
        if(found==1)
         System.out.println("True");
         else
          System.out.println("False");
    }
}