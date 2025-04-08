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
