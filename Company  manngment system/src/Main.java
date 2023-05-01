import Employee.*;
import Windows.*;
import Manngement.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        window w=new window(0,0,800,450);
        w.setWindow();
        w.exit();
        Company c=new Company();
        button b=new button(w,c);
        b.show();
        Image img=new Image(w);
        img.background();
        //5
        //高dd 19 15536 3500 男 人事部 部长
        //6dd 19 15536 3500 男 人事部 科长
        //7dd 19 15536 3500 男 开发部 科长
        //8dd 19 15536 3500 男 开发部 部长
        //八dd 19 15537 3500 男 人事部 部长
    }
}