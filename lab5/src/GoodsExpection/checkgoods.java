package GoodsExpection;

public class checkgoods {
    public static void check(goods g)
    {
        try {
            if (g.isDanger()) {
                throw new goodsExpection();
            }
        }
        catch (goodsExpection e)
        {
            e.toprint();
        }
    }
}
