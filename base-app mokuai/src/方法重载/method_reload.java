package 方法重载;

public class method_reload {
    public static void main(String[] args) {
        fire();
        fire("American");
        fire("American",3);
    }
    public static void fire() {
        System.out.println("fire!");
    }

    public static void fire(String weizhi) {
        System.out.println("fire to " + weizhi);
    }

    public static void fire(String weizhi, int shuliang) {
        System.out.println("fire to " + weizhi + " with " + shuliang);
    }
}
