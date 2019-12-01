public class Suspension {
    private String frontType;
    private String backType;
    public Suspension(String frontType,String backType){
        this.frontType=frontType;
        this.backType=backType;
    }
    public String getInfo(){
        return ("front suspension:"+frontType+" back suspension:"+backType);
    }
}
