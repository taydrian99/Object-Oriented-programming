package pizza;
public class Crust
{
	private CrustSize sizesofCrust;
	private CrustType typesofCrust;

	public Crust(CrustSize size, CrustType type)
	{
		sizesofCrust = size;
		typesofCrust = type;
	}

	public double crustCost()
	{ 
		double price = (typesofCrust.price()) + (sizesofCrust.price());
		return price;
	}

	public String getType()
	{
		return typesofCrust.types(); 		
	}

	public char getSize()
	{
		return sizesofCrust.sizes();
	}

	public String toString()
	{
		return getSize()+"\n" + getType() +"\n" ;
		
	}

}