package example;

public abstract class ShopingHandle {

    public abstract String getGoodsName();

    public void doHandle(Person person){
        ShopingOrder order = person.getShopingOrder();
        int num = order.getOrderNum(getGoodsName());
        if(num > 0){

        }





    }



}
