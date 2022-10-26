import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,j,count=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
         x[i]=sc.nextInt();
         for(i=0;i<n;i++)
         {
             count=1;
             if(x[i]!=-99)
             {
                 for(j=0;j<n;j++)
                 {
                     if(x[i]==x[j] && i!=j)
                     {
                       x[j]=-99;
                       count++;
                     }  
                     
                 }
                 System.out.print(x[i]+" "+count+" ");
             }
             
         }
         
    }
}