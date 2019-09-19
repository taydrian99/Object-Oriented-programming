package pizza;

import java.*;

public class PizzaBuilder
{
    private DecoratedPizza top_link;
    CrustSize crust_size;
    CrustType crust_type;

    protected void buildPizza()
    {
        Crust basic_pizza = new Crust(crust_size, crust_type);
        top_link = new Pizza(basic_pizza);
    }

    public PizzaBuilder()
    {
        crust_size = CrustSize.S;
        crust_type = CrustType.THIN;
        top_link = null;

        buildPizza();
    }

    public boolean setSize(char try_size)
    {
        char upperSize = Character.toUpperCase(try_size);

        if (upperSize == 'S')
        {
            crust_size = CrustSize.S;
            buildPizza();
            return true;
        }
        if (upperSize == 'M')
        {
            crust_size = CrustSize.M;
            buildPizza();
            return true;
        }
        if (upperSize == 'L')
        {
            crust_size = CrustSize.L;
            buildPizza();
            return true;
        }
return false;
    }

    public boolean setCrust(String try_crust)
    {

        if (try_crust.equalsIgnoreCase("THIN"))
        {
            crust_type = CrustType.THIN;
            buildPizza();
            return true;

        }

        if (try_crust.equalsIgnoreCase("HAND"))
        {
            crust_type = CrustType.HAND;
            buildPizza();
            return true;
        }

        if (try_crust.equalsIgnoreCase("PAN"))
        {
            crust_type = CrustType.PAN;
            buildPizza();
            return true;
        }

        return false;
    }

    public void addTopping(char topping_char)
    {
        if (top_link instanceof PizzaDiscount)
        {
            return;
        }


        char topChar = Character.toUpperCase(topping_char);

        if(topChar == 'P')
        {
            top_link = PizzaToppingFactory.addPepperoni(top_link);
        }

       else if(topChar == 'S')
        {
            top_link = PizzaToppingFactory.addSausage(top_link);
        }

       else if(topChar == 'O')
        {
            top_link = PizzaToppingFactory.addOnions(top_link);
        }
       else if(topChar == 'G')
        {
            top_link = PizzaToppingFactory.addGreenPeppers(top_link);
        }

    
       else if(topChar == 'M')
        {
            top_link = PizzaToppingFactory.addMushrooms(top_link);
        }
		
		else if(topChar == 'H')
		{
			top_link = PizzaToppingFactory.addHam(top_link);
		}
		
		
		else if(topChar == 'A')
		{
			top_link = PizzaToppingFactory.addPineapple(top_link);
		}
        else
        {

        }

    }

    public DecoratedPizza pizzaDone()
    {
        DecoratedPizza pizzaDone = top_link;
        crust_size = CrustSize.S;
        crust_type = CrustType.THIN;
        buildPizza();
        return pizzaDone;
    }

    public void addDiscount() 
    {

    if (top_link instanceof PizzaFee) {
        return;
    }

    String message = "Senior Citizens";
    double discount = 0.9;
    top_link = new PizzaDiscount(top_link, message, discount);
    }

    public void addFee() 
    {
        String message = "Delivery";
        double fee = 2.50;
        top_link = new PizzaFee(top_link, message, fee);
    }
}
