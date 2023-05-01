public class Stuimformation {
    private String id;
    private String name;
    private boolean sex;
    private double age;
    private double Chinese;
    private double math;
    private double english;
    private double javagrade;
    private double expermient;
    void grade(double cg,double mg,double eg,double jg,double exg){
        this.Chinese=cg;
        this.math=mg;
        this.expermient=exg;
        this.english=eg;
        this.javagrade=jg;
    }
    Stuimformation(){grade(0,0,0,0,0);}
    Stuimformation(String i,String n,boolean s,double a,double cg,double mg,double eg,double jg,double exg)
    {
        this.id=i;
        this.name=n;
        this.sex=s;
        this.age=a;
        grade(cg,mg,eg,jg,exg);
    }
    String getname(){return this.name;}
    double getJavagrade(){return this.javagrade;}
    static void sort(Stuimformation s[])
    {
        int i,j=0;
        for (i=0;i<s.length;i++)
            for (j=i;j<s.length-i-1;j++)
            {
                if (s[j].getJavagrade()<s[j+1].getJavagrade())
                {
                    Stuimformation temp=new Stuimformation();
                    temp=s[j+1];
                    s[j+1]=s[j];
                    s[j]=temp;
                }
            }
    }
    static double average(Stuimformation s[]){
        double sum=0;
        int i=0;
        for (i=0;i<s.length;i++)
        {
            sum+=s[i].javagrade;
        }
        sum=sum/s.length;
        return sum;
    }

}
