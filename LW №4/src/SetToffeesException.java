//класс для исключений вида "отрицательное число" приустановки количества
public class SetToffeesException extends Exception{
    private final int quantity;

    //геттер для возврата числа
    public int getAbsQuantity() {
        return quantity;
    }

    //метод для выброса исключения
    public SetToffeesException(int quantity){
        super("You cannot set a negative number of toffees, " + quantity);
        this.quantity = Math.abs(quantity);
    }
}
