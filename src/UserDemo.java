public class UserDemo {

    public static void main(String[] args)
    {
        Rice model = retriveRiceFromDatabase();

        RiceView view = new RiceView();

        ServerController controller = new ServerController(model,
                view);

        controller.updateView();
        //You ordering another meal
        controller.setRiceName("Liwet");/*

        controller.updateView();
    }

    private static Rice retriveRiceFromDatabase()
    {
        Rice rice = new Rice();
        rice.setName("Timbel");
        rice.setsideDish("Ayam Bakar");
        rice.setIncludeDrink(true);
        return rice;
    }
}