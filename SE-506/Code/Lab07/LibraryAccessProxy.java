class LibraryAccessProxy implements LibraryAccess {
    private RealLibraryAccess realAccess;
    private LibraryItem item;

    public LibraryAccessProxy(LibraryItem item) {
        this.item = item;
    }

    @Override
    public void accessItem(String itemID, User user) {
        if (item instanceof Book && ((Book) item).isRestricted() && !user.isAdmin()) {
            System.out.println("Access denied: Restricted item '" + item.getDetails() + "' cannot be borrowed by " + user.getName());
        } else {
            if (realAccess == null) {
                realAccess = new RealLibraryAccess(item);
            }
            realAccess.accessItem(itemID, user);
        }
    }
}