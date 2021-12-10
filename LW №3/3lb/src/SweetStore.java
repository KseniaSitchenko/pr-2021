import java.util.Objects;

public class SweetStore implements StatusActions {
    private static double toffeePrice;
    protected ChildBalance storage;

    protected static void setPrice(double _toffeePrice){
        toffeePrice = _toffeePrice;
        System.out.println("Price for a toffee is "+ toffeePrice + " Ore");
    }

    protected static double getToffeePrice(){
        return toffeePrice;
    }

    SweetStore(ChildBalance storage){
        this.storage = storage;
        System.out.println("Sweet store is open");
    }

    @Override
    public String toString() {
        return "SweetStore storage = " + storage.getBalance() + " Ores and " + storage.getToffees() + " Toffees";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SweetStore that)) return false;
        return Objects.equals(storage, that.storage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storage);
    }

    @Override
    public void throwError(){
        System.out.println("> In the sweet store you can buy toffees");
    }

    @Override
    public void showBalance(){
        System.out.printf("Balance of Sweet Store is: Ores = %.1f | Toffees = %d \n ", storage.getBalance(), storage.getToffees());
    }
}