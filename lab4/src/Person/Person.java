package Person;

public class Person {
    public String name;
    public int age;
    public char gender;
    Person(String n,int a,char g)
    {
        name=n;
        age=a;
        gender=g;
    }
    String show(){
        String a=this.name+","+this.gender+","+this.age;
        return a;
    }

}
