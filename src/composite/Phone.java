package composite;

/**
 * 手机
 * @author liupf
 * @date 2020-06-21 14:06
 */
public class Phone implements Composite {
    private final static int price = 250;

    @Override
    public int getPrice() {
        return price;
    }
}
