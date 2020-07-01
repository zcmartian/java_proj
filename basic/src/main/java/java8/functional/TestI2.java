package java8.functional;

public class TestI2 {
    public static void main(String[] args) {
        I2.method1();

        I2 objC2 = new C2();
        I2 objC3 = new C3();

        System.out.println(objC2.method2("hello"));
        System.out.println(objC3.method2("world"));
    }
}

class C2 implements I2 {

    @Override
    public String method2(String x) {
        return x;
    }
}

class C3 implements I2 {

}
