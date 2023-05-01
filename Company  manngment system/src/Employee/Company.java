package Employee;

import java.io.*;
import java.util.StringTokenizer;

public class Company {
    public depart d[];
    public FileReader fread;
    public BufferedReader bread;
    public FileWriter fwrite;
    public BufferedWriter bwrite;
    public int num;
    public Company ()
    {
          try {
              String filename = "D:\\IntelliJ IDEA 2022.3\\项目\\Company  manngment system\\src\\information.txt";
              fread = new FileReader(filename);
              bread = new BufferedReader(fread);
              String numstring = bread.readLine();
              num = Integer.parseInt(numstring);
              d = new depart[num];
              for (int i = 0; i < num; i++) {
                  StringTokenizer s=new StringTokenizer(bread.readLine());
                  while (s.hasMoreTokens()) {
                      String sname = s.nextToken();
                      int sage =Integer.parseInt(s.nextToken()) ;
                      String SPhone_number = s.nextToken();
                      int salary = Integer.parseInt(s.nextToken());
                      char sex = s.nextToken().charAt(0);
                      String departname = s.nextToken();
                      String personel = s.nextToken();
                      d[i]=new depart(sname,sage,SPhone_number,salary,sex,departname,personel);
                  }
              }
              bread.close();
              fread.close();
          }
          catch (IOException e)
          {
              e.printStackTrace();
          }
    }
    public void updata ()throws IOException
    {
        String filename="D:\\IntelliJ IDEA 2022.3\\项目\\Company  manngment system\\src\\information.txt";
        fwrite=new FileWriter(filename);
        bwrite=new BufferedWriter(fwrite);
        String b=this.num+"";
        bwrite.write(b);
        bwrite.newLine();
        for (int i=0;i<num;i++)
        {
            String a=d[i].name+" "+d[i].age+" "+d[i].Phone_number+" "+d[i].salary+" "+d[i].sex+" "+d[i].departname+" "+d[i].personel;
            bwrite.write(a);
            bwrite.newLine();
        }
        bwrite.close();
        fwrite.close();
    }
}
