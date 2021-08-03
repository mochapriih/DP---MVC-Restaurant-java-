public class ServerController
{
    private Rice model;
    private RiceView view;

    public ServerController(Rice model, RiceView view)
    {
        this.model = model;
        this.view = view;
    }


    public void setRiceName(String name)
    {
        model.setName(name);
    }

    public String getRiceName()
    {
        return model.getName();
    }

    public void setRicesideDish(String sideDish)
    {
        model.setsideDish(sideDish);
    }

    public String getRicesideDish()
    {
        return model.getsideDish();
    }

    public void setRiceIncludeDrink(Boolean includeDrink)
    {
        model.setIncludeDrink(includeDrink);
    }

    public Boolean getRiceIncludeDrink()
    {
        return model.getIncludeDrink();
    }

    public void updateView()
    {
        view.printRiceDetails(model.getName(), model.getsideDish(),
                model.getIncludeDrink());
    }
}
