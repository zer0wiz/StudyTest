package CygnusTest;

/**
 * Created by Neo on 2016-06-30.
 */
public class ByteCompareTest {

    public static void getFieldType(Class c){

        if(c.equals(String.class)){
            System.out.println("String Equals!!!");
        }

        if(c.equals(Integer.class) || c.equals(int.class)){
            System.out.println("Integer Equals!!!");
        }

        if(c.equals(Long.class) || c.equals(long.class)){
            System.out.println("Long Equals!!!");
        }

        if(c.equals(Float.class) || c.equals(float.class)){
            System.out.println("Float Equals!!!");
        }

        if(c.equals(Double.class) || c.equals(double.class)){
            System.out.println("Double Equals!!!");
        }

        if(c.equals(Byte.class) || c.equals(byte.class)){
            System.out.println("Byte Equals!!!");
        }

        if(c.equals(Short.class) || c.equals(short.class)){
            System.out.println("Short Equals!!!");
        }

        if(c.equals(Byte[].class) || c.equals(byte[].class)) {
            System.out.println("Byte[] (Binary) Equals!!!");
        }

    }

    public static void main(String[] args) {
        System.out.println("Test 1!!");
        getFieldType(Byte.class);

        System.out.println("Test 2!!");
        getFieldType(Byte[].class);
    }

}
