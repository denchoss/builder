public class Brake {
    private static Brake instance;
    private int number;
    private String type;
    private String info=("number of brake-"+number+" type brake-"+type);
    private Brake(int number,String type){
        this.number=number;
        this.type=type;
    }
    public static Brake getInstance(int number,String type){
        if (instance == null) {
            instance = new Brake(number,type);
        }
        return instance;
    }
    public String getInfo(){
        return info;
    }

}
