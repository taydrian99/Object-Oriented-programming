package pizza;
public class Pepperoni extends DecoratedPizza{
	
	public Pepperoni(DecoratedPizza decorToppings)
	{
		super(decorToppings);				//key word that calls the parent class
	}

	public double pizzaCost()
	{
		return .99 + super.pizzaCost();
	}

	public String toString()
	{
		return super.toString() + "Pepperoni";
	}

	public String getImage()
	{
		return super.getImage() + 'P';
	}

}