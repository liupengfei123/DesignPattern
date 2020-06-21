package composite;

/**
 * 书
 *
 * @author liupf
 * @date 2020-06-21 14:06
 */
public class Book implements Composite {
    private final static int price = 10;

    @Override
    public int getPrice() {
        return price;
    }
}
