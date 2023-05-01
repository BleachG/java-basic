package Manngement;
import Employee.Company;
import Employee.depart;

import javax.imageio.IIOException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class add implements ActionListener {
     Company c;
    public add(Company cc)
    {
        this.c=cc;
    }
    public void adddata(String name,int age,String number,int salary,char sex,String dname,String per)
    {
        int addnum=c.num+1;
        depart dm[]=new depart[addnum];
        dm[addnum-1]=new depart(name,age, number,salary,sex,dname,per);
        for (int i=0;i<c.num;i++)
        {
            dm[i]=new depart(c.d[i].name,c.d[i].age,c.d[i].Phone_number,c.d[i].salary,c.d[i].sex,c.d[i].departname,c.d[i].personel);
        }
        c.num=addnum;
        c.d=(depart[])dm.clone();
        try
        {
            c.updata();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e)  {
        JDialog j=new JDialog();
        j.setVisible(true);
        j.setBounds(100,100,600,400);
        j.setLayout(null);
        JLabel jl[]=new JLabel[7];
        JTextField jt[]=new JTextField[7];
        jl[0]=new JLabel("姓名:");
        jl[1]=new JLabel("年龄:");
        jl[2]=new JLabel("电话:");
        jl[3]=new JLabel("部门:");
        jl[4]=new JLabel("职位:");
        jl[5]=new JLabel("工资:");
        jl[6]=new JLabel("性别:");
        JButton b=new JButton("提交");
        b.setBounds(100,300,100,20);
        j.add(b);
        for (int i=0;i<jl.length;i++)
        {
            jl[i].setBounds(0,i*40,50,30);
            jt[i]=new JTextField();
            jt[i].setBounds(40,i*40,160,20);
            j.add(jl[i]);
            j.add(jt[i]);
        }
        j.validate();
        ActionListener A=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String strname= jt[0].getText();
                String strphone= jt[2].getText();
                String strdepart=jt[3].getText();
                String strpersonel= jt[4].getText();
                int intage=Integer.parseInt(jt[1].getText());
                int intsalary= Integer.parseInt(jt[5].getText());
                char csex=jt[6].getText().charAt(0);
                adddata(strname,intage,strphone,intsalary,csex,strdepart,strpersonel);
                JOptionPane.showMessageDialog(null,"增加完成","提示框",JOptionPane.PLAIN_MESSAGE);
            }
        };
        b.addActionListener(A);
    }
}
