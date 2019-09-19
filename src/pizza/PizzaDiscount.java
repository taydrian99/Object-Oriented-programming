package pizza;

public class PizzaDiscount extends DecoratedPizza
{
    String c;
    double costOff;

    public PizzaDiscount(DecoratedPizza pizza_component, String msg, double discount)
    {
        super(pizza_component);
        c = msg;
        costOff = discount;
    }

    public double pizzaCost() {
        return (costOff * (super.pizzaCost()));
    }

    @Override
    public String toString() {
        return (super.toString() + " " + c);
    }
}
