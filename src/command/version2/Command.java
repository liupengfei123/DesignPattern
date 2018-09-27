package command.version2;

import command.CodeGroup;
import command.Group;
import command.PageGroup;
import command.RequirementGroup;

public abstract class Command {
    protected Group rg = new RequirementGroup();
    protected Group cg = new CodeGroup();
    protected Group pg = new PageGroup();

    public abstract void execute();


}
