package Vehicle;

public class bus implements Vehcile{
    public void start() {
        System.out.println("公共汽车开始走了");
    }

    @Override
    public void stop() {
        System.out.println("公共汽车停下来了");
    }


}
