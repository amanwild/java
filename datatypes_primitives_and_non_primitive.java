public class datatypes_primitives_and_non_primitive {
    public static void main(String[]args){
        //this are primitive datatypes
        byte byte1=11;
        short short2= 4444;
        int integers= 1234567890;
        boolean is_true=false;
        float float1 = 1;
        double double2=2.22;
        char charecter='A';
        long byte8=1234567890;

        //this are non primitive datatypes and Class is also non primitive datatypes
        int[] int_array ={10,20,30,};
        double[] dbl_array ={1.5,2.5,3.5};
        String[] str_array ={"aman","samir","rajesh"};

        System.out.println(byte1);
        System.out.println(short2);
        System.out.println(byte8);
        System.out.println(double2);
        System.out.println(float1);
        System.out.println(is_true);
        System.out.println(integers);
        System.out.println(charecter);

        for (int i=0;i<int_array.length;i++){
            System.out.println(int_array[i]);
        }
        for (int j=0;j<dbl_array.length;j++){
            System.out.println(dbl_array[j]);
        }
        for (int k=0;k<str_array.length;k++){
            System.out.println(str_array[k]);
        }





    }
    
}
