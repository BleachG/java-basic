package Person;

public class Student extends Person{
    public String id;
    Student(String n,int a,char g,String i){super(n, a, g);this.id=i;}
    String show(){
        String a=super.name+","+super.gender+","+super.age+","+this.id;
        return a;
    }

}
