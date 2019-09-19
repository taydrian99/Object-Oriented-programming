package pizza;
public class Mushrooms extends DecoratedPizza{


	public Mushrooms(DecoratedPizza decorToppings)
	{
		super(decorToppings);				//key word that calls the parent class
	}

	public double pizzaCost()
	{
		return .79 + super.pizzaCost();
	}

	public String toString()
	{
		return super.toString() + "Mushrooms";
	}

	public String getImage()
	{
		return super.getImage() + 'M';
	}



}