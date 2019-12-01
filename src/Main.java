public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        BikeBuilder builder=new BikeBuilder();
        director.constructBmxBike(builder);
        Bike bike=builder.getResult();
        System.out.println("bike-"+bike.getType()+"\nnumber of gears-"+bike.getGears()+"\n"+(bike.getBrake()).getInfo()+"\n"+bike.getSuspension().getInfo());
    }
}
