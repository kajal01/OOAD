public class DogDoorSimulator {
    
    public static void main(String[] args) {
        DogDoor door = new DogDoor();

        door.addAllowedBark(new Bark("rowlf"));
        door.addAllowedBark(new Bark("rooowlf"));
        door.addAllowedBark(new Bark("rawlf"));
        door.addAllowedBark(new Bark("woof"));

        BarkRecognizer recognizer = new BarkRecognizer(door);
        Remote remote = new Remote(door);

        System.out.println("Bruce starts barking..");
        recognizer.recognize(new Bark("rowlf"));

        System.out.println("Bruce has gone outside..");

        try{
            Thread.currentThread().sleep(10000);
        }catch(InterruptedException e) {}


        System.out.println("Bruce all done...");
        System.out.println("...but he's stuck outside.");

        //some other dog barking other than bruce
        Bark smallDogBark = new Bark("yip");
        System.out.println("a small dog starts barking");
        recognizer.recognize(smallDogBark);

        try{
            Thread.currentThread().sleep(10000);
        }catch(InterruptedException e){}

        System.out.println("Bruce starts barking...");
        recognizer.recognize(new Bark("rooowlf"));

        System.out.println("Bruce's back inside...!");

    }
}
