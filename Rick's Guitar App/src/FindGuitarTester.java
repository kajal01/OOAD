import java.util.Iterator;
import java.util.List;


public class FindGuitarTester
{
    public static void main(String[] args)
    {
       Inventory inventory = new Inventory();
       initializeInventory(inventory);

       GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratoscastor" , Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 12);

       List matchingGuitars = inventory.search(whatErinLikes);
       

       if(!matchingGuitars.isEmpty())
       {
            System.out.println("Erin you might like these guitars : ");
            for( Iterator i = matchingGuitars.iterator() ; i.hasNext();)
            {
                Guitar guitar = (Guitar)i.next();
                GuitarSpec spec = guitar.getSpec();

                System.out.println(spec.getBuilder() + " " + spec.getModel() + " " + spec.getType() +" guitar , "+ spec.getBackWood() + " back and sides " + spec.getTopWood() + " top , " + spec.getNumStrings() + " strings guitar . You can have it only for "+guitar.getPrice() + " !" );
            }
            
       }
       else{
        System.out.println("Sorry Erin , we have nothing for you .");
       }

    }

    public static void initializeInventory(Inventory inventory)
    {
        GuitarSpec spec1 = new GuitarSpec(Builder.FENDER, "Stratoscastor", Type.ELECTRIC,Wood.ALDER , Wood.ALDER , 12);
        inventory.addGuitar("V95693", 1499.95, spec1);
        inventory.addGuitar("V9512", 1549.95, spec1);
        
    }
}