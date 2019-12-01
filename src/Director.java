public class Director {
    public void constructCrossCountryBike(Builder builder){
        builder.setType(Type.CROSS_COUNTRY);
        builder.setNumberOfGears(21);
        builder.setBrake(new Brake(2,"mechanical"));
        builder.detSuspension(new Suspension("soft","hard"));
    }
    public void constructRacingBike(Builder builder){
        builder.setType(Type.RACING);
        builder.setNumberOfGears(16);
        builder.setBrake(new Brake(2,"hydraulic"));
        builder.detSuspension(new Suspension("hard","hard"));
    }
    public void constructBmxBike(Builder builder){
        builder.setType(Type.BMX);
        builder.setNumberOfGears(1);
        builder.setBrake(new Brake(0,"foot"));
        builder.detSuspension(new Suspension("hard","hard"));
    }
}
