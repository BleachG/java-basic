public class point {
    private double x;
    private double y;
    point(){this.x=0;this.y=0;}
    point(double a,double b){this.x=a;this.y=b;}
    double getx(){return this.x;}
    double gety(){return this.y;}
    double distance(point m){
        double sx=(this.x-m.x)*(this.x-m.x);
        double sy=(this.y-m.y)*(this.y-m.y);
        double d=Math.sqrt(sx+sy);
        return d;
    }

}
