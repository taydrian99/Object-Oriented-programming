package pizza;


public class PizzaFee extends DecoratedPizza
{

    private double cost;
    private String symbol;

    public PizzaFee(DecoratedPizza pizza_component, String msg, double fee)
    {
        super(pizza_component);
        symbol = msg;
        cost = fee;
    }

    public double pizzaCost()
    {
        return (super.pizzaCost() + cost);
    }

    @Override
    public String toString() {
        return (super.toString() + " " + symbol);
    }
}
