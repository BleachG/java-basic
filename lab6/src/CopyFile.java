import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
    static void copy(String s,String d)
    {

        try
        {FileReader r=new FileReader(s);
        FileWriter w=new FileWriter(d);
        char c[]=new char[50];
        int n=-1;
        while ((n=r.read(c))!=-1)
        {
            w.write(c,0,n);
        }
        w.close();
        }
        catch (IOException e)
        {
           e.printStackTrace();
        }
    }
}
