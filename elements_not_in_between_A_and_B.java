import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x[],n,count=0,a,b,i;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
         x[i]=sc.nextInt();
         a=sc.nextInt();
         b=sc.nextInt();
         for(i=0;i<n;i++){
             if(x[i]<a || x[i]>b){
                 
                 System.out.print(x[i]+" ");
                 count++;
             }
             
         }
         if(count==0)
         System.out.println("-1");
        
        
    }
}