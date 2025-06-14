import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List guitars;

    public Inventory() {
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, double price, GuitarSpec spec) {
        Guitar guitar = new Guitar(serialNumber, price, spec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Iterator i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    // The search() now returns a list of guitar that matches the specifications
    public List search(GuitarSpec searchSpec) {
        List matchingGuitars = new LinkedList(); // ArrayList can also be used.
        for (Iterator i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar) i.next();

            if( guitar.getSpec().matches(searchSpec))
            {
                matchingGuitars.add(guitar);
            }
        }
        return matchingGuitars;
    }

    
}