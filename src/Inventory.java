import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory
{
    private List guitars;

    public Inventory()
    {
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber ,double price ,Builder builder,String model ,Type type,Wood backWood ,Wood topWood)
    {
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood , topWood);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber)
    {
        for(Iterator i = guitars.iterator() ; i.hasNext();)
        {
            Guitar guitar = (Guitar)i.next();
            if(guitar.getSerialNumber().equals(serialNumber))
            {
                return guitar;
            }
        }
        return null;
    }

    //The search() now returns a list of guitar that matches the specifications
    public List search(Guitar searchGuitar)
    {
        List matchingGuitars = new LinkedList();    // ArrayList can also be used.
        for(Iterator i = guitars.iterator() ; i.hasNext();)
        {
            Guitar guitar = (Guitar)i.next();
            //Ignore serialNumber and price since thats unique

            if (searchGuitar.getBuilder() != guitar.getBuilder())
            {
                continue;
            }

            if( searchGuitar.getType() != guitar.getType())
            {
                continue;
            }

            String model = searchGuitar.getModel().toLowerCase();
            if( (model!= null) && (!model.equals("")) && (!model.equals(guitar.getModel().toLowerCase())) )
            {
                continue;
            }

            if( searchGuitar.getTopWood() != guitar.getTopWood())
            {
                continue;
            }

            if( searchGuitar.getBackWood() != guitar.getBackWood())
            {
                continue;
            }
            matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }
}