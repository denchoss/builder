public class Bike {
    private final Type type;
    private final int gears;
    private final Brake brake;
    private final Suspension suspension;
    public Bike(Type type,int gears,Brake brake,Suspension suspension){
        this.type = type;
        this.gears=gears;
        this.brake = brake;
        this.suspension = suspension;
    }
    public Type getType() {
        return type;
    }
    public int getGears() {
        return gears;
    }
    public Brake getBrake() {
        return brake;
    }
    public Suspension getSuspension() {
        return suspension;
    }
}
