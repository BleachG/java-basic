package Windows;

import javax.swing.*;

public class Image {
    ImageIcon img;
    window win;
    JLabel back;
    JPanel p;
    public Image(window w)
    {
        img=new ImageIcon("D:\\IntelliJ IDEA 2022.3\\项目\\Company  manngment system\\src\\11.jpg");//读取文件
        win=w;
        back=new JLabel(img);//初始化标签
    }
    public void background()
    {
            back.setIcon(img);//标签可见
            back.setBounds(0,0,800,450);//设置图片属性
            win.w.getLayeredPane().add(back,new Integer(Integer.MIN_VALUE));//把图片添加到最底层做背景
            p=(JPanel)win.con;//设为内容面包
            p.setOpaque(false);//设置透明
             win.flush();
    }
}
