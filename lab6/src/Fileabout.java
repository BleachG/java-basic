import java.io.File;
import java.io.IOException;

public class Fileabout {
    static void init()
    {
        File file=new File("211050100305.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            } else {
                System.out.println("文件已经存在");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("文件长度:"+file.length());
        System.out.println("文件路径:"+file.getPath());
        System.out.println("文件绝对路径::"+file.getAbsolutePath());
        System.out.println("文件是否可读:"+(file.canRead()?"可读":"不可读"));
        System.out.println("文件是否可读:"+(file.canWrite()?"可写":"不可写"));
    }
}
