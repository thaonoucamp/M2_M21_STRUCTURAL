package proxy;

public class Math implements MathCalculator{
    @Override
    public double add(double first, double second) {
        return first + second;
    }

    @Override
    public double suv(double first, double second) {
        return first - second;
    }

    @Override
    public double mul(double first, double second) {
        return first * second;
    }

    @Override
    public double div(double first, double second) {
        return first / second;
    }
}
