class Calculator{
    public int add(int a, int b){
        return a+b;
    }
}
public class operations{
    public static void main(String args[])
    {
        int num[] = {1,7,3,4};
        /*
        ** iterating through the loop. 
        */
        for(int j: num){
            System.out.println(j);
        }
        /*
        ** Iterating through the loop via index
        */
       for(int k=0;k<num.length;k++){
           System.out.println("K : "+k);
       }
       Calculator calc = new Calculator();
       int result = calc.add(1,2);
       System.out.println(result);
    }
}