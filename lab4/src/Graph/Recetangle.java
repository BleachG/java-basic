package Graph;

public class Recetangle extends Graph {
    private double width;
    private double height;
    Recetangle(double w,double h){this.height=h;this.width=w;}
    @Override
    double perimter() {
        return 2*(this.height+this.width);
    }

    @Override
    double area() {
        return this.width*this.height;
    }

}
