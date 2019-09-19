package pizza;
public class Ham extends DecoratedPizza {
    private double cost;
    private char symbol;
	
    public Ham(DecoratedPizza dc)
    {
        super(dc);
        cost = 0.99;
        symbol = 'H';
    }

    public double pizzaCost()
    {
        return (super.pizzaCost() + cost);
    }

    public char getSymbol()
    {
        return symbol;
    }

    
    public String toString()
    {
        return super.toString() + " " + "Ham";
    }
    

    public String getImage()
    {
        return (super.getImage() + symbol);
    }


}
