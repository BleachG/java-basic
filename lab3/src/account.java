import java.util.Scanner;

public class account {
    public String accountname;
    private String name;
    private String password;
    private double money;
    private int age;
    account(String a,String b,String ps,int c,double d){name=a;money=d;age=c;accountname=b;password=ps;}
    void findmoney(){
        System.out.println(this.name+":余额为"+this.money);
    }
    int secure(){
        String input;
        Scanner r=new Scanner(System.in);
        System.out.println("请输入"+this.accountname+"密码");
        input=r.nextLine();
        if (input.equals(this.password))
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    void 取钱(double a){
        if (secure()==1) {
            if (this.money >=a) {
                this.money -= a;
            }
            else
            {
                System.out.println("余额不足");
            }
        }
        else
        {
            System.out.println("密码错误");
            return;
        }
    }
    void 存钱(double a){
        if (secure()==1)
        {
            this.money+=a;
        }
        else
        {
            System.out.println("密码错误");
            return;
        }
    }

}
