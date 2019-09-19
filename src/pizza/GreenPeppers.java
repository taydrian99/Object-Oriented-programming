package pizza;


public class GreenPeppers extends DecoratedPizza{
	
	public GreenPeppers(DecoratedPizza decorToppings)
	{
		super(decorToppings);				//key word that calls the parent class
	}

	public double pizzaCost()
	{
		return .69 + super.pizzaCost();
	}

	public String toString()
	{
		return super.toString() + "GreenPeppers";
	}

	public String getImage()
	{
		return super.getImage() + 'G';
	}


}