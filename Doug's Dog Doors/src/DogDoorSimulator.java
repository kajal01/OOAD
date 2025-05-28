public class DogDoorSimulator {
    
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        BarkRecognizer recognizer = new BarkRecognizer(door);
        //Remote remote = new Remote(door);
        Bark sound = new Bark("woof");

        door.setAllowedBark(sound);

        System.out.println("Fido barks to go outside...");
    
        recognizer.recognize(new Bark("woof"));

        System.out.println("Fido has gone outside...");
        System.out.println("Fido's all done...");

        try{
            Thread.currentThread().sleep(10000);
        }catch (InterruptedException e){}

        System.out.println("..but he is stuck outside !");
        System.out.println("Fido starts barking...");
       
        recognizer.recognize(new Bark("woof"));

        System.out.println("Fido's back inside...");
    }
}
