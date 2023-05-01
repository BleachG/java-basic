import java.io.*;

public class LineFile {
    static void AddLine(String s,String d)
    {
        try
        {
            FileWriter w=new FileWriter(d);
            FileReader r=new FileReader(s);
            BufferedWriter bw=new BufferedWriter(w);
            BufferedReader br=new BufferedReader(r);
            String str="";
            int i=1;
            while ((str= br.readLine())!=null)
            {
                str=i+":"+str;
                i++;
                bw.write(str);
                bw.newLine();
            }
            bw.close();
            w.close();
        }
        catch (IOException e)
        {
            e.toString();
        }
    }
}
