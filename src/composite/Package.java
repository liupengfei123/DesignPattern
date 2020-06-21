package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 包裹
 *
 * @author liupf
 * @date 2020-06-21 14:02
 */
public class Package implements Composite {
    //盒子包装费 2 元
    private final static int price = 2;

    private List<Composite> children;

    public Package() {
        children = new ArrayList<>();
    }

    public void add(Composite composite) {
        children.add(composite);
    }

    public void remove(Composite composite) {
        children.remove(composite);
    }

    public List<Composite> getChildren() {
        return children;
    }

    @Override
    public int getPrice() {
        int total = price;
        for (Composite child : children) {
            total += child.getPrice();
        }
        return total;
    }
}
