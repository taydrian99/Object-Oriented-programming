package pizza;
public class Onions extends DecoratedPizza{

	public Onions(DecoratedPizza decorToppings)
	{
		super(decorToppings);				//key word that calls the parent class
	}

	public double pizzaCost()
	{
		return .79 + super.pizzaCost();
	}

	public String toString()
	{
		return super.toString() + "Onions";
	}

	public String getImage()
	{
		return super.getImage() + 'O';
	}

}
	
