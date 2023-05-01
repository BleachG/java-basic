package Computable;

import java.util.Scanner;

public class compute implements Computable {
    @Override
    public void compute() {
        int a;
        int b;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        int m=a+b;
        System.out.println("相加和为: "+m);
    }

}
