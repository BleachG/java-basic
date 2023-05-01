package Graph;

public class Triangle extends Graph{
    private double a;
    private double b;
    private double c;
    Triangle(double a,double b,double c){this.a=a;this.b=b;this.c=c;}
    @Override
    double perimter() {
        return a+b+c;
    }

    @Override
    double area() {
        double p=perimter()/2;
        double s=p*(p-a)*(p-b)*(p-c);
        return Math.sqrt(s);
    }

}
