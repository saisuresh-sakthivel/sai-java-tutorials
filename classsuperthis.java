class A{
    public A(){
        System.out.println("init A");
    }
    public A(int a){
        this();
        System.out.println("init A"+a);
    }
}
class B extends A{
    public B(){
       super(10);
       System.out.println("init B");
    }
    public B(int n){
       this(); // Call the default constructor as well.
       System.out.println("init B with params"+n);
    }
}
class classsuperthis{
    public static void main(String args[]){
        System.out.println("initializing B without parameter");
        B obj = new B();
        System.out.println("initializing B with parameter");
        B obj1 = new B(10);
    }
}