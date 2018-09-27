package command.version3;

import java.util.ArrayList;
import java.util.List;

public class CommandBuild {

    private final static  String REQUIREMENT = "requirement";
    private final static  String PAGE = "page";

    private final static String POINT = ".";

    private final static String FIND = "find";
    private final static String ADD = "add";
    private final static String DELETE = "delete";
    private final static String PLAN = "plan";


    private static Command getCommand(List<String> sq){
        Command command = new Command();
        command.setSqence(sq);
        return command;
    }

    public static Command getAddRequirementCommand(){
        List<String> sq = new ArrayList<>();
        sq.add(REQUIREMENT + POINT +  FIND);
        sq.add(REQUIREMENT + POINT + ADD);
        sq.add(REQUIREMENT + POINT + PLAN);

        sq.add(PAGE + POINT +  FIND);
        sq.add(PAGE + POINT + ADD);
        sq.add(PAGE + POINT + PLAN);

        return getCommand(sq);
    }

    public static Command getDeletePageCommand(){
        List<String> sq = new ArrayList<>();
        sq.add(PAGE + POINT +  FIND);
        sq.add(PAGE + POINT + DELETE);
        sq.add(PAGE + POINT + PLAN);
        return getCommand(sq);
    }

}
