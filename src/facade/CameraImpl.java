package facade;

/**
 * 相机实现
 *
 * @author liupf
 * @date 2020-05-31 10:59
 */
public class CameraImpl implements Camera {
    @Override
    public void setAperture(double aperture) {
        System.out.println("设置光圈：" + aperture);
    }

    @Override
    public void setFocalLength(double focalLength) {
        System.out.println("设置焦距：" + focalLength);
    }

    @Override
    public void shutter() {
        System.out.println("按快门");
    }
}
