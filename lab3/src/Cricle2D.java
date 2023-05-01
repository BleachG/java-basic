public class Cricle2D {
    private double x;
    private double y;
    private double r;
    Cricle2D(){x=0;y=0;r=1;}
    Cricle2D(double a,double b,double c){
        x=a;
        y=b;
        r=c;
    }
    double area(){return 3.14*this.r*this.r;}
    double C(){return 6.28*r;}
    boolean contains(Cricle2D cirle){
        double sx=(this.x-cirle.x)*(this.x-cirle.x);
        double sy=(this.y-cirle.y)*(this.y-cirle.y);
        double d=Math.sqrt(sx+sy);
        if (d<Math.abs(this.r-cirle.r))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    boolean overlap(Cricle2D cricle)
    {
        if (cricle.r==this.r&&cricle.x==this.x&&cricle.y==this.y)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
