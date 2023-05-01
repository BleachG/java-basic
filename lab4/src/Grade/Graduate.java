package Grade;

public class Graduate extends CollageStudent{
    private String name;
    private int age;
    private int Chinese;
    private int Math;
    private int Java;
    Graduate(String n,int a,int C,int M,int J){name=n;age=a;Chinese=C;Math=M;Java=J;}
    @Override
    double sum() {
        return this.Java+this.Math+this.Chinese;
    }

    @Override
    boolean graute() {
        double average=this.sum()/3;
        if (average>240)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
