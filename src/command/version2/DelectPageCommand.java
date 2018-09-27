package command.version2;

public class DelectPageCommand extends Command {
    @Override
    public void execute() {
        super.rg.find();
        super.pg.delete();
        super.pg.plan();
    }
}
