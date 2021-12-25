public class Main {
    public static void main(String[] args) throws SetToffeesException {
        City city = new City();
        City.Place room = city.new Place(Locations.LILLEBRORS_ROOM, 4);
        City.Place street = city.new Place(Locations.STREET, 3);
        City.Place store = city.new Place(Locations.SWEET_STORE, 1);
        Child karlsson = new Child(room, new ActualBalance(0, 0), "Karlsson");
        Child gunilla = new Child(room, new ActualBalance(0, 0), "Gunilla");
        Child krister = new Child(room, new ActualBalance(0, 0), "Krister");
        Child kirre = new Child(street, new ActualBalance(Math.round(Math.random() * 100), 0), "Kirre");
        Child bosse = new Child(street, new ActualBalance(Math.round(Math.random() * 100), 0), "Bosse");
        Child betan = new Child(street, new ActualBalance(Math.round(Math.random() * 100), 0), "Betan");
        System.out.println(gunilla.changeLocation(street));
        System.out.println(krister.changeLocation(street));

        //анонимный класс для объявления о шоу
        Announcement showAnnouncement = new Announcement() {
            @Override
            public void makeAnnouncement(Child child) {
                System.out.printf("%s says: There will be a Great Show \"Evening of Miracles\" in Lillebrors's room\n", child.name);
            }
        };
        showAnnouncement.makeAnnouncement(gunilla);
        showAnnouncement.makeAnnouncement(krister);

        System.out.println(gunilla.changeLocation(room));
        System.out.println(krister.changeLocation(room));
        System.out.println(kirre.changeLocation(store));
        System.out.println(bosse.changeLocation(store));
        System.out.println(betan.changeLocation(store));
        System.out.println(City.SweetStore.setPrice(5));
        try {
            System.out.println(City.SweetStore.setToffees(600));
        }
        catch (SetToffeesException e){
            System.out.println(City.SweetStore.setToffees(e.getAbsQuantity()));
        }
        System.out.println(kirre.buyToffees());
        System.out.println(bosse.buyToffees());
        System.out.println(betan.buyToffees());
        System.out.println(kirre.changeLocation(room));
        System.out.println(bosse.changeLocation(room));
        System.out.println(betan.changeLocation(room));
        System.out.println(gunilla.takeToffeesFromAnother(kirre));
        System.out.println(gunilla.takeToffeesFromAnother(bosse));
        System.out.println(gunilla.takeToffeesFromAnother(betan));
        System.out.println(gunilla.giveBoxToAnother(karlsson));
        System.out.println(krister.setUpChairs(Child.PlacesInRoom.centre));

    }
}
