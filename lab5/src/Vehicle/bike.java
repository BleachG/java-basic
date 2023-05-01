package Vehicle;

public class bike implements Vehcile{
    @Override
    public void start() {
        System.out.println("自行车开始走了");
    }

    @Override
    public void stop() {
        System.out.println("自行车停下来了");
    }
}
