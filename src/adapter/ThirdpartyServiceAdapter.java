package adapter;

/**
 * 第三方接口适配器
 *
 * @author liupf
 * @date 2020-05-31 13:49
 */
public class ThirdpartyServiceAdapter implements Service {

    private ThirdpartyService thirdpartyService;

    public ThirdpartyServiceAdapter() {
        thirdpartyService = new ThirdpartyService();
    }

    @Override
    public void doSerive(int data) {
        String value = String.valueOf(data);
        thirdpartyService.doSomething(value);
    }
}
