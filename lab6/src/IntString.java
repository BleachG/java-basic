import java.util.StringTokenizer;

public class IntString {
    static void StringToInt()
    {
        String s="数学87分，物理76分，英语96分";
        s=s.replaceAll("[^0123456789.]","#");
        StringTokenizer tokenizer=new StringTokenizer(s,"#");
        double sum=0;
        double average=0;
        int n=tokenizer.countTokens();
        while (tokenizer.hasMoreTokens())
        {
            sum+=Integer.parseInt(tokenizer.nextToken());
        }
        average=sum/n;
        System.out.println("总分为:"+sum+"平均分为:"+average);
    }
}
