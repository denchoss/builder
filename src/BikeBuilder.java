public class BikeBuilder implements Builder {
    private Type type;
    private int gears;
    private Brake brake;
    private Suspension suspension;
    @Override
    public void setType(Type type) {
        this.type = type;
    }
    @Override
    public void setNumberOfGears(int gears){
        this.gears=gears;
    }
    @Override
    public void setBrake(Brake brake){
        this.brake = brake;
    }
    @Override
    public void detSuspension(Suspension suspension){
        this.suspension = suspension;
    }

    public Bike getResult(){
        return new Bike(type,gears,brake,suspension);
    }
}
