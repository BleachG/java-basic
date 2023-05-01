public class str {
    static char getAt(String a,int index)
    {
        char arr[]=a.toCharArray();
        return arr[index];
    }
    static String reverse(String a)
    {
        char arr[]=a.toCharArray();
        char brr[]=(char[])arr.clone();
        int i=0;
        for (i=0;i<arr.length;i++)
        {
            arr[i]=brr[arr.length-i-1];
        }
        String s=new String(arr);
        return s;
    }
}
