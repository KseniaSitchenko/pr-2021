import java.util.*;

//абстрактый класс для описания баланса
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
        if (o == null || getClass() != o.getClass()) return false;
        Balance balance = (Balance) o;
        return Objects.equals(sum, balance.sum);
    }
}

//класс для описания текущего баланса
class ActualBalance extends Balance {
    private int amount;
    ActualBalance(double sum, int amount) {
        super(sum);
        this.amount = amount;
    }

    //сеттер для установки количества конфет
    public void setToffees(int amount) {
        this.amount = amount;
    }
    //геттер для возврата количества конфет
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
        if (o == null || getClass() != o.getClass()) return false;
        ActualBalance balance = (ActualBalance) o;
        return Objects.equals(sum, balance.sum) && Objects.equals(amount, balance.amount);
    }
}