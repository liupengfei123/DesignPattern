package adapter;

/**
 * 第三发服务
 *
 * @author liupf
 * @date 2020-05-31 13:46
 */
public class ThirdpartyService {

    //参数为 String
    public void doSomething(String data) {
        System.out.println("第三方接口被调用" + data);
    }
}
