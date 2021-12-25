import java.util.Objects;

//класс для описания ребенка
public class Child implements ChildrenActions{
    protected String name;
    protected ActualBalance account;
    protected City.Place place;

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

    Child(City.Place place, ActualBalance account, String name) {
        this.name = name;
        this.account = account;
        this.place = place;
    }

    Child(City.Place place, ActualBalance account) {
        this.name = "unknown child";
        this.account = account;
        this.place = place;
    }

    //метод для вывода баланса
    public String showBalance() {
            return name + " balance is: Ores = "  +  account.getBalance() + " | Toffees = " + account.getToffees();
    }

    //метод для объявления о событии
    public String makeAnnouncement(){
        if (!place.getTypeOfPlace().equals(Locations.STREET)) throw new LocationException(place);
            return name + " says: There will be a Great Show \"Evening of Miracles\" in Lillebrors's room\n";
    }

    //метод для смены локации
    public String changeLocation(City.Place place){
        this.place = place;
        return name + " goes to " + place.getTypeOfPlace();
    }

    //метод для покупки конфет, может выкинуть ошибку местонахождения, если ребенок не в магазине
    public String buyToffees() {
        if (!place.getTypeOfPlace().equals(Locations.SWEET_STORE)) throw new LocationException(place);
            if (account.getBalance() >= 5) {
                int x = (int) (account.getBalance() / City.SweetStore.getToffeePrice());
                account.setToffees(x);
                City.SweetStore.storage.setBalance(City.SweetStore.storage.getBalance() + x * City.SweetStore.getToffeePrice());
                City.SweetStore.storage.setToffees(City.SweetStore.storage.getToffees() - x);
                account.setBalance(account.getBalance() - (x * City.SweetStore.getToffeePrice()));
                return name + " buys " + x + " toffees";
            } else return name + " doesn't have enough money";
    }

    //метод для отбирания конфет у другого ребенка, может выкинуть ошибку местонахождения, если ребенок не в комнате
    public String takeToffeesFromAnother(Child child){
        if (!child.place.getTypeOfPlace().equals(Locations.LILLEBRORS_ROOM)) throw new LocationException(child.place);
            if (child.account.getToffees() > 0){
                account.setToffees(account.getToffees() + child.account.getToffees());
                child.account.setToffees(0);
                return name + " takes toffees from " + child.name;
            } else return child.name + " doesn't have enough toffees to come in";
    }

    //класс для коробки с конфетами
    class BoxForToffees{
        private int amount;
        BoxForToffees(int amount){
            this.amount = amount;
        }
        //сеттер для установки количества конфет
        public void setAmountOfToffees(int toffeesAmount){
            this.amount = toffeesAmount;
        }
        //геттер для возвращения количесвта конфет
        public int getAmountOfToffees(){
            return amount;
        }
    }

    //метод для складывания конфет в коробку и передачи ее другому ребенку
    public String giveBoxToAnother(Child child){
        BoxForToffees box = new BoxForToffees(account.getToffees());
        account.setToffees(0);
        child.account.setToffees(child.account.getToffees() + box.getAmountOfToffees());
        box.setAmountOfToffees(0);
        return name + " puts toffees in the box and gives it to " + child.name;
    }

    //метод для расстановки стульев, может выкинуть ошибку местонахождения, если ребенок не в комнате
    public String setUpChairs(){
        if (!place.getTypeOfPlace().equals(Locations.LILLEBRORS_ROOM)) throw new LocationException(place);
            return name + " sets up chairs for the audience";
    }
}
