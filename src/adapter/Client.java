package adapter;

/**
 * @author liupf
 * @date 2020-05-31 11:47
 */
public class Client {
    public static void main(String[] args) {
        Service service = new ThirdpartyServiceAdapter();
        service.doSerive(1231);
    }
}
