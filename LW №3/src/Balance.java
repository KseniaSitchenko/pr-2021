import java.util.Objects;

abstract class Balance {
    protected double sum;
    Balance(double sum) {
        this.sum = sum;
    }
    public void setBalance(double sum) {
        this.sum = sum;
    }
    public double getBalance() {
        return sum;
    }
    @Override
    public String toString() {
        return "sum: " + sum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sum);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Balance that)) return false;
        return Objects.equals(sum, that.sum);
    }
}
