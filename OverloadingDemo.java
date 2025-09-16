// OverloadingDemo.java
public class OverloadingDemo {
    // Overloaded methods (same name, different parameters)
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadingDemo demo = new OverloadingDemo();
        System.out.println("add(int, int): " + demo.add(2, 3));
        System.out.println("add(double, double): " + demo.add(2.5, 3.5));
    }
}