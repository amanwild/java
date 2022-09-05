import java.util.Scanner; 
public class delete{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the two no. for addition :");
        // int num2 = sc.nextInt();
        // int num1 = sc.nextInt();
        // int sum = num1 + num2;
        // System.out.println("Addition of "+ num1 +" and "+ num2 +" is  :"+ sum);

        // System.out.println("Enter the your name only :");
        // String name_only = sc.next();
        // System.out.println("Your name is :"+name_only);

        System.out.println("Enter the your name  :");
        String sahu = sc.nextLine();

        int lensahu = sahu.length();
        System.out.println("Your name length is :"+lensahu);

        String upsahu = sahu.toUpperCase();
        System.out.println("Your upper case name is :"+upsahu);
         
        String lwrsahu = sahu.toLowerCase();
        System.out.println("Your lower case name is :"+lwrsahu);

        String trimsahu = sahu.trim();
        System.out.println("Your trim name is :"+trimsahu);

        String replacesahu = sahu.replace("aman" , "samir");
        System.out.println("Your aman is replaced by samir name is :"+replacesahu);

        boolean startsahu = sahu.startsWith("aman" );
        System.out.println(" is starts with aman :"+startsahu);

        boolean endsahu = sahu.endsWith("sahu");
        System.out.println(" is end with sahu :"+endsahu);

        char charsahu = sahu.charAt(0);
        System.out.println("char at [0] is :"+charsahu);

        int indexsahu = sahu.indexOf('s');
        System.out.println("index of 's' is :"+indexsahu);

        int indexssahu = sahu.indexOf('a',4);
        System.out.println("index of 's' after [4] is :"+indexssahu);

        int indexxsahu = sahu.lastIndexOf('s');
        System.out.println("index of 's' is :"+indexxsahu);

        int lastindexssahu = sahu.lastIndexOf('a',4);
        System.out.println("index of 's' before [4] is :"+lastindexssahu);

        boolean equalsahu = sahu.equals("aman" );
        System.out.println("Is string is equal to 'aman' ? :"+equalsahu);

        boolean equalssahu = sahu.equalsIgnoreCase("aman" );
        System.out.println("Is string is equal to 'aman' ? :"+equalssahu);

    }
}