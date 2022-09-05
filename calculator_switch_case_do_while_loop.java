
import java.util.*;
// import java.io.*;

// import java.io.Reader;

public class calculator_switch_case_do_while_loop {
    public static void main(String[] args) {
        System.out.println("welcom");

        Scanner scan = new Scanner(System.in);
        System.out.print("enter your age no : ");
        int age = scan.nextInt();
        System.out.println("Ypur age is :"+age);

        if (age > 25) {
            System.out.println("you are adult");
        } else if (age < 13) {
            System.out.println("you are  a teenager");
        }else if (age < 25) {
            System.out.println("you are  a mature");
        } else {
            System.out.println("you are  a kid");

        }

        Scanner scan1 = new Scanner(System.in);
        System.out.print("enter first no :");
        int a = scan1.nextInt();

        Scanner scan2 = new Scanner(System.in);
        System.out.print("enter second  no :");
        int b = scan2.nextInt();

        System.out.println(a + b);
        System.out.println(" two no.s are : " + a + "," + b);

        Scanner scancase = new Scanner(System.in);
        System.out.println("press 1 for addition");
        System.out.println("press 2 for subtraction");
        System.out.println("press 3 for multiplication");
        System.out.println("press 4 for division");
        System.out.println("press 5 for exit");
        int input = scancase.nextInt();
    
        switch (input) {
            case 1:
                System.out.println("your choice is '" + input + "'no.");
                System.out.println(a + b);
                break;

            case 2:
                System.out.println("your choice is '" + input + "'no.");
                System.out.println(a - b);
                break;

            case 3:
                System.out.println("your choice is '" + input + "'no.");
                System.out.println(a * b);
                break;

            case 4:
                System.out.println("your choice is '" + input + "'no.");
                System.out.println(a / b);
                break;

            case 5:
                break;

            default:
                System.out.println("invalid input");                  
            
        }   
        scan.close();
        scan1.close();
        scan2.close();
        scancase.close();

        int c = 0;
        do {
            System.out.println(c);
            ++c;
        } while (c < 3);

       

    }
}