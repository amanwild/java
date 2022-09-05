public class try_and_catch_pr_6
{
    public static void main(String[] args){
        int val1=5,val2=0;
        try{
            System.out.println("try function starts");
            int div=val1/val2;
            System.out.println(div);
            System.out.println("try function closed");
        }
        catch(ArithmeticException e){
            System.out.println("catch function ends ");
        }
        System.out.println("outside try and catch code end");
        System.out.println();

        String[] car = { "aman0", "aman1", "aman2", "aman3", "aman4" };
        try {
            System.out.println(car[2]);

        } catch (Exception e) {
            System.out.println(e);

        }

        System.out.println("aman0");
        
    }
}