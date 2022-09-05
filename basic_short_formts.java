public class basic_short_formts {
    public static void main(String[]args){
        int x=10,y=10;
        
       
        System.out.println(x);
        System.out.println(x++); //x=x+1 post increment
        System.out.println(x);
        System.out.println(++x);//pre increment
        
      
        System.out.println(y);
        System.out.println(y--); //y=x-1 post decriment
        System.out.println(y);
        System.out.println(--y);//pre decriment

        x=10;
        x *= 5; //x=x*5
        System.out.println("x=x*5 ="+x);

        x=10;
        x /= 5; //x=x/5
        System.out.println("x=x/5 ="+x);

        x=10;
        x += 5; //x=x+5
        System.out.println("x=x+5 ="+x);

        y=10;
        y -= 5; //y=y-5
        System.out.println("y=y-5 ="+y);
    }
}
