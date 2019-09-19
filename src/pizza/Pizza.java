package pizza;
public class Pizza extends DecoratedPizza
{

    private Crust initial_Crust;

    public Pizza(Crust cr)
    {
        super();
        initial_Crust = cr;
    }

    public double pizzaCost()
    {
        return initial_Crust.crustCost();
    }

    public String toString()
    {
        return initial_Crust.toString();
    }

    public String getImage()
    {
        return Character.toString(initial_Crust.getSize());
    }
}
