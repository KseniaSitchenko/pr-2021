//интерфейс для действий, выполняемых детьми
interface ChildrenActions{
    //public String makeAnnouncement();
    public String changeLocation(City.Place place);
    public String buyToffees();
    public String takeToffeesFromAnother(Child child);
    public String giveBoxToAnother(Child child);
    public String setUpChairs(Child.PlacesInRoom roomPlace);
}

//интерфейс для создания объявлений
interface Announcement{
    public void makeAnnouncement(Child child);
}