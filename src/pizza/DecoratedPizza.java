package pizza;

public abstract class DecoratedPizza
{
	
	private DecoratedPizza next_pizza_item;				//gets the next item ex: ham, bacon, pepperoni

	
	public DecoratedPizza()
	{
		next_pizza_item = null;			//key word that calls the parent class
	}

	public DecoratedPizza (DecoratedPizza decorToppings)
	{
		next_pizza_item = decorToppings;                                                                                                                                                                                                                                           
	}

	public double pizzaCost()
	{
		return next_pizza_item.pizzaCost(); 
	}

	public String toString()
	{
		return next_pizza_item.toString();
	}

	public String getImage()
	{
		return next_pizza_item.getImage();
	}

}