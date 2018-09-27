package command.version3;

import command.CodeGroup;
import command.Group;
import command.PageGroup;
import command.RequirementGroup;

import java.util.List;

public class Command {
    protected Group rg = new RequirementGroup();
    protected Group cg = new CodeGroup();
    protected Group pg = new PageGroup();

    private List<String> sq;

    public void execute(){
        if(sq != null && sq.size() > 0){

            for (String command : sq) {
                if(command != null && "".equals(command)){
                    continue;
                }
                String[] arr = command.split("\\.");
                if(arr.length < 2){
                    continue;
                }
                Group temp = null;
                if("requirement".equals(arr[0].toLowerCase())){
                    temp = rg;
                } else if("code".equals(arr[0].toLowerCase())){
                    temp = cg;
                } else if("page".equals(arr[0].toLowerCase())){
                    temp = pg;
                }

                if(temp == null){
                    continue;
                }

                if("find".equals(arr[1].toLowerCase())){
                    temp.find();
                } else if("add".equals(arr[1].toLowerCase())){
                    temp.add();
                } else if("delete".equals(arr[1].toLowerCase())){
                    temp.delete();
                } else if("change".equals(arr[1].toLowerCase())){
                    temp.change();
                } else if("plan".equals(arr[1].toLowerCase())){
                    temp.plan();
                }
            }
        }
    };

    public void setSqence(List<String> sqence){
        sq = sqence;
    }
}
