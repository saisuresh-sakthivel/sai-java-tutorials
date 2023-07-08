class Human{
    private int age;
    private String name;
    public void setAge(int a){
        age = a;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
       return name;
    }
    public int getAge(){
        return age;
    }
}
public class Encapsulation{
    public static void main(String args[]){
        Human obj = new Human();
        obj.setAge(10);
        obj.setName("sai");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}