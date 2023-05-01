package Windows;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Employee.Company;
import Manngement.*;
public class button {
    public JPanel pb;
    window win;
    JButton add;
    JButton omit;
    JButton find;
    JButton modify;
    Company c;
    public  button(window w,Company cc)
    {
        c=cc;
        win=w;
        //初始化按钮
        add=new JButton("增加信息");
        omit=new JButton("删除信息");
        find=new JButton("查找信息");
        modify=new JButton("修改信息");
        //初始化面板
        pb=new JPanel();
    }
    public void show()
    {
        pb.setLayout(null);//设置自由布局
        add.setBounds(350,60,90,50);//设置按钮属性
        pb.add(add,JLayeredPane.DEFAULT_LAYER);//把按钮放入面板
        ActionListener a=new add(c);
        add.addActionListener(a);
        //加入监听触发事件
        omit.setBounds(350,120,90,50);
        pb.add(omit,JLayeredPane.DEFAULT_LAYER);
        ActionListener o=new omit(c);
        omit.addActionListener(o);
        //加入监听器触发事件
        find.setBounds(350,180,90,50);
        pb.add(find,JLayeredPane.DEFAULT_LAYER);
        ActionListener f=new find(c);
        find.addActionListener(f);
        //加入监听器触发事件
        modify.setBounds(350,240,90,50);
        pb.add(modify,JLayeredPane.DEFAULT_LAYER);
        ActionListener ch=new change(c);
        modify.addActionListener(ch);
        //加入监听器触发事件
        pb.setOpaque(false);
        win.w.add(pb);
    }
}
