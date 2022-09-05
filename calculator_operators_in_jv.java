import java.util.*;

public class calculator_operators_in_jv{
public static void main(String[] args) {
    Scanner scan1 = new Scanner(System.in);
    System.out.print("enter first no :");
    int a = scan1.nextInt();

    Scanner scan2 = new Scanner(System.in);
    System.out.print("enter second  no :");
    int b = scan2.nextInt();

    System.out.println(a + b);
    System.out.println(" two no.s are : " + a + "," + b);
//__________________ +, -, *, / are binary operators and __________________________

//__________________ += ,-= ,*=, /= are unary operators __________________________
    Scanner scancase = new Scanner(System.in);
    System.out.println("press 1 for binary Operator addition");
    System.out.println("press 2 for binary Operator subtraction");
    System.out.println("press 3 for binary Operator multiplication");
    System.out.println("press 4 for binary Operator division");
    System.out.println("press 5 for binary Operator exit");
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
    scancase.close();

    scan1.close();
    scan2.close();


}
}