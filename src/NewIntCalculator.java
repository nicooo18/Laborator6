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
    public NewIntCalculator divide(int value) {
        if (value == 0) throw new ArithmeticException("Division by zero");
        this.state /= value;
        return this;
    }

}