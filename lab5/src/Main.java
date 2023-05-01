import GoodsExpection.*;
public class Main {
    public static void main(String[] args) {
        goods g=new goods();
        g.setName("炸药");
        g.setIsDanger(true);
        checkgoods.check(g);
    }
}