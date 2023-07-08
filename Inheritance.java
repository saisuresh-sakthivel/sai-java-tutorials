class Basic{
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
}
class Advanced extends Basic{
    public int div(int a,int b){
        return a/b;
    }
    public int mul(int a,int b){
        return a*b;
    }
}
class SuperAdvanced extends Advanced{
    public int mod(int a,int b){
        return a%b;
    }
}
class Inheritance{
    public static void main(String args[]){
        System.out.println("Inheritance");
        Basic obj = new Basic();
        System.out.println("Basic Adding 1, 2 "+obj.add(1,2));
        System.out.println("Basic subtracting 1, 2 "+obj.sub(1,2));
        Advanced obj1 = new Advanced();
        System.out.println("Advanced Adding 1, 2 "+obj1.add(1,2));
        System.out.println("Advanced subtracting 1, 2 "+obj1.sub(1,2));
        System.out.println("Advanced multiplying 1, 2 "+obj1.mul(1,2));
        System.out.println("Advanced division 1, 2 "+obj1.div(1,2));
        SuperAdvanced obj2 = new SuperAdvanced();       
    }
}