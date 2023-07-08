
public class variables{
    public static void main(String args[])
    {
        //Data Types : Primitive / Non Primitive
        //Primitive
        byte a = 127; // -128 to 127. -2^8 to 2^8-1 byte.
        short b = 200; // 2 bytes.
        int c = 1000; // 4 bytes. 
        boolean	d = true; //true/false	1 bit
        char e = 'a'; //2 byte
        long f = 10000; //8 byte
        float g = 1.2f; // 4 byte
        double h = 234.3; //8 byte
        System.out.println("byte 1 byte : "+a);
        System.out.println("short 2 bytes : "+b);
        System.out.println("int 4 bytes : "+c);
        System.out.println("boolean 1 bit : "+d);
        System.out.println("char 2 bytes : "+e);
        System.out.println("long 8 bytes : "+f);
        System.out.println("float 4 bytes : "+g);
        System.out.println("double 8 bytes : "+h);
        //Data Types : Primitive / Non Primitive
        // Non Primitive
        String cars[]={"volvo","bmw"};
        System.out.println("first element in the array : "+cars[0]);
    }
}