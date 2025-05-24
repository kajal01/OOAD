public class FindGuitarTester
{
    public static void main(String[] args)
    {
       Inventory inventory = new Inventory();
       initializeInventory(inventory);

       Guitar whatErinLikes = new Guitar("" , 0 , "fender", "Stratocastor" , "electric", "Alder", "Alder");

       Guitar guitar = inventory.search(whatErinLikes);

       if(guitar != null)
       {
            System.out.println("Erin , you might likes this "+guitar.getBuilder() + " " + guitar.getModel() + " " + guitar.getType() +" guitar . "+ guitar.getBackWood() + " back and sides " + guitar.getTopWood() + " top. You can have it only for "+guitar.getPrice() + " !" );
       }
       else{
        System.out.println("Sorry Erin , we have nothing for you .");
       }

    }

    public static void initializeInventory(Inventory inventory)
    {

    }
}