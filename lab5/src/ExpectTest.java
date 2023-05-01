import java.util.Scanner;

public class ExpectTest {
    static void test()
    {
        try {
            Scanner r=new Scanner(System.in);
            System.out.println("请输入第一个数");
            int a=Integer.parseInt(r.nextLine());
            System.out.println("请输入第二个数");
            int b=Integer.parseInt(r.nextLine());
            int c=a/b;
            System.out.println("结果为:"+c);
        }
        catch (NumberFormatException e)
        {
            System.out.println("数字形式错误");
        }
        catch (ArithmeticException e)
        {
            System.out.println("除数为0");
        }
    }
}
