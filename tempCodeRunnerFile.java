import java.util.Scanner;
public class delete{
    public static void main(String args[]){
        System.out.println("Enter the your marks of 3 subjects :");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int total = (a+b+c)/3;
        if (('100'>=a>='33') ){
            System.out.println("You are pass !!!");            
        }
        
    }
}