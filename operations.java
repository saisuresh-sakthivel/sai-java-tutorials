class Calculator{
    static String name="Calculator";
    public Calculator(int a, int b){
        System.out.println("I am the constructor");
    }
    public getAandB(){
    }
    public int add(int a, int b){
        return a+b;
    }
}
public class operations{
    public static void main(String args[])
    {
       Calculator calc = new Calculator();
       System.out.println(calc.name);
       int result = calc.add(1,2);
       System.out.println(result);
    }
}