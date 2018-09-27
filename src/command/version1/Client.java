package command.version1;

import command.Group;
import command.PageGroup;
import command.RequirementGroup;

/**
 * 场景类  没有使用 命令模式
 */
public class Client {

    public static void main(String[] args) {
        //首先客户找到需求组，
        System.out.println("----------------客户要求增加一项需求------------");

        Group rg = new RequirementGroup();
        //找到需求组
        rg.find();
        //增加一个需求
        rg.add();
        //要求变更计划
        rg.plan();


        System.out.println("-----------------客户要求增加一个页面-----------");

        Group pg = new PageGroup();
        //找到 美工组
        pg.find();
        // 增加一个页面
        pg.add();
        //要求变更计划
        pg.plan();

    }

}
