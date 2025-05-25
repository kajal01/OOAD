public class Guitar
{
    private String serialNumber , model ;
    private double price;
    Builder builder;
    Type type;
    Wood backWood , topWood;

    public Guitar(String serialNumber ,double price ,Builder builder,String model ,Type type,Wood backWood ,Wood topWood)
    {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood ;
        this.topWood = topWood;
    } 

    public String getSerialNumber()
    {
        return serialNumber;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)   
    {
        this.price = price;
    }

    public Builder getBuilder()
    {
        return this.builder;
    }

    public String getModel()
    {
        return this.model;
    }

    public Type getType()
    {
        return this.type;
    }

    public Wood getTopWood()
    {
        return this.topWood;
    }

    public Wood getBackWood()
    {
        return this.backWood;
    }

    
}