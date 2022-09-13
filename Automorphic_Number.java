import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,r,d,s;
        n=sc.nextInt();
        r=n*n;
        d=(int)Math.log10(n)+1;
        s=r%(int)Math.pow(10,d);
        if(n==s)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not an Automorphic Number");
        
    }
}