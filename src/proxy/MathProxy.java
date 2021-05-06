package proxy;

public class MathProxy implements MathCalculator {
    private Math math;

    public MathProxy() {
        this.math = new Math();
    }

    @Override
    public double add(double first, double second) {
        if (first / 2 + second / 2 >= Double.MAX_VALUE) {
            throw new RuntimeException("out of range");
        }
        if (first / 2 + second / 2 <= Double.MIN_VALUE) {
            throw new RuntimeException("out of range");
        }
        return math.add(first, second);
    }

    @Override
    public double suv(double first, double second) {
        if (first / 2 - second / 2 >= Double.MAX_VALUE) {
            throw new RuntimeException("out of range");
        }
        if (first / 2 - second / 2 <= Double.MIN_VALUE) {
            throw new RuntimeException("out of range");
        }
        return math.suv(first, second);
    }

    @Override
    public double mul(double first, double second) throws Exception {
        double result = math.mul(first, second);
        if (first != 0 && result / first != second) {
            throw new Exception("out of range");
        }
        return result;
    }

    @Override
    public double div(double first, double second) {
        if (second == 0) {
            throw new RuntimeException("Can't divide by zero");
        }
        return math.div(first, second);
    }
}
