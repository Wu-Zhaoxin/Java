package opppackage;

public class CarClass {
    /**
     成员变量
     */
    String name;
    double price;
//    无参构造器：
    public CarClass() {
        System.out.println("无参");
    };
//    有参构造器：（想要实现在函数括号内输入参数就需要用到有参构造器）
    public CarClass(String user_name, double user_price) {
        System.out.println("有参");
        this.name = user_name;
        this.price = user_price;
        System.out.println(this.name + "的价格为" + this.price + "￥");
        runCar();
    }
    /**
     方法
     */
    public void startCar() {
        System.out.println(name + "启动！");
    }

    public void runCar() {
        System.out.println("价格为：" + price + "的" + name + "跑得很快");
    }
}