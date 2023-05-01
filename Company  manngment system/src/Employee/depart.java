package Employee;

public class depart extends employee implements department{
    public String departname;
    public String personel;
    public depart(String name,int age,String number,int salary,char sex,String dname,String per)
    {
        this.name=name;
        this.age=age;
        this.Phone_number=number;
        this.salary=salary;
        this.sex=sex;
        this.departname=dname;
        this.personel=per;
    }
    public String getdepartmrnt()
    {
        return this.departname;
    }
    public String getpersoel()
    {
        return this.personel;
    }

    @Override
    public String show() {
        String a="姓名:"+this.name+"年龄:"+this.age+"电话号码:"+this.Phone_number+"工资:"+this.salary+"性别:"+this.sex+"部门:"+this.getdepartmrnt()+"职位:"+this.getpersoel();
        return a;
    }
}
