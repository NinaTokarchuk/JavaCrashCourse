package Basic;

public class VolumeOfACuboid {
    public static void main(String []args) {
        System.out.println(getVolumeOfCuboid(2,3, 4));
    }
    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        return length * width * height;
    }
}
