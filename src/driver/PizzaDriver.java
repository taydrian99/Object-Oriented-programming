package driver;

import pizza.*;
import util.*;
import java.text.DecimalFormat;

public class PizzaDriver
{

    static double totalCost = 0;

	private static int menu()
    {
        Keyboard kb = Keyboard.getKeyboard();
		int userMenuSelection;
 
        System.out.println("\n1. Meat Lover's");
        System.out.println("2. Veggie Lover's");
        System.out.println("3. Hawaiian");
        System.out.println("4. Build Your Own");
  
		   do{
				userMenuSelection = kb.readInt("\n\n");
				System.out.println(userMenuSelection);
			}while(userMenuSelection <1 || userMenuSelection >4);
		
			return userMenuSelection;
		
	}
   private static void requestSize(PizzaBuilder pizza_builder)
    {
        Keyboard kb = Keyboard.getKeyboard();
        String user = kb.readString("What size pizza (S M L)? ");
        
		System.out.println(user);
        char cc = user.charAt(0);
        boolean stuff= pizza_builder.setSize(cc);
		 while(!stuff)
        {
            user = kb.readString("\nWrong Input what size pizza (S M L)? ");
            System.out.println(user);
            cc = user.charAt(0);
            stuff = pizza_builder.setSize(cc);
        }

		
		
    }

    private static void requestCrust(PizzaBuilder pizza_builder)
    {
        Keyboard kb = Keyboard.getKeyboard();
        String user = kb.readString("What type of crust (thin/hand/pan)? ");
        System.out.println(user);
		boolean stuff= pizza_builder.setCrust(user);
		 while(!stuff)
        {
            user = kb.readString("\n What type of crust (thin/hand/pan)?  ");
            System.out.println(user);
            stuff = pizza_builder.setCrust(user);
        }
		
    }

    private static void requestToppings(PizzaBuilder pizza_builder)
    {
        Keyboard kb = Keyboard.getKeyboard();
        String choice;
        do{
            choice = kb.readString("(P)epperoni,(O)nions,(G)reen Peppers,(S)ausage,(M)ushrooms\n");
            System.out.println(choice);
            char c = choice.charAt(0);
            pizza_builder.addTopping(c);

        } while(!choice.equalsIgnoreCase("d"));

    }

    private static void showOrder(DecoratedPizza dec_pizza)
    {
        System.out.println("Your pizza:");
        String finalpizza = dec_pizza.toString();
		
		DecimalFormat dcformat = new DecimalFormat("0.00");
        String InCost = dcformat.format(dec_pizza.pizzaCost());

        System.out.println(finalpizza);
		
        System.out.println("\n\nThe cost of your pizza $ " + InCost);

    }

    public static void main(String[] args)
    {
        int numberOfPizzas = 0;
        double singleCostOfPizza =0;

		String continuePizza;
		Keyboard kb = Keyboard.getKeyboard();
		String userResponse = kb.readString("Would you like to order a pizza (y/n)? ");
		System.out.println(userResponse);
		
	if (userResponse.equalsIgnoreCase("y")) 
	{
		
				
        do {
                numberOfPizzas++;
                int userInput = menu();
                PizzaBuilder pb = new PizzaBuilder();


                if (userInput == 1)
                {
                    pb = new MeatLovers();
                    requestSize(pb);
                    requestCrust(pb);
                    
				}
				else if (userInput == 2)
                {
                    pb = new VeggieLovers();
                    requestSize(pb);
                    requestCrust(pb);
                }
				
                else if (userInput == 3)
                {
                    pb = new Hawaiian();
                    requestSize(pb);
                    requestCrust(pb);
                }
				else if (userInput == 4)
                {
					pb = new PizzaBuilder();
                    requestSize(pb);
                    requestCrust(pb);
                    requestToppings(pb);
                }

				String seniorCitizenDiscount = kb.readString("\n\nAre you a senior citizen (y/n)? ");
                System.out.println(seniorCitizenDiscount);

                if (seniorCitizenDiscount.equalsIgnoreCase("y"))
                {
                    pb.addDiscount();
                }
				String deliveryRequest = kb.readString("Do you need this pizza delivered (y/n)? ");
                System.out.println(deliveryRequest);

               if (deliveryRequest.equalsIgnoreCase("y"))
                {
                    pb.addFee();
                }


         
                DecoratedPizza p = pb.pizzaDone();
                singleCostOfPizza = p.pizzaCost();
                showOrder(p);


                totalCost += singleCostOfPizza;

               continuePizza = kb.readString("\nWould you like to order another pizza (y/n)? ");
               System.out.println(continuePizza);
	
        } while(continuePizza.equalsIgnoreCase("y"));

	}
        DecimalFormat dc = new DecimalFormat("0.00");
        String finalCost = dc.format(totalCost);

        System.out.println("\nYou ordered " + numberOfPizzas + " pizza(s) for a grand total of $" + finalCost);
    }


}
