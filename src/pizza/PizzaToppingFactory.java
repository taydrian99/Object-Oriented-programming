package pizza;


public class PizzaToppingFactory
{

    public static DecoratedPizza addPepperoni(DecoratedPizza dec_pizza)
    {
        double topCost = 0.99;
        char symbol = 'P';
        String topping_letter = Character.toString(symbol);
        String topping_string = "Pepperoni";
        return new PizzaTopping(dec_pizza, topping_string, topping_letter, topCost);
    }

    public static DecoratedPizza addMushrooms(DecoratedPizza dec_pizza)
    {
        double topCost = 0.79;
        char symbol = 'M';
        String topping_letter = Character.toString(symbol);
        String topping_string = "Mushrooms";
        return new PizzaTopping(dec_pizza, topping_string, topping_letter, topCost);
    }

    public static DecoratedPizza addOnions(DecoratedPizza dec_pizza)
    {
        double topCost = 0.79;
        char symbol = 'O';
        String topping_letter = Character.toString(symbol);
        String topping_string = "Onions";
        return new PizzaTopping(dec_pizza, topping_string, topping_letter, topCost);
    }

    public static DecoratedPizza addSausage(DecoratedPizza dec_pizza)
    {
        double topCost = 0.99;
        char symbol = 'S';
        String topping_letter = Character.toString(symbol);
        String topping_string = "Sausage";
        return new PizzaTopping(dec_pizza, topping_string, topping_letter, topCost);
    }

    public static DecoratedPizza addGreenPeppers(DecoratedPizza dec_pizza)
    {
        double topCost = 0.69;
        char symbol = 'G';
        String topping_letter = Character.toString(symbol);
        String topping_string = "GreenPeppers";
        return new PizzaTopping(dec_pizza, topping_string, topping_letter, topCost);
    }

    public static DecoratedPizza addHam(DecoratedPizza dec_pizza)
    {
        double topCost = 0.89;
        char symbol = 'H';
        String topping_letter = Character.toString(symbol);
        String topping_string = "Ham";
        return new PizzaTopping(dec_pizza, topping_string, topping_letter, topCost);
    }

    public static DecoratedPizza addPineapple(DecoratedPizza dec_pizza)
    {
        double topCost = 0.89;
        char symbol = 'A';
        String topping_letter = Character.toString(symbol);
        String topping_string = "Pineapple";
        return new PizzaTopping(dec_pizza, topping_string, topping_letter, topCost);
    }
}
