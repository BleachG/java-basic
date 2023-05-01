package Graph;

public class Circle extends Graph{
    private double raidous;
    Circle(double r){this.raidous=r;}
    @Override
    double area() {
        return 3.14*this.raidous*this.raidous;
    }

    @Override
    double perimter() {
        return 6.28*this.raidous;
    }

}
