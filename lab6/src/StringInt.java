public class StringInt {
    static void toprint()
    {
        String s="ab123";
        String sarr[]=s.split("\\D");
        String sum="";
        for (int i=0;i<sarr.length;i++)
        {
            sum+=sarr[i];
        }
        System.out.println(sum);
    }
}
