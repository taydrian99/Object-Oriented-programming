package pizza;
public class PizzaTopping extends DecoratedPizza
{

    private double cost;
    private String symbol;
    private String name;
    public PizzaTopping(DecoratedPizza pizza_component, String topping_string, String topping_letter, double topping_cost)
    {
        super(pizza_component);
        cost = topping_cost;
        symbol = topping_letter;
        name = topping_string;
    }


	public double pizzaCost()
	{
	return (super.pizzaCost() + cost);
	}

	public String toString()
	{
	return (super.toString() + " " + name + "\n");
	}

	public String getImage()
	{
	return (super.getImage() + symbol);
	}

}
