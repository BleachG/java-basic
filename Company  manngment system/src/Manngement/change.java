package Manngement;

import Employee.Company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class change implements ActionListener {
    public Company c;
    public change(Company cc)
    {
        this.c=cc;
    }
    public void changedata(int choice,String result,int index)
    {
        switch (choice)
        {
            case 1:
                c.d[index].name=result;
                break;
            case 2:
                c.d[index].age=Integer.parseInt(result);
                break;
            case 3:
                c.d[index].Phone_number=result;
                break;
            case 4:
                c.d[index].salary=Integer.parseInt(result);
                break;
            case 5:
                c.d[index].sex=result.charAt(0);
                break;
            case 6:
                c.d[index].departname=result;
                break;
            case 7:
                c.d[index].personel=result;
                break;
        }
        try {
            c.updata();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String str=JOptionPane.showInputDialog(null,"请输入修改人姓名",JOptionPane.PLAIN_MESSAGE);
        int index=find.finddata(str);
        if (index!=-1) {
            String a = "请输入修改内容:姓名(1),年龄(2),电话(3),工资(4),性别(5),部门(6),职位(7)";
            String diastr = JOptionPane.showInputDialog(null, a, JOptionPane.PLAIN_MESSAGE);
            String result = JOptionPane.showInputDialog(null, "修改后的结果", JOptionPane.PLAIN_MESSAGE);
            int dianum = Integer.parseInt(diastr);
            changedata(dianum,result,index);
            JOptionPane.showMessageDialog(null, "修改完成", "提示框", JOptionPane.PLAIN_MESSAGE);
        }
        else
        {
            if (str!=null)
            JOptionPane.showMessageDialog(null,"姓名错误","提示框",JOptionPane.ERROR_MESSAGE);
        }
    }
}
