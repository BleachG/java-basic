package Manngement;
import Employee.Company;
import Windows.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class find implements ActionListener {
    static public Company c;
    public find(Company cc)
    {
        this.c=cc;
    }
    static public int finddata(String name)
    {
        for (int i=0;i<c.num;i++)
        {
            if (c.d[i].name.equals(name))
            {
                return i;
            }
        }
        return -1;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String str=JOptionPane.showInputDialog(null,"请输入姓名",JOptionPane.PLAIN_MESSAGE);
        int index=this.finddata(str);
        if (index!=-1)
        {
            JDialog j=new JDialog();
            j.setVisible(true);
            j.setBounds(100,100,600,300);
            j.setLayout(null);
            String a=c.d[index].show();
            String c=a;
            JLabel l=new JLabel(c);
            l.setBounds(0,0,600,30);
            j.add(l);
        }
        else
        {
            if (str!=null)
                JOptionPane.showMessageDialog(null,"名字输入有误","提示框",JOptionPane.ERROR_MESSAGE);
        }
    }
}
