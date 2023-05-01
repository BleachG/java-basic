package Manngement;
import Employee.Company;
import Employee.depart;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import Windows.*;

import javax.swing.*;

public class omit implements ActionListener {
     Company c;
     window win;
    public omit(Company cc)
    {
        this.c=cc;
    }
    public void omitdata(String name)
    {
        int index=find.finddata(name);
        if (index!=-1) {
            int omitnum = c.num;
            depart dm[] = new depart[omitnum];
            for (int i = 0; i < c.num; i++) {
                if (i!=index)
                {
                    dm[i] = new depart(c.d[i].name, c.d[i].age, c.d[i].Phone_number, c.d[i].salary, c.d[i].sex, c.d[i].departname, c.d[i].personel);
                }
                else
                {
                    if (i!=c.num-1)
                    {dm[i] = new depart(c.d[i+1].name, c.d[i+1].age, c.d[i+1].Phone_number, c.d[i+1].salary, c.d[i+1].sex, c.d[i+1].departname, c.d[i+1].personel);
                    i++;}
                }
            }
            c.num--;
            c.d = (depart[]) dm.clone();
        }
        else
        {
            return;
        }
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
    public void actionPerformed(ActionEvent e) {
        String strname= JOptionPane.showInputDialog(null,"请输入姓名",JOptionPane.PLAIN_MESSAGE);
        int index=find.finddata(strname);
        if (index!=-1)
        {
            JOptionPane.showMessageDialog(null,"删除完成","提示框",JOptionPane.PLAIN_MESSAGE);
            omitdata(strname);
        }
        else
        {
            if (strname!=null)
            JOptionPane.showMessageDialog(null,"名字输入有误","提示框",JOptionPane.ERROR_MESSAGE);
        }
    }
}
