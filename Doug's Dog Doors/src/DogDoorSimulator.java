public class DogDoorSimulator {
    
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        BarkRecognizer recognizer = new BarkRecognizer(door);
        Remote remote = new Remote(door);

        door.setAllowedBark("woof");
        System.out.println("Fido barks to go outside...");
        //remote.pressButton();
        // BarkRecognizer listens the bark
        recognizer.recognize("woghjf");

        System.out.println("Fido has gone outside...");
        System.out.println("Fido's all done...");

        try{
            Thread.currentThread().sleep(10000);
        }catch (InterruptedException e){}

        System.out.println("..but he is stuck outside !");
        System.out.println("Fido starts barking...");
        // System.out.println("So Gina grabs the remote control ...");
        // remote.pressButton();
        recognizer.recognize("woof");

        System.out.println("Fido's back inside...");
    }
}
