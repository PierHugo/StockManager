package Model;

import java.util.ArrayList;

public class Department
{
    int id;
    private ArrayList<Item> items;
    private String name;

    public Department(String nameParam)
    {
        items = new ArrayList<>();
        name = nameParam;
        id = 0;
    }

    public Department(ArrayList<Item> itemsParam, String nameParam, int idParam)
    {
        items = itemsParam;
        name = nameParam;
        id = idParam;
    }

    public ArrayList<Item> getItems()
    {
        return items;
    }

    public void setItems(ArrayList<Item> items)
    {
        this.items = items;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }
}
