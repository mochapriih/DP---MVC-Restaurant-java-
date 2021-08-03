public class RiceView
{
    //what you can see on your table
    public void printRiceDetails(String riceName, String sideDish,
                                  Boolean includeDrink)
    {
        System.out.println("Rice: ");
        System.out.println("Name: " + riceName);
        System.out.println("sideDish Choice: " + sideDish);
        System.out.println("Drink: " + includeDrink);
    }
}