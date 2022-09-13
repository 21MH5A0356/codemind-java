import java.util.Scanner;
class Main{
    public static int largestdigit(int n){
        int r,max=0;
        while(0<n){
            r=n%10;
            if(r>max)
             max=r;
             n=n/10;
        }
        return max;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,result;
        n=sc.nextInt();
        result=largestdigit(n);
        System.out.println(result);
    }
}