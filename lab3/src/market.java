import java.util.Scanner;

public class market {
    public goods arr[];
    market(){
        System.out.println("请输入物品数目");
        int m = 0;
        Scanner r = new Scanner(System.in);
        m = r.nextInt();
        arr=new goods[m];
        int i = 0;
        for (i = 0; i < m; i++) {
            double b;
            System.out.println("请输入物品名称");
            String a = r.next();
            System.out.println("请输入物品价格");
            b=r.nextDouble();
            arr[i]=new goods(b,a);
        }
    }
    double sumcost(){
        double sum=0;
        for (goods g:arr){
            sum+=g.getPrice();
        }
        return sum;
    }
    void showlist(){
        for (goods g:arr){
            g.show();
        }
        System.out.println("总计: "+this.sumcost());
    }

}
