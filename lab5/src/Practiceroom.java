public class Practiceroom {
    String name;
    haitun h;
    Practiceroom(String s)
    {
        this.name=s;
        h=new haitun();
    }
    void practicedance()
    {
        h.dance();
    }
    void practicecry()
    {
        h.cry();
    }
    class haitun{

        void dance(){
            System.out.println(name+": 海豚在跳舞");
        }
        void cry(){
            System.out.println(name+":海豚在叫呼呼");
        }
    }

}
