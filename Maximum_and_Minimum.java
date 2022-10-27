import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,j,found=0,count=0,min=9999,max=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
         x[i]=sc.nextInt();
         for(i=0;i<n-1;i++)
         {
             if(x[i]<x[i+1])
             min=x[i];
             else
             max=x[i+1];
         }
         for(i=0;i<n;i++)
         {
              count=1;
                 if(x[i]!=-99)
             for(j=0;j<n;j++)
             {
                
                 {
                 if(x[i]==x[j] && i!=j)
                 {
                     count++;
                     x[j]=-99;
                     
                 }
                 }
             }
             if(x[i]==count)
             {
                 if(x[i]>max)
                  max=x[i];
                  found=1;
             }
             if(x[i]==count)
             {
                 if(x[i]<min)
                 min=x[i];
                 found=1;
             }
         }
         if(found==1)
          System.out.print(min+" "+max);
          else
          System.out.print("-1");
    }
}