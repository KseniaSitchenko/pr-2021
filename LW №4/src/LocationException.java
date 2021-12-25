//класс для исключения вида "неверное местонахождение"
public class LocationException extends RuntimeException{
    private Locations place;

    //геттер для возврата местонахождения
    public Locations getLocation(){
        return place;
    }

    //метод для выброса исключения
    public LocationException(City.Place place){
        super("Unacceptable location, " + place);
    }

}