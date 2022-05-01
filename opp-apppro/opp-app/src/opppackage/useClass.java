package opppackage;

public class useClass {
    public static void main(String[] args) {
        // 创建对象（无参构造器）
        CarClass c1 = new CarClass();
        c1.name = "宝马";
        c1.price = 999999;
        System.out.println(c1.name);
        System.out.println(c1.price);
        c1.startCar();
        c1.runCar();
        CarClass c2 = new CarClass("奔驰", 80);
        c2.runCar();

    }
}
