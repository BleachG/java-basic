
 class recetangle {
    private double height;
    private double width;
    recetangle(double a,double b){this.width=a; this.height=b;}
    double area(){return this.height*this.width;}
    double preimeter(){return 2*(this.height+this.width);}
}
 class triangle {
    private double a;
    private double b;
    private double c;
    triangle(double m,double n,double p){this.a=m;this.b=n;this.c=p;}
    double area(){
        double s=this.preimeter()/2;
        return Math.sqrt(s*(s-this.a)*(s-this.b)*(s-this.c));
    }
    double preimeter(){return this.a+this.b+this.c;}
}
 class circle {
    private double r;
    circle(double p){this.r=p;}
    double area(){return this.r*this.r*3.14;}
    double premiter(){return 6.28*this.r;}
}
public class graph {
    void computerecetangle(double a,double b){
        recetangle m=new recetangle(a,b);
        System.out.println("矩形面积:"+m.area()+"矩形周长:"+m.preimeter());
    }
    void computecircle(double a){
        circle m=new circle(a);
        System.out.println("圆形面积:"+m.area()+"圆形周长:"+m.premiter());
    }
    void computetrianglr(double a,double b,double c)
    {
        triangle m=new triangle(a,b,c);
        System.out.println("三角形面积:"+m.area()+"三角形周长:"+m.preimeter());
    }
}

