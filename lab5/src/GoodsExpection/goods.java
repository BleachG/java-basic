package GoodsExpection;

public class goods {
    public String name;
    public boolean weijin;
   public goods()
    {
        weijin=false;
    }
    public void setIsDanger(boolean b)
    {
        this.weijin=b;
    }
    public boolean isDanger()
    {
        if (weijin)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void setName(String n)
    {
        this.name=n;
    }
    public String getName()
    {
        return this.name;
    }

}
