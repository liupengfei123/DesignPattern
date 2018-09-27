package example;

import java.util.HashMap;
import java.util.Map;

public class ShopingOrder {

    private Map<String, Integer> order = new HashMap();

    /**  在原有基础上 增加 商品数量
     * @param goods 商品名称
     * @param num 数量
     */
    public void addGoods(String goods, int num){
        int n = order.get(goods);
        System.out.println(n);
        order.put(goods, num + n);
    }

    /** 重新 添加 该商品数量  （覆盖原有的数量）
     * @param goods 商品名称
     * @param num   数量
     */
    public void reAddGoods(String goods, int num){
        order.put(goods, num);
    }

    /** 清空 商品
     * @param goods 商品名称
     */
    public void removeGoods(String goods){
        order.remove(goods);
    }


    public Integer getOrderNum(String goods){
        return order.get(goods);
    }

    public void clearOrder(){
        order.clear();
    }

    public Map<String, Integer> getOrder(){
        return order;
    }




}
