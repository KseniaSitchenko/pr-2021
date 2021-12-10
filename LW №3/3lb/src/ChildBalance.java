public class ChildBalance extends Balance {
    private int amount;
    ChildBalance(double sum, int amount) {
        super(sum);
        this.amount = amount;
    }
    public void setToffees(int amount) {
        this.amount = amount;
    }
    public int getToffees() {
        return amount;
    }
}