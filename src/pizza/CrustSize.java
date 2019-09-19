package pizza;

public enum CrustSize
{
	S(5.99,'S'), M(7.99, 'M'), L(9.99,'L');

	
	private double CrustSizePrice;
	private char size;

	private CrustSize(double price, char sizes)
	{
		size = sizes;
		CrustSizePrice = price;
	}

	public double price()
	{
		return CrustSizePrice;
	}

	public char sizes()
	{
		return size;
	}
}
