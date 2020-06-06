package facade;

/**
 * 相机外观
 *
 * @author liupf
 * @date 2020-05-31 10:56
 */
public class CameraFacade {

    private Camera camera;

    public CameraFacade () {
        camera = new CameraImpl();
    }

    /**
     * 一键拍摄
     */
    public void shot() {
        //todo 通过动态调整参数，暂时写死
        camera.setAperture(1.2);
        camera.setFocalLength(1.2);
        camera.shutter();
    }
}
