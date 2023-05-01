public class goods {
    private double price;
    private String name;
    goods(double a,String b){price=a;name=b;}
    goods(){price=0;name="0";}
    void show(){
        System.out.println(name+": "+price+"$");
    }
    double getPrice(){return this.price;}

}
