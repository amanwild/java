import java.util.Scanner;
 class inputprogram {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        Scanner cast=new Scanner(System.in);
        Scanner age=new Scanner(System.in);
        Scanner trueorfalse=new Scanner(System.in);
        Scanner percent2=new Scanner(System.in);
        Scanner percent=new Scanner(System.in);

        System.out.println("enter your full name : ");
        String fullname =input.nextLine();

        System.out.println("enter your  cast name : ");
        String my_cast =cast.next();/*if we dont add any data type after cast.next the system take string by default*/

        System.out.println("enter your percent in float : ");
        float my_float =percent.nextFloat();

        System.out.println("enter your percent in double : ");
        double my_double =percent2.nextDouble();

        System.out.println("enter your boolean : ");
        boolean my_boolean =trueorfalse.nextBoolean(); 

        System.out.println("enter your age : ");
        int my_age =age.nextInt();
        input.close();
        cast.close();
        age.close();
        trueorfalse.close();
        percent.close();
        percent2.close();

        System.out.println("Your full name is :"+fullname );
        System.out.println("Your cast is :"+my_cast );
        System.out.println("your percent in float is : "+my_float);
        System.out.println("your percent in double is : "+my_double);
        System.out.println("your boolean is : "+my_boolean);
        System.out.println("Your age is :"+my_age);
        }
}
