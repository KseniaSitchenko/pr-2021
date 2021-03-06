import java.util.Objects;

public class Child implements ChildrenActions, StatusActions{
    private String name;
    private ActualBalance account;
    private Locations place;


    @Override
    public String toString() {
        return "Child's name: " + name + ", balance: " + account + ", child's place: " + place;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, account, place);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Child child)) return false;
        return Objects.equals(name, child.name) && Objects.equals(account, child.account) && Objects.equals(place, child.place);
    }

    Child(Locations place, ActualBalance account, String name) {
        this.name = name;
        this.account = account;
        this.place = place;
    }

    Child(Locations place, ActualBalance account) {
        this.name = "unknown child";
        this.account = account;
        this.place = place;
    }

    @Override
    public void showBalance() {
        if (account != null) System.out.printf("%s's balance is: Ores = %.1f | Toffees = %d \n" , name, account.getBalance(), account.getToffees());
    }

    @Override
    public void makeAnnouncement(){
        if (place.equals(Locations.STREET))
            System.out.printf("%s says: There will be a Great Show \"Evening of Miracles\" in Lillebrors's room\n", name);
    }

    @Override
    public void changeLocation(Locations place){
        this.place = place;
        System.out.printf("%s goes to %s\n", name, place);
    }

    @Override
    public void buyToffees(SweetStore store) {
        if (place.equals(Locations.SWEET_STORE)) {
            if (account.getBalance() >= 5) {
                int x = (int) (account.getBalance() / SweetStore.getToffeePrice());
                account.setToffees(x);
                store.storage.setBalance(store.storage.getBalance() + x * SweetStore.getToffeePrice());
                store.storage.setToffees(store.storage.getToffees() - x);
                System.out.printf("%s buys %d toffees\n", name, x);
                account.setBalance(account.getBalance() - (x * SweetStore.getToffeePrice()));
            } else System.out.printf("%s doesn't have enough money or toffees are sold out\n" , name);
        } else throwError();
    }

    @Override
    public void giveToffeesToAnother(Child child){
        if (place.equals(Locations.LILLEBRORS_ROOM)){
            if (account.getToffees() > 0){
                child.account.setToffees(child.account.getToffees() + account.getToffees());
                System.out.printf("%s gives %d toffees to %s and comes to the Great Show\n", name, account.getToffees(), child.name);
                account.setToffees(0);
            }
            else System.out.printf("%s doesn't have enough toffees to come in\n", name);
        }
        else throwError();
    }
}
