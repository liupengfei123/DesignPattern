package command.version2;

public class Invoker {

    private Command cm;


    public void action(){
        this.cm.execute();
    }


    public void setCm(Command cm) {
        this.cm = cm;
    }
}