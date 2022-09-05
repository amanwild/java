public class throw_exception {
public static void main(String[] args) {
    int age =17;
    if (age<18) {
        System.out.println("there is no exception ");        
      
    }
    else{
        System.out.println("here is exception ");
    }
    if (age<18) {
        throw new ArithmeticException("there is exception ")  ;      
    }
    else{
        System.out.println("here is exception ");
    }


 

    }
}