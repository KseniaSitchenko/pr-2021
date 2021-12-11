import java.util.Objects;

public class ActualBalance extends Balance {
    private int amount;
    ActualBalance(double sum, int amount) {
        super(sum);
        this.amount = amount;
    }
    public void setToffees(int amount) {
        this.amount = amount;
    }
    public int getToffees() {
        return amount;
    }
    @Override
    public String toString() {
        return "sum: " + sum + ", amount: " + amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sum, amount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ActualBalance that)) return false;
        return Objects.equals(sum, that.sum) && Objects.equals(amount, that.amount);
    }
}