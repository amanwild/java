import java.util.Scanner;
public class add_programing{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first no = ");
        int a=sc.nextInt();

        System.out.println("enter second no = ");
        int b=sc.nextInt();

        System.out.println("enter third no = ");
        int c=sc.nextInt();

        int d= a+b+c;
        System.out.println("addition of three no. is =  "+d);
    }
}