package pizza;

public enum CrustType
{
	THIN(0.00,"THIN"), HAND(0.50,"HAND"), PAN(1.00, "PAN");

	private double CrustTypePrice;
	private String type;

	private CrustType(double price, String types )
	{
		type = types;
		CrustTypePrice = price;
	}

	public double price()
	{
		return CrustTypePrice;
	}

	public String types()
	{
		return type;
	}

}