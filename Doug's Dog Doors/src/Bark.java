public class Bark {
    private String sound;

    public Bark( String sound )
    {
        this.sound = sound;
    }

    public String getSound()
    {
        return sound;
    }

    public void setSound(String sound)
    {
        this.sound = sound;
    }

    //comparing this.sound to the sound of the bark received
    public boolean equals(Object bark)
    {
        if (bark instanceof Bark)
        {
            Bark otherBark = (Bark)bark;
            if(this.sound.equalsIgnoreCase(otherBark.sound))
            {
                return true;
            }
        }
        return false;
    }
}
