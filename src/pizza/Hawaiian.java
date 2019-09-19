package pizza;


public class Hawaiian extends PizzaBuilder
{

    public Hawaiian()
    {
        super();
        buildPizza();
    }

    public void buildPizza()
    {
        super.buildPizza();
        super.addTopping('H');
        super.addTopping('P');
    }
}
