import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r;
        double area;
        r=sc.nextInt();
        area=3.14*r*r;
        System.out.format("%.2f",area);
    }
}