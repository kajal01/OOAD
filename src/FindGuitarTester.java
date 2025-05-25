import java.util.Iterator;
import java.util.List;

public class FindGuitarTester
{
    public static void main(String[] args)
    {
       Inventory inventory = new Inventory();
       initializeInventory(inventory);

       Guitar whatErinLikes = new Guitar("" ,  0 , Builder.FENDER, "Stratoscastor" , Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

       List matchingGuitars = inventory.search(whatErinLikes);
       

       if(!matchingGuitars.isEmpty())
       {
            System.out.println("Erin you might like these guitars : ");
            for( Iterator i = matchingGuitars.iterator() ; i.hasNext();)
            {
                Guitar guitar = (Guitar)i.next();

                System.out.println(guitar.getBuilder() + " " + guitar.getModel() + " " + guitar.getType() +" guitar , "+ guitar.getBackWood() + " back and sides " + guitar.getTopWood() + " top. You can have it only for "+guitar.getPrice() + " !" );
            }
            
       }
       else{
        System.out.println("Sorry Erin , we have nothing for you .");
       }

    }

    public static void initializeInventory(Inventory inventory)
    {
        inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratoscastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("V9512", 1549.95, Builder.FENDER, "Stratoscastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        
    }
}