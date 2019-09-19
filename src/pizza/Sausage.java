package pizza;
public class Sausage extends DecoratedPizza{
	

	public Sausage(DecoratedPizza decorToppings)
	{
		super(decorToppings); 
	}

	public double pizzaCost()
	{
		return .99 + super.pizzaCost();
	}

	public String toString()
	{
		return super.toString() + "Sausage";
	}

	public String getImage()
	{
		return super.getImage() + 'S';
	}
}