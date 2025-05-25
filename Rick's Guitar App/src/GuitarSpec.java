public class GuitarSpec {
    
    private Builder builder;
    private String model;
    private Type type ;
    private Wood topWood ,backWood;

    public GuitarSpec( Builder builder , String model , Type type , Wood topWood , Wood backWood)
    {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.topWood = topWood;
        this.backWood = backWood;
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
}
