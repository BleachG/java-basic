package Earings;

public class Company {
    private EmployeeEarings e[];
    private double sum;
    Company()
    {
        e=new EmployeeEarings[10];
        int i=0;
        for (i=0;i<e.length;i++)
        {
            if ((i+1)%2==0)
            {
                e[i]=new YearWorker();
            }
            else
            {
                e[i]=new MonthWorker();
            }
            sum+=e[i].earings();
        }
        System.out.println("总金额为:"+sum);
    }

}
