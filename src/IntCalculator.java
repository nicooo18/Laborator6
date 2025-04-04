public class IntCalculator
{
    public int state;
    public IntCalculator(int initialValue)
    {
        this.state = initialValue;
    }

    public IntCalculator add(int value)
    {
        this.state += value;
        return this;
    }

    public IntCalculator subtract(int value)
    {
        this.state -= value;
        return this;
    }

    public IntCalculator multiply(int value)
    {
        this.state *= value;
        return this;
    }

    public int result()
    {
        return this.state;
    }

    public IntCalculator clear()
    {
        this.state = 0;
        return this;
 }
}

abstract class ACalculator<T extends Number> {
    protected T state;

    // Constructor
    public ACalculator(T initialValue) {
        this.state = initialValue;
    }

    // Result method
    public T result() {
        return this.state;
    }

    // Clear method
    public void clear() {
        this.state = init();
    }

    // Abstract method for initialization
    protected abstract T init();
}

class NewIntCalculator extends ACalculator<Integer> {
    public NewIntCalculator(Integer initialValue) {
        super(initialValue);
    }

    @Override
    protected Integer init() {
        return 0;
    }

    public NewIntCalculator add(int value) {
        this.state += value;
        return this;
    }

    public NewIntCalculator subtract(int value) {
        this.state -= value;
        return this;
    }

    public NewIntCalculator multiply(int value) {
        this.state *= value;
        return this;
    }
}

class DoubleCalculator extends ACalculator<Double> {
    public DoubleCalculator(Double initialValue) {
        super(initialValue);
    }

    @Override
    protected Double init() {
        return 0.0;
    }

    public DoubleCalculator add(double value) {
        this.state += value;
        return this;
    }

    public DoubleCalculator subtract(double value) {
        this.state -= value;
        return this;
    }

    public DoubleCalculator multiply(double value) {
        this.state *= value;
        return this;
    }
}

