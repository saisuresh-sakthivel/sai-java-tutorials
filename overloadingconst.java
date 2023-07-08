class Overloading{
    int age;
    String name;
    public Overloading(){ // default constructor
        age = 12;
        name = "Sai";
    }
    public Overloading(int a,String n){ //parameterized constructor
        age = a;
        name = n;
    }
}
class overloadingconst{
    public static void main (String args[]){
        Overloading over = new Overloading();
        System.out.println(over.age+" : "+over.name);
        Overloading over1 = new Overloading(30,"Green");
        System.out.println(over1.age+" : "+over1.name);
    }
}