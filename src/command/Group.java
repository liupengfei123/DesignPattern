package command;

public interface Group {

    //甲乙双方开会办公，如果你要和某个组讨论，你首先要找到这个组
    void find();


    //被要求添加功能
    void add();

    //被要求删除功能
    void delete();


    //被要求修改功能
    void change();


    //被要求给出所有的变更计划
    void plan();


}
