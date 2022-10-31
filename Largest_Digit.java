import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,found=0,max=0;
        
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            if(max<r){
                max=r;
            }
            n=n/10;
                
            
        }
       
         System.out.println(max);
    }
}