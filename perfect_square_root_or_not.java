import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double d=Math.sqrt(n);
        if(d-(int)d==0)
            System.out.println("True");
        else
            System.out.println("False");
    }
}