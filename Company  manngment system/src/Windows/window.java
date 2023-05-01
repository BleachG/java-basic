package Windows;

import javax.swing.*;
import java.awt.*;

public class window {
    public JFrame w;
    int a;
    int b;
    int width;
    int height;
    Container con;
    public window(int a,int b,int w,int h)
    {
        this.w=new JFrame("人事管理系统");//初始化窗口
        this.a=a;
        this.b=b;
        this.height=h;
        this.width=w;
    }
    public void setWindow()
    {
        this.w.setBounds(a,b,width,height);//设置窗口
        con=this.w.getContentPane();//设置容器
        w.setVisible(true);//设置窗口可见
    }
   public void exit()
    {
        this.w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置×关闭程序
    }
    public void ADD(JLabel J){this.con.add(J);}//把标签添加组件
    public void flush(){this.w.validate();}
}
