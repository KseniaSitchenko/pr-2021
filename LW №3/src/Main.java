public class Main {
    public static void main(String[] args){
        Child karlsson = new Child(Locations.LILLEBRORS_ROOM, new ActualBalance(0, 0), "Karlsson");
        Child gunilla = new Child(Locations.LILLEBRORS_ROOM, new ActualBalance(0, 0), "Gunilla");
        Child krister = new Child(Locations.LILLEBRORS_ROOM, new ActualBalance(0, 0), "Krister");
        Child kirre = new Child(Locations.STREET, new ActualBalance(Math.round(Math.random() * 100), 0), "Kirre");
        Child bosse = new Child(Locations.STREET, new ActualBalance(Math.round(Math.random() * 100), 0), "Bosse");
        Child betan = new Child(Locations.STREET, new ActualBalance(Math.round(Math.random() * 100), 0), "Betan");
        gunilla.changeLocation(Locations.STREET);
        krister.changeLocation(Locations.STREET);
        gunilla.makeAnnouncement();
        krister.makeAnnouncement();
        gunilla.changeLocation(Locations.LILLEBRORS_ROOM);
        krister.changeLocation(Locations.LILLEBRORS_ROOM);
        kirre.changeLocation(Locations.SWEET_STORE);
        bosse.changeLocation(Locations.SWEET_STORE);
        betan.changeLocation(Locations.SWEET_STORE);
        SweetStore store = new SweetStore(new ActualBalance(500, 500));
        SweetStore.setPrice(5);
        kirre.buyToffees(store);
        bosse.buyToffees(store);
        betan.buyToffees(store);
        kirre.changeLocation(Locations.LILLEBRORS_ROOM);
        bosse.changeLocation(Locations.LILLEBRORS_ROOM);
        betan.changeLocation(Locations.LILLEBRORS_ROOM);
        kirre.giveToffeesToAnother(karlsson);
        bosse.giveToffeesToAnother(karlsson);
        betan.giveToffeesToAnother(karlsson);
    }
}
