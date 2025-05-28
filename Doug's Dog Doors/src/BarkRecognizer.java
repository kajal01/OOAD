import java.util.Iterator;
import java.util.List;

public class BarkRecognizer {
    private DogDoor door;

    public BarkRecognizer(DogDoor door)
    {
        this.door = door;
    }

    //Maria's way to compare sounds of bark ( delegating to Bark class )
    public void recognize(Bark bark)
    {
        System.out.println("Bark Recognizer heard a "+bark.getSound());

        List allowedBarks = door.getAllowedBarks();
        for(Iterator i = allowedBarks.iterator() ; i.hasNext();)
        {
            Bark allowedBark = (Bark)i.next();
            if(allowedBark.equals(bark))
            {
                door.open();
                return;
            }
        }
        System.out.println("this dog is not allowed");
    }
}
