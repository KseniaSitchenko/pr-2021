interface ChildrenActions {
    void giveToffeesToAnother(Child child);
    void buyToffees(SweetStore store);
    void makeAnnouncement();
    void changeLocation(Locations place);
}

interface StatusActions {
    default void throwError() {
        System.out.println("Error: It is impossible to perform required action in this location");
    }
    void showBalance();
}