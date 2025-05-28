public class BarkRecognizer {
    private DogDoor door;

    public BarkRecognizer(DogDoor door)
    {
        this.door = door;
    }

    //Sam's way to compare sounds of bark ( delegating to Bark class )
    public void recognize(Bark bark)
    {
        System.out.println("Bark Recognizer heard a "+bark.getSound());

        if(door.getAllowedBark().equals(bark))
        {
            door.open();
        }
        else
        {
            System.out.println("This dog is not allowed");
        }
    }
}
