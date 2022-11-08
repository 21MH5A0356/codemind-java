import java.util.Scanner;
class Main
{  
     
    public static boolean isPronicNumber(int n){  
        boolean flag = false;  
          
        for(int i = 1; i <= n; i++){  
              
            if((i*(i+1)) == n){  
                flag = true;  
                break;  
            }  
        }  
        return flag;  
    }  
      
    public static void main(String[] args) {  
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isPronicNumber(n))
         System.out.println("YES");
        else
         System.out.println("NO");
    }
}    