import java.util.*;

public class City {

    private String name = "Stockholm";

    //класс для описания магазина
    public static class SweetStore {
        private static double toffeePrice;
        private static Locations type = Locations.SWEET_STORE;
        private static String storeName = "Sweet Store";
        protected static ActualBalance storage;


        //метод для установки цен
        public static String setPrice(double _toffeePrice){
            toffeePrice = _toffeePrice;
            return storeName + " set price for toffees: Price for one toffee is " + toffeePrice + " Ore";
        }

        //метод для установки количества конфет
        public static String setToffees(int amount) throws SetToffeesException{
            if (amount < 0) throw new SetToffeesException(amount);
            storage = new ActualBalance(500, amount);
            return "Amount of toffees in " + storeName + " is: " + amount;
        }

        //геттер для возврата цены
        public static double getToffeePrice(){
            return toffeePrice;
        }

        //метод для вывода баланса
        public static String showBalance(){
            return "Balance of Sweet Store is: Ores = " + storage.getBalance() + "  | Toffees = " + storage.getToffees();
        }
    }


    //класс для описания нового места/локации
    public class Place {

        private Locations type;
        private double x;

        Place(Locations type, int x){
            this.type = type;
            this.x = x;
        }

        //геттер для возврата типа местности
        public Locations getTypeOfPlace() {
            return type;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Place place = (Place) o;
            return Objects.equals(x, place.x);
        }

        @Override
        public String toString() {
            return "Place: type is " + type + ", x is " + x;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x);
        }
    }
}








