package composite;

/**
 * @author liupf
 * @date 2020-06-21 14:09
 */
public class Main {
    public static void main(String[] args) {
        Package p1 = new Package();
        p1.add(new Phone());
        p1.add(new Book());
        p1.add(new Phone());
        p1.add(new Book());
        p1.add(new Phone());

        Package p2 = new Package();
        p1.add(new Book());
        p1.add(new Phone());
        p1.add(new Book());
        p1.add(new Phone());

        Package p3 = new Package();
        p1.add(new Book());
        p3.add(p2);
        p1.add(new Phone());
        p3.add(p1);
        p1.add(new Book());
        p1.add(new Phone());

        System.out.println(p3.getPrice());
    }
}
