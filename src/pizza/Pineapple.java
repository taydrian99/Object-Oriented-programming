package pizza;


public class Pineapple extends DecoratedPizza {
    private double cost = 0.89;
    private char symbol = 'A';

    public Pineapple(DecoratedPizza dc)
    {
        super(dc);
        cost = 0.99;
        symbol = 'A';
    }

    public double pizzaCost()
    {
        return (super.pizzaCost() + cost);
    }

    public char getSymbol()
    {
        return symbol;
    }

    /*
    public String toString()
    {
        return (super.toString() + " " + name);
    }
    */

    public String getImage()
    {
        return (super.getImage() + symbol);
    }


}
