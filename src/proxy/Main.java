package proxy;

public class Main {
    public static void main(String[] args) {
        MathProxy proxy = new MathProxy();
        double result = proxy.add(1, 2);
        System.out.println(result);
        result = proxy.add(2, Double.MAX_VALUE);
        System.out.println(result);

    }
}
