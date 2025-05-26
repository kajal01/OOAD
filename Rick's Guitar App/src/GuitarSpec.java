public class GuitarSpec {
    
    private Builder builder;
    private String model;
    private Type type ;
    private Wood topWood ,backWood;
    private int numStrings;

    public GuitarSpec( Builder builder , String model , Type type , Wood topWood , Wood backWood , int numStrings)
    {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.topWood = topWood;
        this.backWood = backWood;
        this.numStrings = numStrings;
    }

    public Builder getBuilder()
    {
        return builder;
    }

    public String getModel()
    {
        return model;
    }

    public Type getType()
    {
        return type;
    }

    public Wood getTopWood()
    {
        return topWood;
    }

    public Wood getBackWood()
    {
        return backWood;
    }

    public int getNumStrings()
    {
        return numStrings;
    }   

    public boolean matches(GuitarSpec otherSpec) 
    {
        // Ignore serialNumber and price since thats unique
        if ( builder != otherSpec.builder) {
            return false;
        }

        if (type != otherSpec.type) {
            return false;
        }

        if ((model != null) && (!model.equals("")) && (!model.equals(otherSpec.model)) ){
            return false;
        }

        if ( topWood != otherSpec.topWood) {
           return false;
        }

        if (backWood != otherSpec.backWood) {
            return false;
        }

        if( numStrings != otherSpec.numStrings){
            return false;
        }

        return true;
    }
}
