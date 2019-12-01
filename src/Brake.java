public class Brake {
    private int number;
    private String type;
    private String info=("number of brake-"+number+" type brake-"+type);
    public Brake(int number,String type){
        this.number=number;
        this.type=type;
    }
    public String getInfo(){
        return info;
    }

}
