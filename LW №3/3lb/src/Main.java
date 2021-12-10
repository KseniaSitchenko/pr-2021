public class Main {
    public static void main(String[] args){
        Child karlsson = new Child(Locations.LILLEBRORS_ROOM, new ChildBalance(0, 0), "Karlsson");
        Child gunilla = new Child(Locations.STREET, new ChildBalance(0, 0), "Gunilla");
        gunilla.makeAnnouncement();
        gunilla.changeLocation(Locations.LILLEBRORS_ROOM);
        SweetStore store = new SweetStore(new ChildBalance(500, 500));
        SweetStore.setPrice(5);
        Child kirre = new Child(Locations.SWEET_STORE, new ChildBalance(Math.round(Math.random() * 100), 0), "Kirre");
        //kirre.showBalance();
        Child bosse = new Child(Locations.SWEET_STORE, new ChildBalance(Math.round(Math.random() * 100), 0), "Bosse");
        //bosse.showBalance();
        Child betan = new Child(Locations.SWEET_STORE, new ChildBalance(Math.round(Math.random() * 100), 0), "Betan");
        //betan.showBalance();
        kirre.buyToffees(store);
        bosse.buyToffees(store);
        betan.buyToffees(store);
        kirre.changeLocation(Locations.LILLEBRORS_ROOM);
        bosse.changeLocation(Locations.LILLEBRORS_ROOM);
        betan.changeLocation(Locations.LILLEBRORS_ROOM);
        kirre.giveToffeesToAnother(gunilla);
        bosse.giveToffeesToAnother(gunilla);
        betan.giveToffeesToAnother(gunilla);
        gunilla.giveToffeesToAnother(karlsson);
    }
}
