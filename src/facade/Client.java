package facade;

/**
 * 外观模式客户端
 *
 * @author liupf
 * @date 2020-05-31 11:03
 */
public class Client {

    public static void main(String[] args) {
        CameraFacade cameraFacade = new CameraFacade();

        cameraFacade.shot();

    }
}
