package example.fruits;

public abstract class AFruits {

    private double priace;
    private String name;
    private String date;

    protected AFruits(String name, double priace, String date){
        this.name = name;
        this.priace = priace;
        this.date = date;
    }

    public double getPriace(){
        return priace;
    }


    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }
}
