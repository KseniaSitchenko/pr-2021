interface ChildrenActions {
    void makeAnnouncement();
    void changeLocation(Locations place);
    void buyToffees(SweetStore store);
    void giveToffeesToAnother(Child child);
}

interface StatusActions {
    default void throwError() {
        System.out.println("Error: It is impossible to perform required action in this location");
    }
    void showBalance();
}